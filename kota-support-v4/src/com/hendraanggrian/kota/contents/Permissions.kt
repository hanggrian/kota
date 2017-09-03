@file:JvmName("SupportPermissionsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.contents

import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.app.Fragment
import android.support.v4.content.PermissionChecker

inline fun Context.isCallingPermissionsGranted(packageName: String, vararg permissions: String): Boolean {
    require(permissions.isNotEmpty())
    return permissions.all { PermissionChecker.checkCallingPermission(this, it, packageName) == PackageManager.PERMISSION_GRANTED }
}

inline fun android.app.Fragment.isCallingPermissionsGranted(packageName: String, vararg permissions: String): Boolean = activity.isCallingPermissionsGranted(packageName, *permissions)

inline fun Fragment.isCallingPermissionsGranted(packageName: String, vararg permissions: String): Boolean = context.isCallingPermissionsGranted(packageName, *permissions)

inline fun Fragment.isSelfPermissionsGranted(vararg permissions: String): Boolean = context.isSelfPermissionsGranted(*permissions)

inline fun Fragment.shouldShowRationales(vararg permissions: String): Boolean {
    require(permissions.isNotEmpty())
    return permissions.none { shouldShowRequestPermissionRationale(it) }
}