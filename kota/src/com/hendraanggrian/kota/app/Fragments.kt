@file:JvmName("Fragments")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.app

import android.app.Fragment
import android.content.Context
import com.hendraanggrian.kota.os.getIfMinSdk

fun Fragment.getContext2(): Context = getIfMinSdk(23, { context }, { activity })