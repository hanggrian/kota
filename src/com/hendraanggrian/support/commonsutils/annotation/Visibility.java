package com.hendraanggrian.support.commonsutils.annotation;

import android.support.annotation.IntDef;
import android.view.View;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@IntDef({
        View.VISIBLE,
        View.INVISIBLE,
        View.GONE})
@Retention(RetentionPolicy.SOURCE)
public @interface Visibility {
}