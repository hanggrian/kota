@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.webkit.MimeTypeMap.getFileExtensionFromUrl
import android.webkit.MimeTypeMap.getSingleton
import java.io.File

inline val String.mimeType: String get() = getFileExtensionFromUrl(this)

inline val String.mimeExtension: String get() = getSingleton().getExtensionFromMimeType(this)

inline fun Uri.getMimeType(resolver: ContentResolver): String = if (isContent) resolver.getType(this) else File(path).absolutePath.mimeType
inline fun Uri.getMimeType(context: Context): String = getMimeType(context.contentResolver)