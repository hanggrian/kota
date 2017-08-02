@file:JvmName("TextUtils2")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.TextUtils

/**
 * Shadowing [kotlin.text.isNullOrEmpty] to use Android's [TextUtils].
 */
inline fun CharSequence?.isNullOrEmpty() = TextUtils.isEmpty(this)

inline fun CharSequence?.isNotNullOrEmpty() = !TextUtils.isEmpty(this)

inline fun CharSequence.isGraphic() = TextUtils.isGraphic(this)

inline fun CharSequence.isDigitsOnly() = TextUtils.isDigitsOnly(this)