package com.hendraanggrian.kota.text

import android.text.TextUtils

fun CharSequence.isGraphic(): Boolean = TextUtils.isGraphic(this)

fun CharSequence.isDigitsOnly(): Boolean = TextUtils.isDigitsOnly(this)