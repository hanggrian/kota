/*
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
@file:JvmName("Uris")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.content.ContentResolver
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract
import android.provider.MediaStore

const val SCHEME_HTTP = "http"
const val SCHEME_HTTPS = "https"
const val SCHEME_FILE = ContentResolver.SCHEME_FILE
const val SCHEME_CONTENT = ContentResolver.SCHEME_CONTENT
const val SCHEME_ASSET = "asset"
const val SCHEME_RESOURCE = "res"
const val SCHEME_QUALIFIED_RESOURCE = ContentResolver.SCHEME_ANDROID_RESOURCE
const val SCHEME_DATA = "data"

inline val Uri.isNetwork: Boolean get() = scheme.let { it == SCHEME_HTTPS || it == SCHEME_HTTP }
inline val Uri.isFile: Boolean get() = scheme == SCHEME_FILE
inline val Uri.isContent: Boolean get() = scheme == SCHEME_CONTENT
inline val Uri.isContact: Boolean
    get() = isContent
            && ContactsContract.AUTHORITY == authority
            && !path.startsWith(Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo").path)
inline val Uri.isCamera: Boolean get() = toString().let { it.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || it.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString()) }
inline val Uri.isAsset: Boolean get() = scheme == SCHEME_ASSET
inline val Uri.isResource: Boolean get() = scheme == SCHEME_RESOURCE
inline val Uri.isQualifiedResource: Boolean get() = scheme == SCHEME_QUALIFIED_RESOURCE
inline val Uri.isData: Boolean get() = scheme == SCHEME_DATA

inline fun Uri.getActualPath(context: Context) = getActualPath(context.contentResolver)
inline fun Uri.getActualPath(resolver: ContentResolver): String? {
    var result: String? = null
    if (isContent) {
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
    } else if (isFile) {
        result = path
    }
    return result
}

/**
 * Build Uri from resource id.
 */
inline fun Int.toUri() = Uri.Builder()
        .scheme(SCHEME_RESOURCE)
        .path(toString())
        .build()!!

/**
 * Build Uri from qualified resource id.
 */
inline fun Int.toUri(context: Context) = toUri(context.packageName)

inline fun Int.toUri(packageName: String) = Uri.Builder()
        .scheme(SCHEME_QUALIFIED_RESOURCE)
        .authority(packageName)
        .path(toString())
        .build()!!