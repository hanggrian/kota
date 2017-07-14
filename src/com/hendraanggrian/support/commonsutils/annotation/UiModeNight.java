package com.hendraanggrian.support.commonsutils.annotation;

import android.content.res.Configuration;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@IntDef({
        Configuration.UI_MODE_NIGHT_UNDEFINED,
        Configuration.UI_MODE_NIGHT_NO,
        Configuration.UI_MODE_NIGHT_YES})
@Retention(RetentionPolicy.SOURCE)
public @interface UiModeNight {
}