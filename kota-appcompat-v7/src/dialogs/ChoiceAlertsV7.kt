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
inline fun Context.supportChoiceAlert(
        items: Array<out CharSequence>,
        checked: Int,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        items: Array<out CharSequence>,
        checked: Int,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportChoiceAlert(items, checked, title, action, init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
        @ArrayRes items: Int,
        checked: Int,
        @StringRes titleId: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
        .apply { titleId?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        @ArrayRes items: Int,
        checked: Int,
        @StringRes titleId: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportChoiceAlert(items, checked, titleId, action, init)