@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.TextUtils.*
import android.util.Printer

inline val CharSequence?.isEmpty: Boolean get() = isEmpty(this)
inline val CharSequence?.isNotEmpty: Boolean get() = !isEmpty(this)

inline val CharSequence.isGraphic: Boolean get() = isGraphic(this)
inline val CharSequence.isDigitsOnly: Boolean get() = isDigitsOnly(this)

inline val String.htmlEncode get() :String = htmlEncode(this)

@JvmOverloads
inline fun CharSequence.dumpSpans(printer: Printer, prefix: String = "") = dumpSpans(this, printer, prefix)