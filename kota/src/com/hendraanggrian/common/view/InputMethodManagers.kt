@file:JvmName("InputMethodManagers")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.view

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.ResultReceiver
import android.view.inputmethod.InputMethodManager
import com.hendraanggrian.common.annotation.InputHideFlags
import com.hendraanggrian.common.annotation.InputShowFlags
import com.hendraanggrian.common.content.getSystemService2

inline fun Context.getInputMethodManager(): InputMethodManager = getSystemService2(Context.INPUT_METHOD_SERVICE)
inline fun Fragment.getInputMethodManager(): InputMethodManager = getSystemService2(Context.INPUT_METHOD_SERVICE)
inline fun android.support.v4.app.Fragment.getInputMethodManager(): InputMethodManager = getSystemService2(Context.INPUT_METHOD_SERVICE)

@JvmOverloads inline fun Activity.showInput(
        @InputShowFlags flags: Int = InputMethodManager.SHOW_IMPLICIT,
        noinline receiver: (() -> ResultReceiver)? = null
): Boolean {
    val focus = currentFocus
    return focus != null && getInputMethodManager().showSoftInput(focus, flags, receiver?.invoke())
}

@JvmOverloads inline fun Fragment.showInput(
        @InputShowFlags flags: Int = InputMethodManager.SHOW_IMPLICIT,
        noinline receiver: (() -> ResultReceiver)? = null
): Boolean = activity.showInput(flags, receiver)

@JvmOverloads inline fun android.support.v4.app.Fragment.showInput(
        @InputShowFlags flags: Int = InputMethodManager.SHOW_IMPLICIT,
        noinline receiver: (() -> ResultReceiver)? = null
): Boolean = activity.showInput(flags, receiver)

@JvmOverloads inline fun Activity.hideInput(
        @InputHideFlags flags: Int = InputMethodManager.HIDE_NOT_ALWAYS,
        noinline receiver: (() -> ResultReceiver)? = null
): Boolean {
    val focus = currentFocus
    return focus != null && getInputMethodManager().hideSoftInputFromWindow(focus.windowToken, flags, receiver?.invoke())
}

@JvmOverloads inline fun Fragment.hideInput(
        @InputHideFlags flags: Int = InputMethodManager.HIDE_NOT_ALWAYS,
        noinline receiver: (() -> ResultReceiver)? = null
): Boolean = activity.hideInput(flags, receiver)

@JvmOverloads inline fun android.support.v4.app.Fragment.hideInput(
        @InputHideFlags flags: Int = InputMethodManager.HIDE_NOT_ALWAYS,
        noinline receiver: (() -> ResultReceiver)? = null
): Boolean = activity.hideInput(flags, receiver)