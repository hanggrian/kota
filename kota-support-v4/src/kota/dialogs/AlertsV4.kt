@file:JvmMultifileClass
@file:JvmName("DialogsV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.AlertDialog
import android.support.annotation.StringRes
import android.support.v4.app.Fragment

@JvmOverloads
inline fun Fragment.alert(
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.alert(init)

@JvmOverloads
inline fun Fragment.alert(
        message: CharSequence,
        title: CharSequence? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.alert(message, title, init)

@JvmOverloads
inline fun Fragment.alert(
        @StringRes message: Int,
        @StringRes title: Int? = null,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = context!!.alert(message, title, init)