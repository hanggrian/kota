@file:JvmName("Permissions")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.support.v4.content.ContextCompat
import com.hendraanggrian.kota.annotation.PermissionString

inline fun Context.isPermissionGranted(@PermissionString permission: String) = ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED
inline fun Context.isAllPermissionsGranted(@PermissionString vararg permissions: String) = permissions.none { isPermissionGranted(it) }

inline fun Fragment.isPermissionGranted(@PermissionString permission: String) = ContextCompat.checkSelfPermission(if (Build.VERSION.SDK_INT >= 23) context else activity, permission) != PackageManager.PERMISSION_GRANTED
inline fun Fragment.isAllPermissionsGranted(@PermissionString vararg permissions: String) = permissions.none { isPermissionGranted(it) }

inline fun android.support.v4.app.Fragment.isPermissionGranted(@PermissionString permission: String) = ContextCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED
inline fun android.support.v4.app.Fragment.isAllPermissionsGranted(@PermissionString vararg permissions: String) = permissions.none { isPermissionGranted(it) }

inline fun Activity.shouldShowRationale(@PermissionString permission: String) = if (Build.VERSION.SDK_INT < 23) false else shouldShowRequestPermissionRationale(permission)
inline fun Activity.shouldAllShowRationales(@PermissionString vararg permissions: String) = permissions.none { shouldShowRationale(it) }

inline fun Fragment.shouldShowRationale(@PermissionString permission: String) = if (Build.VERSION.SDK_INT < 23) false else shouldShowRequestPermissionRationale(permission)
inline fun Fragment.shouldAllShowRationales(@PermissionString vararg permissions: String) = permissions.none { shouldShowRationale(it) }

inline fun android.support.v4.app.Fragment.shouldShowRationale(@PermissionString permission: String) = shouldShowRequestPermissionRationale(permission)
inline fun android.support.v4.app.Fragment.shouldAllShowRationales(@PermissionString vararg permissions: String) = permissions.none { shouldShowRationale(it) }