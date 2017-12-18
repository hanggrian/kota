@file:JvmMultifileClass
@file:JvmName("DialogsV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes
import android.support.v4.app.Fragment

@JvmOverloads
inline fun Fragment.itemsAlert(
        items: Array<out CharSequence>,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.itemsAlert(items, title, action, init)

@JvmOverloads
inline fun Fragment.itemsAlert(
        @ArrayRes items: Int,
        @StringRes titleId: Int? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.itemsAlert(items, titleId, action, init)