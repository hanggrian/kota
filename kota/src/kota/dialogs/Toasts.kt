@file:JvmName("ToastsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.app.Fragment
import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT

@PublishedApi internal inline fun Context.make(message: CharSequence, duration: Int): Toast = Toast.makeText(this, message, duration)
@PublishedApi internal inline fun Context.make(@StringRes message: Int, duration: Int): Toast = Toast.makeText(this, message, duration)

inline fun Context.toast(message: CharSequence): Toast = make(message, LENGTH_SHORT).apply { show() }
inline fun Fragment.toast(message: CharSequence): Toast = activity.toast(message)

inline fun Context.toast(@StringRes message: Int): Toast = make(message, LENGTH_SHORT).apply { show() }
inline fun Fragment.toast(@StringRes message: Int): Toast = activity.toast(message)

inline fun Context.longToast(message: CharSequence): Toast = make(message, LENGTH_LONG).apply { show() }
inline fun Fragment.longToast(message: CharSequence): Toast = activity.longToast(message)

inline fun Context.longToast(@StringRes message: Int): Toast = make(message, LENGTH_LONG).apply { show() }
inline fun Fragment.longToast(@StringRes message: Int): Toast = activity.longToast(message)