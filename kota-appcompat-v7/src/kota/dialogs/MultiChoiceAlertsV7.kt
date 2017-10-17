@file:JvmMultifileClass
@file:JvmName("AlertsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.content.Context
import android.content.DialogInterface
import android.database.Cursor
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatDialog

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportMultiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportMultiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportMultiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMultiChoiceItems(items, checked, DialogInterface.OnMultiChoiceClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: BooleanArray?,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportMultiChoiceAlert(title, items, null, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        title: CharSequence,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMultiChoiceItems(items, isCheckedColumn, labelColumn, DialogInterface.OnMultiChoiceClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        title: CharSequence,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, isCheckedColumn, labelColumn, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportMultiChoiceAlert(
        @StringRes title: Int,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMultiChoiceItems(items, isCheckedColumn, labelColumn, DialogInterface.OnMultiChoiceClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportMultiChoiceAlert(
        @StringRes title: Int,
        items: Cursor,
        isCheckedColumn: String,
        labelColumn: String,
        noinline action: (DialogInterface, Int, Boolean) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportMultiChoiceAlert(title, items, isCheckedColumn, labelColumn, action, *buttons, init = init)