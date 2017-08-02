@file:JvmName("Services")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.app

import android.app.ActivityManager
import android.app.Service
import android.content.Context

@Suppress("deprecation")
inline fun Context.isServiceRunning(serviceClass: Class<out Service>): Boolean {
    val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    return manager.getRunningServices(Integer.MAX_VALUE).any { serviceClass.name == it.service.className }
}