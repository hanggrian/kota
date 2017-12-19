@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build.VERSION.SDK_INT

inline fun Context.isSelfPermissionsGranted(vararg permissions: String): Boolean = if (SDK_INT < 23) false
else permissions.all { checkSelfPermission(it) == PackageManager.PERMISSION_GRANTED }

inline fun Fragment.isSelfPermissionsGranted(vararg permissions: String): Boolean = activity.isSelfPermissionsGranted(*permissions)

inline fun Activity.shouldShowRationales(vararg permissions: String): Boolean = if (SDK_INT < 23) false
else permissions.none { shouldShowRequestPermissionRationale(it) }

inline fun Fragment.shouldShowRationales(vararg permissions: String): Boolean = if (SDK_INT < 23) false
else permissions.none { shouldShowRequestPermissionRationale(it) }