@file:JvmName("SparseLongArray")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.collection

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.util.SparseLongArray

@RequiresApi(18)
@TargetApi(18)
inline fun SparseLongArray.containsKey(key: Int) = indexOfKey(key) > -1

@RequiresApi(18)
@TargetApi(18)
inline fun SparseLongArray.containsValue(value: Long) = indexOfValue(value) > -1