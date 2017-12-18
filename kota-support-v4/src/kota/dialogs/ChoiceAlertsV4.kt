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
inline fun Fragment.choiceAlert(
        items: Array<out CharSequence>,
        checked: Int,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.choiceAlert(items, checked, title, action, init)

@JvmOverloads
inline fun Fragment.choiceAlert(
        @ArrayRes items: Int,
        checked: Int,
        @StringRes titleId: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.choiceAlert(items, checked, titleId, action, init)