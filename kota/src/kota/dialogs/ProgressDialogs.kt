@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION", "UNUSED")

package kota.dialogs

import android.app.Fragment
import android.app.ProgressDialog
import android.content.Context
import android.support.annotation.StringRes

@JvmOverloads
inline fun Context.progressDialog(
        title: CharSequence,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = false
            setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
            setTitle(title)
            setMessage(message)
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.progressDialog(
        title: CharSequence,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.progressDialog(title, message, init)

@JvmOverloads
inline fun Context.progressDialog(
        @StringRes title: Int,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = false
            setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
            setTitle(title)
            setMessage(message)
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.progressDialog(
        @StringRes title: Int,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.progressDialog(title, message, init)

@JvmOverloads
inline fun Context.progressDialog(
        title: CharSequence,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = false
            setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
            setTitle(title)
            setMessage(getString(message))
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.progressDialog(
        title: CharSequence,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.progressDialog(title, message, init)

@JvmOverloads
inline fun Context.progressDialog(
        @StringRes title: Int,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = false
            setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
            setTitle(title)
            setMessage(getString(message))
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.progressDialog(
        @StringRes title: Int,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.progressDialog(title, message, init)

@JvmOverloads
inline fun Context.indeterminateProgressDialog(
        title: CharSequence,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = true
            setTitle(title)
            setMessage(message)
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        title: CharSequence,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.indeterminateProgressDialog(title, message, init)

@JvmOverloads
inline fun Context.indeterminateProgressDialog(
        @StringRes title: Int,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = true
            setTitle(title)
            setMessage(message)
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        @StringRes title: Int,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.indeterminateProgressDialog(title, message, init)

@JvmOverloads
inline fun Context.indeterminateProgressDialog(
        title: CharSequence,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = true
            setTitle(title)
            setMessage(getString(message))
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        title: CharSequence,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.indeterminateProgressDialog(title, message, init)

@JvmOverloads
inline fun Context.indeterminateProgressDialog(
        @StringRes title: Int,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = ProgressDialog(this)
        .apply {
            isIndeterminate = true
            setTitle(title)
            setMessage(getString(message))
            init?.invoke(this)
            show()
        }

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        @StringRes title: Int,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = activity.indeterminateProgressDialog(title, message, init)