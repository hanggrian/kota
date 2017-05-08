package com.hendraanggrian.commons.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Themes {

    private Themes() {
    }

    @ColorInt
    public static int getColorFromAttrRes(@NonNull Context context, @AttrRes int attr, @ColorInt int defaultValue) {
        return getColorFromAttrRes(context.getTheme(), attr, defaultValue);
    }

    @ColorInt
    public static int getColorFromAttrRes(@NonNull Resources.Theme theme, @AttrRes int attr, @ColorInt int defaultValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getColor(0, defaultValue);
        } finally {
            a.recycle();
        }
    }

    public static float getFloatFromAttrRes(@NonNull Context context, @AttrRes int attr, float defaultValue) {
        return getFloatFromAttrRes(context.getTheme(), attr, defaultValue);
    }

    public static float getFloatFromAttrRes(@NonNull Resources.Theme theme, @AttrRes int attr, float defaultValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getFloat(0, defaultValue);
        } finally {
            a.recycle();
        }
    }
}