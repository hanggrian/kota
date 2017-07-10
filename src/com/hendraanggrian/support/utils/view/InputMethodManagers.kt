/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

package com.hendraanggrian.support.utils.view

import android.app.Activity
import android.content.Context
import android.os.ResultReceiver
import android.support.annotation.IntDef
import android.view.inputmethod.InputMethodManager
import android.view.inputmethod.InputMethodManager.*

@IntDef(SHOW_IMPLICIT.toLong(),
        SHOW_FORCED.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class ShowFlags

@IntDef(HIDE_NOT_ALWAYS.toLong(),
        HIDE_IMPLICIT_ONLY.toLong())
@Retention(AnnotationRetention.SOURCE)
annotation class HideFlags

@JvmOverloads
fun Activity.showInput(@ShowFlags flags: Int = SHOW_IMPLICIT, receiver: ResultReceiver? = null): Boolean {
    val focus = currentFocus
    return focus != null && (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(focus, flags, receiver)
}

@JvmOverloads
fun Activity.hideInput(@HideFlags flags: Int = HIDE_NOT_ALWAYS, receiver: ResultReceiver? = null): Boolean {
    val focus = currentFocus
    return focus != null && (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(focus.windowToken, flags, receiver)
}