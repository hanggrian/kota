package com.hendraanggrian.kota.text

import android.text.SpannedString

fun CharSequence.toSpannedString(): SpannedString = SpannedString.valueOf(this)