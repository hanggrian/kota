@file:JvmName("PackageManagers")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.content

import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import com.hendraanggrian.kota.annotation.PermissionString

inline fun Context.isPermissionsGranted(@PermissionString vararg permissions: String): Boolean {
    check(permissions.isNotEmpty(), { "Need input!" })
    return permissions.none {
        ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
    }
}

inline fun IntArray.isPermissionsGranted(): Boolean {
    check(isNotEmpty(), { "Need input!" })
    return none {
        it != PackageManager.PERMISSION_GRANTED
    }
}