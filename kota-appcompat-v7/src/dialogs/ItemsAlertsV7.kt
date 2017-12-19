@file:JvmMultifileClass
@file:JvmName("DialogsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.Context
import android.content.DialogInterface
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog

@JvmOverloads
inline fun Context.supportItemsAlert(
        items: Array<out CharSequence>,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setItems(items, DialogInterface.OnClickListener(action))
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportItemsAlert(
        items: Array<out CharSequence>,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportItemsAlert(items, title, action, init)

@JvmOverloads
inline fun Context.supportItemsAlert(
        @ArrayRes items: Int,
        @StringRes titleId: Int? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setItems(items, DialogInterface.OnClickListener(action))
        .apply { titleId?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportItemsAlert(
        @ArrayRes items: Int,
        @StringRes titleId: Int? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportItemsAlert(items, titleId, action, init)