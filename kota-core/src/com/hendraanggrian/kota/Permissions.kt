@file:JvmName("Permissions")
@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.hendraanggrian.kota

/*inline fun Context.isPermissionsGranted(vararg permissions: String): Boolean = permissions.none { ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED }
inline fun Fragment.isPermissionsGranted(vararg permissions: String): Boolean = permissions.none { ContextCompat.checkSelfPermission(context, it) != PackageManager.PERMISSION_GRANTED }

inline fun Activity.shouldShowRationales(vararg permissions: String): Boolean = getIfAtLeast(23, { permissions.none { shouldShowRequestPermissionRationale(it) } }, { false })
inline fun Fragment.shouldShowRationales(vararg permissions: String): Boolean = getIfAtLeast(23, { permissions.none { shouldShowRequestPermissionRationale(it) } }, { false })*/