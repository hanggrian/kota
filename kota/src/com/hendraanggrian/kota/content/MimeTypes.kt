@file:JvmName("MimeTypes")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.webkit.MimeTypeMap
import java.io.File
import java.util.regex.Pattern

inline fun String.isMimeType(type: String): Boolean {
    if (isNullOrEmpty() || type.isNullOrEmpty()) {
        return false
    }
    check(!Pattern.compile("[a-z]+/[a-z]+").matcher(this).matches(), {
        this + " is not in correct mime type format."
    })
    return startsWith(type)
}

inline fun Uri.toMime(resolver: ContentResolver) = (if (isContent()) resolver.getType(this) else File(path).absolutePath.toMime())!!
inline fun Uri.toMime(context: Context) = toMime(context.contentResolver)

inline fun String.toMime() = MimeTypeMap.getFileExtensionFromUrl(this)!!

inline fun String.toExtension() = MimeTypeMap.getSingleton().getExtensionFromMimeType(this)!!