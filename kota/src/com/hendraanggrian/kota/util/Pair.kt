package com.hendraanggrian.kota.util

import android.util.Pair

fun <F, S> pairOf(first: F?, second: S?): Pair<F, S> = Pair.create(first, second)

fun <F, S> supportPairOf(first: F?, second: S?): android.support.v4.util.Pair<F, S> = android.support.v4.util.Pair.create(first, second)