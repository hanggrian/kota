package com.hendraanggrian.kota.content

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager

fun Intent.isAvailable(pm: PackageManager): Boolean = resolveActivity(pm) != null
fun Intent.isAvailable(context: Context): Boolean = isAvailable(context.packageManager)

fun Intent.isNotAvailable(pm: PackageManager): Boolean = resolveActivity(pm) == null
fun Intent.isNotAvailable(context: Context): Boolean = isNotAvailable(context.packageManager)