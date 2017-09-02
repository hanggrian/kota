@file:JvmName("TextsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.texts

import android.text.TextUtils

inline val CharSequence?.isEmpty: Boolean get() = TextUtils.isEmpty(this)

inline val CharSequence?.isNotEmpty: Boolean get() = !TextUtils.isEmpty(this)

inline val CharSequence.isGraphic: Boolean get() = TextUtils.isGraphic(this)

inline val CharSequence.isDigitsOnly: Boolean get() = TextUtils.isDigitsOnly(this)

inline val String.htmlEncode get() :String = TextUtils.htmlEncode(this)