@file:JvmName("Intents")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager

inline fun Intent.isAvailable(pm: PackageManager) = resolveActivity(pm) != null
inline fun Intent.isAvailable(context: Context) = isAvailable(context.packageManager)

inline fun Intent.isNotAvailable(pm: PackageManager) = resolveActivity(pm) == null
inline fun Intent.isNotAvailable(context: Context) = isNotAvailable(context.packageManager)