@file:JvmName("Toasts")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.app.Fragment
import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast

inline fun Fragment.toast(@StringRes message: Int): Toast = activity.toast(message)
inline fun Context.toast(@StringRes message: Int): Toast = Toast
        .makeText(this, message, Toast.LENGTH_SHORT)
        .apply { show() }

inline fun Fragment.toast(message: CharSequence): Toast = activity.toast(message)
inline fun Context.toast(message: CharSequence): Toast = Toast
        .makeText(this, message, Toast.LENGTH_SHORT)
        .apply { show() }

inline fun Fragment.longToast(@StringRes message: Int): Toast = activity.longToast(message)
inline fun Context.longToast(@StringRes message: Int): Toast = Toast
        .makeText(this, message, Toast.LENGTH_LONG)
        .apply { show() }

inline fun Fragment.longToast(message: CharSequence): Toast = activity.longToast(message)
inline fun Context.longToast(message: CharSequence): Toast = Toast
        .makeText(this, message, Toast.LENGTH_LONG)
        .apply { show() }