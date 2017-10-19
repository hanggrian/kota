@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.TextUtils
import android.util.Printer

inline val CharSequence?.isEmpty: Boolean get() = TextUtils.isEmpty(this)
inline val CharSequence?.isNotEmpty: Boolean get() = !TextUtils.isEmpty(this)

inline val CharSequence.isGraphic: Boolean get() = TextUtils.isGraphic(this)
inline val CharSequence.isDigitsOnly: Boolean get() = TextUtils.isDigitsOnly(this)

inline val String.htmlEncode get() :String = TextUtils.htmlEncode(this)

@JvmOverloads
inline fun CharSequence.dumpSpans(printer: Printer, prefix: String = "") = TextUtils.dumpSpans(this, printer, prefix)