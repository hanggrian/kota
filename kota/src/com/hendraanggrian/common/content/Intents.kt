@file:JvmName("Intents")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.content

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager

inline fun Intent.isAvailable(pm: PackageManager): Boolean = resolveActivity(pm) != null
inline fun Intent.isAvailable(context: Context): Boolean = resolveActivity(context.packageManager) != null

inline fun Intent.isNotAvailable(pm: PackageManager): Boolean = resolveActivity(pm) == null
inline fun Intent.isNotAvailable(context: Context): Boolean = resolveActivity(context.packageManager) == null