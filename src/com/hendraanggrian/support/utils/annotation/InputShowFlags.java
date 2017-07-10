package com.hendraanggrian.support.utils.annotation;

import android.support.annotation.IntDef;
import android.view.inputmethod.InputMethodManager;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@IntDef({
        InputMethodManager.SHOW_IMPLICIT,
        InputMethodManager.SHOW_FORCED})
public @interface InputShowFlags {
}