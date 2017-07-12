/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

package com.hendraanggrian.support.utils.content

import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import com.hendraanggrian.support.utils.annotation.PermissionString

fun Context.isGranted(@PermissionString vararg permissions: String): Boolean = permissions.none {
    ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
}

fun Array<Int>.isGranted(): Boolean = none {
    it != PackageManager.PERMISSION_GRANTED
}