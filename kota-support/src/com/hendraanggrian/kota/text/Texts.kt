@file:JvmName("SupportTexts")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.support.v4.text.TextUtilsCompat

inline val String.htmlEncode get() :String = TextUtilsCompat.htmlEncode(this)