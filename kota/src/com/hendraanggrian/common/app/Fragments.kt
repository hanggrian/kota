@file:JvmName("Fragments")
@file:Suppress("NOTHING_TO_INLINE")

package com.hendraanggrian.common.app

import android.app.Fragment
import android.content.Context
import com.hendraanggrian.common.os.getIfMinSdk

fun Fragment.getContext2(): Context = getIfMinSdk(23, { context }, { activity })