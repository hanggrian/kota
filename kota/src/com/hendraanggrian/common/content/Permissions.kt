@file:JvmName("Permissions")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.content

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import com.hendraanggrian.common.app.getContext2
import com.hendraanggrian.common.os.getIfMinSdk

inline fun Context.isPermissionsGranted(vararg permissions: String): Boolean = permissions.none { ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED }
inline fun Fragment.isPermissionsGranted(vararg permissions: String): Boolean = permissions.none { ContextCompat.checkSelfPermission(getContext2(), it) != PackageManager.PERMISSION_GRANTED }
inline fun android.support.v4.app.Fragment.isPermissionsGranted(vararg permissions: String): Boolean = permissions.none { ContextCompat.checkSelfPermission(context, it) != PackageManager.PERMISSION_GRANTED }

inline fun Activity.shouldShowRationales(vararg permissions: String): Boolean = getIfMinSdk(23, { permissions.none { shouldShowRequestPermissionRationale(it) } }, { false })
inline fun Fragment.shouldShowRationales(vararg permissions: String): Boolean = getIfMinSdk(23, { permissions.none { shouldShowRequestPermissionRationale(it) } }, { false })
inline fun android.support.v4.app.Fragment.shouldShowRationales(vararg permissions: String): Boolean = permissions.none { shouldShowRequestPermissionRationale(it) }