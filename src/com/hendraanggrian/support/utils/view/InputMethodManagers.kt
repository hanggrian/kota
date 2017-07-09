package com.hendraanggrian.support.utils.view

import android.app.Activity
import android.content.Context
import android.os.ResultReceiver
import android.support.annotation.IntDef
import android.view.inputmethod.InputMethodManager

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@IntDef(InputMethodManager.SHOW_IMPLICIT.toLong(),
        InputMethodManager.SHOW_FORCED.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class ShowFlags

@IntDef(InputMethodManager.HIDE_NOT_ALWAYS.toLong(),
        InputMethodManager.HIDE_IMPLICIT_ONLY.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class HideFlags

fun Activity.showInput(): Boolean = showInput(InputMethodManager.SHOW_IMPLICIT, null)
fun Activity.showInput(@ShowFlags flags: Int): Boolean = showInput(flags, null)
fun Activity.showInput(@ShowFlags flags: Int, receiver: ResultReceiver?): Boolean {
    val focus = currentFocus
    return focus != null && (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(focus, flags, receiver)
}

fun Activity.hideInput(): Boolean = hideInput(InputMethodManager.HIDE_NOT_ALWAYS, null)
fun Activity.hideInput(@HideFlags flags: Int): Boolean = hideInput(flags, null)
fun Activity.hideInput(@HideFlags flags: Int, receiver: ResultReceiver?): Boolean {
    val focus = currentFocus
    return focus != null && (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(focus.windowToken, flags, receiver)
}