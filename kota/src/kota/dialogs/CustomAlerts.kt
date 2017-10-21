@file:JvmMultifileClass
@file:JvmName("AlertsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.annotation.LayoutRes
import android.support.annotation.RequiresApi
import android.support.annotation.StringRes
import android.view.View
import kota.internal.DialogButton
import kota.internal.setButtons

@JvmOverloads
inline fun Context.customAlert(
        title: CharSequence,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setView(view)
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.customAlert(
        title: CharSequence,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.customAlert(title, view, *buttons, init = init)

@JvmOverloads
inline fun Context.customAlert(
        @StringRes title: Int,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setView(view)
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.customAlert(
        @StringRes title: Int,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.customAlert(title, view, *buttons, init = init)

@RequiresApi(21)
@JvmOverloads
inline fun Context.customAlert(
        title: CharSequence,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setView(view)
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@RequiresApi(21)
@JvmOverloads
inline fun Fragment.customAlert(
        title: CharSequence,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.customAlert(title, view, *buttons, init = init)

@RequiresApi(21)
@JvmOverloads
inline fun Context.customAlert(
        @StringRes title: Int,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setTitle(title)
        .setView(view)
        .setButtons(*buttons)
        .create()
        .apply {
            init?.invoke(this)
            show()
        }

@RequiresApi(21)
@JvmOverloads
inline fun Fragment.customAlert(
        @StringRes title: Int,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (Dialog.() -> Unit)? = null
): AlertDialog = activity.customAlert(title, view, *buttons, init = init)