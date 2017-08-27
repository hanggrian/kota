@file:JvmName("Texts")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.TextUtils

inline val CharSequence?.isNullOrEmpty: Boolean get() = TextUtils.isEmpty(this)

inline val CharSequence?.isNotNullOrEmpty: Boolean get() = !TextUtils.isEmpty(this)

inline val CharSequence.isGraphic: Boolean get() = TextUtils.isGraphic(this)

inline val CharSequence.isDigitsOnly: Boolean get() = TextUtils.isDigitsOnly(this)