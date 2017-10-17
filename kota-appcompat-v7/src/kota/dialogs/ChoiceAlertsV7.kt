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
import android.widget.ListAdapter

@JvmOverloads
inline fun Context.supportChoiceAlert(
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
inline fun Fragment.supportChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
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
inline fun Fragment.supportChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
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
inline fun Fragment.supportChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
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
inline fun Fragment.supportChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
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
inline fun Fragment.supportChoiceAlert(
        title: CharSequence,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
        title: CharSequence,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        title: CharSequence,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
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
inline fun Fragment.supportChoiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.supportChoiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = supportChoiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.supportChoiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context.supportChoiceAlert(title, items, action, *buttons, init = init)