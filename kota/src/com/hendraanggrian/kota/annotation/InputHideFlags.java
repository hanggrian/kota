package com.hendraanggrian.kota.annotation;

import android.support.annotation.IntDef;
import android.view.inputmethod.InputMethodManager;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@IntDef({
        InputMethodManager.HIDE_NOT_ALWAYS,
        InputMethodManager.HIDE_IMPLICIT_ONLY})
@Retention(RetentionPolicy.SOURCE)
public @interface InputHideFlags {
}