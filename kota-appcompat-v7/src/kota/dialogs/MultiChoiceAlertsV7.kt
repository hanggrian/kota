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
inline fun Context.supportMultiChoiceAlert(
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportMultiChoiceAlert(items, checked, title, action, init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        @ArrayRes items: Int,
        checked: BooleanArray?,
        @StringRes title: Int? = null,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        @ArrayRes items: Int,
        checked: BooleanArray?,
        @StringRes title: Int? = null,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportMultiChoiceAlert(items, checked, title, action, init)