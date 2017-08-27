package com.hendraanggrian.kota.annotation;

import android.content.res.Configuration;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({
        Configuration.SCREENLAYOUT_SIZE_UNDEFINED,
        Configuration.SCREENLAYOUT_SIZE_SMALL,
        Configuration.SCREENLAYOUT_SIZE_NORMAL,
        Configuration.SCREENLAYOUT_SIZE_LARGE,
        Configuration.SCREENLAYOUT_SIZE_XLARGE
})
public @interface ScreenLayoutSize {
}