@file:JvmName("InputMethodManagers")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.ResultReceiver
import android.view.inputmethod.InputMethodManager
import com.hendraanggrian.kota.annotation.InputHideFlags
import com.hendraanggrian.kota.annotation.InputShowFlags

@JvmOverloads
inline fun Activity.showInput(@InputShowFlags flags: Int = InputMethodManager.SHOW_IMPLICIT, receiver: ResultReceiver? = null): Boolean {
    val focus = currentFocus
    return focus != null && (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(focus, flags, receiver)
}

@JvmOverloads inline fun Fragment.showInput(@InputShowFlags flags: Int = InputMethodManager.SHOW_IMPLICIT, receiver: ResultReceiver? = null) = activity.showInput(flags, receiver)
@JvmOverloads inline fun android.support.v4.app.Fragment.showInput(@InputShowFlags flags: Int = InputMethodManager.SHOW_IMPLICIT, receiver: ResultReceiver? = null) = activity.showInput(flags, receiver)

@JvmOverloads
inline fun Activity.hideInput(@InputHideFlags flags: Int = InputMethodManager.HIDE_NOT_ALWAYS, receiver: ResultReceiver? = null): Boolean {
    val focus = currentFocus
    return focus != null && (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(focus.windowToken, flags, receiver)
}

@JvmOverloads inline fun Fragment.hideInput(@InputHideFlags flags: Int = InputMethodManager.HIDE_NOT_ALWAYS, receiver: ResultReceiver? = null) = activity.hideInput(flags, receiver)
@JvmOverloads inline fun android.support.v4.app.Fragment.hideInput(@InputHideFlags flags: Int = InputMethodManager.HIDE_NOT_ALWAYS, receiver: ResultReceiver? = null) = activity.hideInput(flags, receiver)