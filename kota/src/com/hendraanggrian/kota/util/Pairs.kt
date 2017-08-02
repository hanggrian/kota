@file:JvmName("Pairs")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.util

import android.util.Pair

inline fun <F, S> pairOf(first: F?, second: S?) = Pair.create(first, second)!!

inline fun <F, S> supportPairOf(first: F?, second: S?) = android.support.v4.util.Pair.create(first, second)!!