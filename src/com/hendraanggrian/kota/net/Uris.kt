/*
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.hendraanggrian.kota.net

import android.content.ContentResolver
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract
import android.provider.MediaStore

object Uris {

    const val SCHEME_HTTP = "http"
    const val SCHEME_HTTPS = "https"
    const val SCHEME_FILE = ContentResolver.SCHEME_FILE
    const val SCHEME_CONTENT = ContentResolver.SCHEME_CONTENT
    const val SCHEME_ASSET = "asset"
    const val SCHEME_RESOURCE = "res"
    const val SCHEME_QUALIFIED_RESOURCE = ContentResolver.SCHEME_ANDROID_RESOURCE
    const val SCHEME_DATA = "data"
}

fun Uri.isNetwork(): Boolean = scheme.let { it == Uris.SCHEME_HTTPS || it == Uris.SCHEME_HTTP }

fun Uri.isFile(): Boolean = scheme == Uris.SCHEME_FILE

fun Uri.isContent(): Boolean = scheme == Uris.SCHEME_CONTENT

fun Uri.isContact(): Boolean = isContent()
        && ContactsContract.AUTHORITY == authority
        && !path.startsWith(Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo").path)

fun Uri.isCamera(): Boolean = toString().let { it.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || it.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString()) }

fun Uri.isAsset(): Boolean = scheme == Uris.SCHEME_ASSET

fun Uri.isResource(): Boolean = scheme == Uris.SCHEME_RESOURCE

fun Uri.isQualifiedResource(): Boolean = scheme == Uris.SCHEME_QUALIFIED_RESOURCE

fun Uri.isData(): Boolean = scheme == Uris.SCHEME_DATA

fun Uri.getActualPath(context: Context): String? = getActualPath(context.contentResolver)
fun Uri.getActualPath(resolver: ContentResolver): String? {
    var result: String? = null
    if (isContent()) {
        var cursor: Cursor? = null
        try {
            cursor = resolver.query(this, null, null, null, null)
            if (cursor != null && cursor.moveToFirst()) {
                val idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
                if (idx != -1)
                    result = cursor.getString(idx)
            }
        } finally {
            if (cursor != null)
                cursor.close()
        }
    } else if (isFile()) {
        result = path
    }
    return result
}

/**
 * Build Uri from resource id.
 */
fun Int.toUri(): Uri = Uri.Builder()
        .scheme(Uris.SCHEME_RESOURCE)
        .path(toString())
        .build()

/**
 * Build Uri from qualified resource id.
 */
fun Int.toUri(context: Context): Uri = toUri(context.packageName)

fun Int.toUri(packageName: String): Uri = Uri.Builder()
        .scheme(Uris.SCHEME_QUALIFIED_RESOURCE)
        .authority(packageName)
        .path(toString())
        .build()