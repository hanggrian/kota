@file:JvmMultifileClass
@file:JvmName("AlertsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.content.DialogInterface
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes
import android.widget.ListAdapter
import kota.internal.DialogButton
import kota.internal.setButtons

@JvmOverloads
inline fun Context.choiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
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
inline fun Fragment.choiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = choiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.choiceAlert(
        title: CharSequence,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
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
inline fun Fragment.choiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = choiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.choiceAlert(
        @StringRes title: Int,
        items: Array<out CharSequence>,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
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
inline fun Fragment.choiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = choiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.choiceAlert(
        title: CharSequence,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
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
inline fun Fragment.choiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = choiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.choiceAlert(
        @StringRes title: Int,
        @ArrayRes items: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        title: CharSequence,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
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
inline fun Fragment.choiceAlert(
        title: CharSequence,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        title: CharSequence,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = choiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.choiceAlert(
        title: CharSequence,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
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
inline fun Fragment.choiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        checked: Int,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, checked, action, *buttons, init = init)

@JvmOverloads
inline fun Context.choiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = choiceAlert(title, items, -1, action, *buttons, init = init)

@JvmOverloads
inline fun Fragment.choiceAlert(
        @StringRes title: Int,
        items: ListAdapter,
        noinline action: (DialogInterface, Int) -> Unit,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(title, items, action, *buttons, init = init)