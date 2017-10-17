@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.annotation.StringRes
import android.support.v7.app.AppCompatDialog
import android.widget.Toast

inline fun AppCompatDialog.toast(message: CharSequence): Toast = context.toast(message)

inline fun AppCompatDialog.toast(@StringRes message: Int): Toast = context.toast(message)

inline fun AppCompatDialog.longToast(message: CharSequence): Toast = context.longToast(message)

inline fun AppCompatDialog.longToast(@StringRes message: Int): Toast = context.longToast(message)