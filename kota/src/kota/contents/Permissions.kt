@file:JvmName("PermissionsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.contents

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.pm.PackageManager
import kota.VERSION_M
import kota.getIfAtLeast

@SuppressLint("NewApi")
inline fun Context.isSelfPermissionsGranted(vararg permissions: String): Boolean = getIfAtLeast(VERSION_M,
        { permissions.all { checkSelfPermission(it) == PackageManager.PERMISSION_GRANTED } },
        { false })

inline fun Fragment.isSelfPermissionsGranted(vararg permissions: String): Boolean = activity.isSelfPermissionsGranted(*permissions)

@SuppressLint("NewApi")
inline fun Activity.shouldShowRationales(vararg permissions: String): Boolean = getIfAtLeast(VERSION_M,
        { permissions.none { shouldShowRequestPermissionRationale(it) } },
        { false })

@SuppressLint("NewApi")
inline fun Fragment.shouldShowRationales(vararg permissions: String): Boolean = getIfAtLeast(VERSION_M,
        { permissions.none { shouldShowRequestPermissionRationale(it) } },
        { false })