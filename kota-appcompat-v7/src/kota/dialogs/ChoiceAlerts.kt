@file:JvmMultifileClass
@file:JvmName("SupportAlertsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.content.Context
import android.content.DialogInterface
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatDialog
import android.widget.ListAdapter

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportSingleChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportSingleChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportSingleChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportSingleChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        title: CharSequence,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        title: CharSequence,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportSingleChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Context.supportSingleChoiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportSingleChoiceAlert(title, items, -1, action, *buttons, init = init)