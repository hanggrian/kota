@file:JvmName("SupportToastsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.widget.Toast
import kota.dialogs.longToast
import kota.dialogs.toast

inline fun Fragment.toast(message: CharSequence): Toast = context.toast(message)

inline fun Fragment.toast(@StringRes message: Int): Toast = context.toast(message)

inline fun Fragment.longToast(message: CharSequence): Toast = context.longToast(message)

inline fun Fragment.longToast(@StringRes message: Int): Toast = context.longToast(message)