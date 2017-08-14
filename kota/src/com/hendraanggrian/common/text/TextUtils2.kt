@file:JvmName("TextUtils2")
@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.common.text

import android.text.TextUtils

/**
 * Shadowing [kotlin.text.isNullOrEmpty] to use Android's [TextUtils].
 */
inline fun CharSequence?.isNullOrEmpty(): Boolean = TextUtils.isEmpty(this)

inline fun CharSequence?.isNotNullOrEmpty(): Boolean = !TextUtils.isEmpty(this)

inline fun CharSequence.isGraphic(): Boolean = TextUtils.isGraphic(this)

inline fun CharSequence.isDigitsOnly(): Boolean = TextUtils.isDigitsOnly(this)