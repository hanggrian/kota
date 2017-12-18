@file:JvmMultifileClass
@file:JvmName("DialogsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.AlertDialog
import android.app.Fragment
import android.content.Context
import android.content.DialogInterface
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes

@JvmOverloads
inline fun Context.multiChoiceAlert(
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
inline fun Fragment.multiChoiceAlert(
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(items, checked, title, action, init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
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
inline fun Fragment.multiChoiceAlert(
        @ArrayRes items: Int,
        checked: BooleanArray?,
        @StringRes title: Int? = null,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(items, checked, title, action, init)