@file:JvmMultifileClass
@file:JvmName("DialogsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.AlertDialog
import android.app.Fragment
import android.content.Context
import android.support.annotation.StringRes

@JvmOverloads
inline fun Context.alert(
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.alert(
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = activity.alert(init)

@JvmOverloads
inline fun Context.alert(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setMessage(message)
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.alert(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = activity.alert(message, title, init)

@JvmOverloads
inline fun Context.alert(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setMessage(message)
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.alert(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = activity.alert(message, title, init)