@file:JvmName("SpannedStrings")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.SpannedString

inline fun CharSequence.toSpannedString() = SpannedString.valueOf(this)!!