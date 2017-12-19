@file:JvmMultifileClass
@file:JvmName("DialogsV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION", "UNUSED")

package kota

import android.app.ProgressDialog
import android.support.annotation.StringRes
import android.support.v4.app.Fragment

@JvmOverloads
inline fun Fragment.progressDialog(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.progressDialog(message, title, init)

@JvmOverloads
inline fun Fragment.progressDialog(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.progressDialog(message, title, init)

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.indeterminateProgressDialog(message, title, init)

@JvmOverloads
inline fun Fragment.indeterminateProgressDialog(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (ProgressDialog.() -> Unit)? = null
): ProgressDialog = context!!.indeterminateProgressDialog(message, title, init)