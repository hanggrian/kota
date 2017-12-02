@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.support.annotation.RequiresApi
import android.text.Html.escapeHtml
import android.text.TextUtils.*

inline val CharSequence?.isEmpty: Boolean get() = isEmpty(this)
inline val CharSequence?.isNotEmpty: Boolean get() = !isEmpty(this)
inline val CharSequence.isGraphic: Boolean get() = isGraphic(this)
inline val CharSequence.isDigitsOnly: Boolean get() = isDigitsOnly(this)

inline val String.htmlEncode: String get() = htmlEncode(this)

inline val CharSequence.escapeHtml: String @RequiresApi(16) get() = escapeHtml(this)