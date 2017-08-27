@file:JvmName("Snackbars")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.view.View

inline fun snackbar(view: View, @StringRes message: Int): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_SHORT)
        .apply { show() }

inline fun longSnackbar(view: View, @StringRes message: Int): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_LONG)
        .apply { show() }

inline fun snackbar(view: View, message: String): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_SHORT)
        .apply { show() }

inline fun longSnackbar(view: View, message: String): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_LONG)
        .apply { show() }

inline fun snackbar(view: View, @StringRes message: Int, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun snackbar(view: View, @StringRes message: Int, actionText: String, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun longSnackbar(view: View, @StringRes message: Int, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }

inline fun longSnackbar(view: View, @StringRes message: Int, actionText: String, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }

inline fun snackbar(view: View, message: String, actionText: String, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun snackbar(view: View, message: String, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun longSnackbar(view: View, message: String, actionText: String, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }

inline fun longSnackbar(view: View, message: String, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = Snackbar
        .make(view, message, Snackbar.LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }