package com.hendraanggrian.kota.util

import android.util.SparseBooleanArray

fun SparseBooleanArray.hasKey(key: Int): Boolean = indexOfKey(key) > -1

fun SparseBooleanArray.hasValue(value: Boolean): Boolean = indexOfValue(value) > -1