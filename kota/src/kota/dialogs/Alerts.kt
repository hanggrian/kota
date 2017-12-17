@file:JvmMultifileClass
@file:JvmName("AlertsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.AlertDialog
import android.app.Fragment
import android.content.Context
import android.support.annotation.StringRes
import kota.internal.DialogDsl

fun asd(context: Context) {
    context.alert("") {
        setTitle("")
        setOKButton {

        }
    }.show()

    AlertDialog.Builder(context)
            .setTitle("")
            .setOKButton()
            .show()
}

@JvmOverloads
inline fun Context.alert(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = AlertDialog.Builder(this)
        .setMessage(message)
        .apply {
            title?.let { setTitle(it) }
            init?.invoke(this)
        }

@JvmOverloads
inline fun Fragment.alert(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = activity.alert(message, title, init)

@JvmOverloads
inline fun Context.alert(
        @StringRes message: Int,
        title: CharSequence? = null,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = AlertDialog.Builder(this)
        .setMessage(message)
        .apply {
            title?.let { setTitle(it) }
            init?.invoke(this)
        }

@JvmOverloads
inline fun Fragment.alert(
        @StringRes message: Int,
        title: CharSequence? = null,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = activity.alert(message, title, init)

@JvmOverloads
inline fun Context.alert(
        message: CharSequence,
        @StringRes title: Int,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = AlertDialog.Builder(this)
        .setMessage(message)
        .setTitle(title)
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.alert(
        message: CharSequence,
        @StringRes title: Int,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = activity.alert(message, title, init)

@JvmOverloads
inline fun Context.alert(
        @StringRes message: Int,
        @StringRes title: Int,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = AlertDialog.Builder(this)
        .setMessage(message)
        .setTitle(title)
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.alert(
        @StringRes message: Int,
        @StringRes title: Int,
        noinline init: ((@DialogDsl AlertDialog.Builder).() -> Unit)? = null
): AlertDialog.Builder = activity.alert(message, title, init)