@file:JvmMultifileClass
@file:JvmName("AlertsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.content.DialogInterface
import android.database.Cursor
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes
import kota.internal.DialogButton
import kota.internal.setButtons

@JvmOverloads
inline fun Context.multiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = multiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = multiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = multiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = multiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        title: CharSequence,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setMultiChoiceItems(items, isCheckedColumn, labelColumn, DialogInterface.OnMultiChoiceClickListener(action))
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        title: CharSequence,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, isCheckedColumn, labelColumn, action, *buttons, init = init)

@JvmOverloads
inline fun Context.multiChoiceAlert(
        @StringRes title: Int,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setMultiChoiceItems(items, isCheckedColumn, labelColumn, DialogInterface.OnMultiChoiceClickListener(action))
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.multiChoiceAlert(
        @StringRes title: Int,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (dialog: DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.multiChoiceAlert(title, items, isCheckedColumn, labelColumn, action, *buttons, init = init)