@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION", "UNUSED")

package kota.dialogs

import android.app.ProgressDialog
import android.support.annotation.StringRes
import android.support.v4.app.Fragment

@JvmOverloads
inline fun Fragment.progressDialog(
        title: CharSequence,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.progressDialog(title, message, init)

@JvmOverloads
inline fun Fragment.progressDialog(
        @StringRes title: Int,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.progressDialog(title, message, init)

@JvmOverloads
inline fun Fragment.progressDialog(
        title: CharSequence,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.progressDialog(title, message, init)

@JvmOverloads
inline fun Fragment.progressDialog(
        @StringRes title: Int,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.progressDialog(title, message, init)

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        title: CharSequence,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.indeterminateProgressDialog(title, message, init)

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        @StringRes title: Int,
        message: CharSequence,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.indeterminateProgressDialog(title, message, init)

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        title: CharSequence,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.indeterminateProgressDialog(title, message, init)

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        @StringRes title: Int,
        @StringRes message: Int,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.indeterminateProgressDialog(title, message, init)