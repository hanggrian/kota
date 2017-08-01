package com.hendraanggrian.kota.annotation;

import android.support.annotation.IntDef;
import android.view.inputmethod.InputMethodManager;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@IntDef({
        InputMethodManager.HIDE_NOT_ALWAYS,
        InputMethodManager.HIDE_IMPLICIT_ONLY})
public @interface InputHideFlags {
}