package com.hendraanggrian.kota.content

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.webkit.MimeTypeMap
import java.util.regex.Pattern

fun String.isMimeType(type: String): Boolean {
    if (isNullOrEmpty() || type.isNullOrEmpty()) {
        return false
    }
    check(!Pattern.compile("[a-z]+/[a-z]+").matcher(this).matches(), {
        this + " is not in correct mime type format."
    })
    return startsWith(type)
}

fun Uri.toMime(context: Context): String = toMime(context.contentResolver)
fun Uri.toMime(resolver: ContentResolver): String = if (isContent()) resolver.getType(this) else toMime(resolver)
fun String.toMime(): String = MimeTypeMap.getFileExtensionFromUrl(this)

fun String.toExtension(): String? = MimeTypeMap.getSingleton().getExtensionFromMimeType(this)