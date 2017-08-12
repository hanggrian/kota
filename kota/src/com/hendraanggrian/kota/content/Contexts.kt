@file:JvmName("Contexts")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.app.Fragment
import android.content.Context
import com.hendraanggrian.kota.app.getContext2

@Suppress("UNCHECKED_CAST") inline fun <T> Context.getSystemService2(name: String): T = getSystemService(name) as T
@Suppress("UNCHECKED_CAST") inline fun <T> Fragment.getSystemService2(name: String): T = (getContext2()).getSystemService(name) as T
@Suppress("UNCHECKED_CAST") inline fun <T> android.support.v4.app.Fragment.getSystemService2(name: String): T = context.getSystemService(name) as T