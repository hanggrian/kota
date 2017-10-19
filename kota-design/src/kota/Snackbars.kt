@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.support.design.widget.Snackbar.*
import android.view.View

@PublishedApi internal inline fun View.make(message: CharSequence, duration: Int): Snackbar =
        Snackbar.make(this, message, duration)

@PublishedApi internal inline fun View.make(@StringRes message: Int, duration: Int): Snackbar =
        Snackbar.make(this, message, duration)

inline fun View.snackbar(message: CharSequence): Snackbar = make(message, LENGTH_SHORT)
        .apply { show() }

inline fun View.snackbar(@StringRes message: Int): Snackbar = make(message, LENGTH_SHORT)
        .apply { show() }

inline fun View.snackbar(message: CharSequence, actionText: CharSequence, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.snackbar(@StringRes message: Int, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.snackbar(@StringRes message: Int, actionText: CharSequence, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.snackbar(message: CharSequence, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_SHORT)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.longSnackbar(message: CharSequence): Snackbar = make(message, LENGTH_LONG)
        .apply { show() }

inline fun View.longSnackbar(@StringRes message: Int): Snackbar = make(message, LENGTH_LONG)
        .apply { show() }

inline fun View.longSnackbar(message: CharSequence, actionText: CharSequence, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.longSnackbar(@StringRes message: Int, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.longSnackbar(@StringRes message: Int, actionText: CharSequence, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.longSnackbar(message: CharSequence, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_LONG)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.indefiniteSnackbar(message: CharSequence): Snackbar = make(message, LENGTH_INDEFINITE)
        .apply { show() }

inline fun View.indefiniteSnackbar(@StringRes message: Int): Snackbar = make(message, LENGTH_INDEFINITE)
        .apply { show() }

inline fun View.indefiniteSnackbar(message: CharSequence, actionText: CharSequence, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_INDEFINITE)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.indefiniteSnackbar(@StringRes message: Int, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_INDEFINITE)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.indefiniteSnackbar(@StringRes message: Int, actionText: CharSequence, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_INDEFINITE)
        .setAction(actionText, action)
        .apply { show() }

inline fun View.indefiniteSnackbar(message: CharSequence, @StringRes actionText: Int, noinline action: (View) -> Unit): Snackbar = make(message, LENGTH_INDEFINITE)
        .setAction(actionText, action)
        .apply { show() }