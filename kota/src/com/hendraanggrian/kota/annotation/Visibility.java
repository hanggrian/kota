package com.hendraanggrian.kota.annotation;

import android.support.annotation.IntDef;
import android.view.View;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({
        View.VISIBLE,
        View.INVISIBLE,
        View.GONE
})
public @interface Visibility {
}