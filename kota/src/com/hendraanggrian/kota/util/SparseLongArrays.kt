package com.hendraanggrian.kota.util

import android.annotation.TargetApi
import android.support.annotation.RequiresApi
import android.util.SparseLongArray

@RequiresApi(18)
@TargetApi(18)
fun SparseLongArray.hasKey(key: Int): Boolean = indexOfKey(key) > -1

@RequiresApi(18)
@TargetApi(18)
fun SparseLongArray.hasValue(value: Long): Boolean = indexOfValue(value) > -1