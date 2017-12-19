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
inline fun Fragment.multiChoiceAlert(
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int, selected: Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.multiChoiceAlert(items, checked, title, action, init)

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        @ArrayRes items: Int,
        checked: BooleanArray?,
        @StringRes title: Int? = null,
        noinline action: (dialog: DialogInterface, Int, selected: Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.multiChoiceAlert(items, checked, title, action, init)