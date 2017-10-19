@file:JvmMultifileClass
@file:JvmName("AlertsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.content.Context
import android.content.DialogInterface
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatDialog
import kota.internal.DialogButton
import kota.internal.setButtons

@JvmOverloads
inline fun Context.supportItemsAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setItems(items, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportItemsAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportItemsAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportItemsAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setItems(items, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportItemsAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportItemsAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportItemsAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setItems(items, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportItemsAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportItemsAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportItemsAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setItems(items, DialogInterface.OnClickListener(action))
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.supportItemsAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportItemsAlert(title, items, action, *buttons, init = init)