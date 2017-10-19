@file:JvmMultifileClass
@file:JvmName("AlertsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.annotation.StringRes
import kota.internal.DialogButton
import kota.internal.setButtons

@JvmOverloads
inline fun Context.alert(
        title: CharSequence,
        message: CharSequence,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.alert(
        title: CharSequence,
        message: CharSequence,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.alert(title, message, *buttons, init = init)

@JvmOverloads
inline fun Context.alert(
        @StringRes title: Int,
        message: CharSequence,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.alert(
        @StringRes title: Int,
        message: CharSequence,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.alert(title, message, *buttons, init = init)

@JvmOverloads
inline fun Context.alert(
        title: CharSequence,
        @StringRes message: Int,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog {
    val dialog = AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setButtons(*buttons)
            .create()
    init?.invoke(dialog)
    dialog.show()
    return dialog
}

@JvmOverloads
inline fun Fragment.alert(
        title: CharSequence,
        @StringRes message: Int,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.alert(title, message, *buttons, init = init)