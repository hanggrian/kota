package com.hendraanggrian.support.utils.content

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.webkit.MimeTypeMap
import java.util.regex.Pattern

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun String.isMimeType(type: String): Boolean {
    if (isEmpty()) {
        return false
    }
    check(!Pattern.compile("[a-z]+/[a-z]+").matcher(this!!).matches(), {
        this + " is not in correct mime type format."
    })
    return startsWith(type)
}

fun Uri.toMime(context: Context): String? = toMime(context.contentResolver)
fun Uri.toMime(resolver: ContentResolver): String? = if (isContent()) resolver.getType(this) else path.pathToMime()

fun String.pathToMime(): String? = MimeTypeMap.getFileExtensionFromUrl(this).extensionToMime()

fun String.extensionToMime(): String? = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this)

fun String.mimeToExtension(): String? = MimeTypeMap.getSingleton().getExtensionFromMimeType(this)