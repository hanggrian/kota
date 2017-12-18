@file:JvmMultifileClass
@file:JvmName("DialogsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.Context
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog

@JvmOverloads
inline fun Context.supportAlert(
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportAlert(
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportAlert(init)

@JvmOverloads
inline fun Context.supportAlert(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setMessage(message)
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportAlert(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportAlert(message, title, init)

@JvmOverloads
inline fun Context.supportAlert(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setMessage(message)
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.supportAlert(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.supportAlert(message, title, init)