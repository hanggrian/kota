package com.hendraanggrian.commons.content;

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
    public static int getColor(@NonNull Context context, @AttrRes int attr, @ColorInt int defaultValue) {
        return getColor(context.getTheme(), attr, defaultValue);
    }

    @ColorInt
    public static int getColor(@NonNull Resources.Theme theme, @AttrRes int attr, @ColorInt int defaultValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getColor(0, defaultValue);
        } finally {
            a.recycle();
        }
    }

    public static float getFloat(@NonNull Context context, @AttrRes int attr, float defaultValue) {
        return getFloat(context.getTheme(), attr, defaultValue);
    }

    public static float getFloat(@NonNull Resources.Theme theme, @AttrRes int attr, float defaultValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getFloat(0, defaultValue);
        } finally {
            a.recycle();
        }
    }
}