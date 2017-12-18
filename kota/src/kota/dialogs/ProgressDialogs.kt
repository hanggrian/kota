@file:JvmMultifileClass
@file:JvmName("DialogsKt")
@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION", "UNUSED")

package kota

import android.app.Fragment
import android.app.ProgressDialog
import android.app.ProgressDialog.STYLE_HORIZONTAL
import android.content.Context
import android.support.annotation.StringRes

@JvmOverloads
inline fun Context.progressDialog(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = false
            setProgressStyle(STYLE_HORIZONTAL)
            setMessage(message)
            title?.let { setTitle(it) }
            init?.invoke(this)
        }

@JvmOverloads
inline fun Fragment.progressDialog(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.progressDialog(message, title, init)

@JvmOverloads
inline fun Context.progressDialog(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = false
            setProgressStyle(STYLE_HORIZONTAL)
            setMessage(getString(message))
            title?.let { setTitle(it) }
            init?.invoke(this)
        }

@JvmOverloads
inline fun Fragment.progressDialog(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.progressDialog(message, title, init)

@JvmOverloads
inline fun Context.indeterminateProgressDialog(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = true
            setMessage(message)
            title?.let { setTitle(it) }
            init?.invoke(this)
        }

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.indeterminateProgressDialog(message, title, init)

@JvmOverloads
inline fun Context.indeterminateProgressDialog(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = true
            setMessage(getString(message))
            title?.let { setTitle(it) }
            init?.invoke(this)
        }

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.indeterminateProgressDialog(message, title, init)