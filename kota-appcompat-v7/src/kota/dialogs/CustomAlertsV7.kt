@file:JvmMultifileClass
@file:JvmName("AlertsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.content.Context
import android.support.annotation.LayoutRes
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatDialog
import android.view.View
import kota.internal.DialogButton
import kota.internal.setButtons

@JvmOverloads
inline fun Context.supportCustomAlert(
        title: CharSequence,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
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
inline fun Fragment.supportCustomAlert(
        title: CharSequence,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context!!.supportCustomAlert(title, view, *buttons, init = init)

@JvmOverloads
inline fun Context.supportCustomAlert(
        @StringRes title: Int,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
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
inline fun Fragment.supportCustomAlert(
        @StringRes title: Int,
        view: View,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context!!.supportCustomAlert(title, view, *buttons, init = init)

@JvmOverloads
inline fun Context.supportCustomAlert(
        title: CharSequence,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
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
inline fun Fragment.supportCustomAlert(
        title: CharSequence,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context!!.supportCustomAlert(title, view, *buttons, init = init)

@JvmOverloads
inline fun Context.supportCustomAlert(
        @StringRes title: Int,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
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
inline fun Fragment.supportCustomAlert(
        @StringRes title: Int,
        @LayoutRes view: Int,
        vararg buttons: DialogButton,
        noinline init: (AppCompatDialog.() -> Unit)? = null
): AlertDialog = context!!.supportCustomAlert(title, view, *buttons, init = init)