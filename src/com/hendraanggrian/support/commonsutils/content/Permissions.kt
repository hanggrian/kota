package com.hendraanggrian.support.commonsutils.content

import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import com.hendraanggrian.support.commonsutils.annotation.PermissionString

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun Context.isGranted(@PermissionString vararg permissions: String): Boolean = permissions.none {
    ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
}

fun IntArray.isGranted(): Boolean = none {
    it != PackageManager.PERMISSION_GRANTED
}