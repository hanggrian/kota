package com.hendraanggrian.util.content;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Themes {

    private Themes() {
    }

    @Nullable
    public static CharSequence getText(@NonNull Context context, @AttrRes int attr) {
        return getText(context.getTheme(), attr);
    }

    @Nullable
    public static CharSequence getText(@NonNull Resources.Theme theme, @AttrRes int attr) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getText(0);
        } finally {
            a.recycle();
        }
    }

    @Nullable
    public static String getString(@NonNull Context context, @AttrRes int attr) {
        return getString(context.getTheme(), attr);
    }

    @Nullable
    public static String getString(@NonNull Resources.Theme theme, @AttrRes int attr) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getString(0);
        } finally {
            a.recycle();
        }
    }

    public static boolean getBoolean(@NonNull Context context, @AttrRes int attr, boolean defValue) {
        return getBoolean(context.getTheme(), attr, defValue);
    }

    public static boolean getBoolean(@NonNull Resources.Theme theme, @AttrRes int attr, boolean defValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getBoolean(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static int getInt(@NonNull Context context, @AttrRes int attr, int defValue) {
        return getInt(context.getTheme(), attr, defValue);
    }

    public static int getInt(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getInt(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static float getFloat(@NonNull Context context, @AttrRes int attr, float defValue) {
        return getFloat(context.getTheme(), attr, defValue);
    }

    public static float getFloat(@NonNull Resources.Theme theme, @AttrRes int attr, float defValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getFloat(0, defValue);
        } finally {
            a.recycle();
        }
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int attr, @ColorInt int defValue) {
        return getColor(context.getTheme(), attr, defValue);
    }

    @ColorInt
    public static int getColor(@NonNull Resources.Theme theme, @AttrRes int attr, @ColorInt int defValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getColor(0, defValue);
        } finally {
            a.recycle();
        }
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int attr) {
        return getColorStateList(context.getTheme(), attr);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources.Theme theme, @AttrRes int attr) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getColorStateList(0);
        } finally {
            a.recycle();
        }
    }

    public static float getDimension(@NonNull Context context, @AttrRes int attr, float defValue) {
        return getDimension(context.getTheme(), attr, defValue);
    }

    public static float getDimension(@NonNull Resources.Theme theme, @AttrRes int attr, float defValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getDimension(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static int getDimensionPixelOffset(@NonNull Context context, @AttrRes int attr, int defValue) {
        return getDimensionPixelOffset(context.getTheme(), attr, defValue);
    }

    public static int getDimensionPixelOffset(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getDimensionPixelOffset(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static int getDimensionPixelSize(@NonNull Context context, @AttrRes int attr, int defValue) {
        return getDimensionPixelSize(context.getTheme(), attr, defValue);
    }

    public static int getDimensionPixelSize(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getDimensionPixelSize(0, defValue);
        } finally {
            a.recycle();
        }
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @AttrRes int attr) {
        return getDrawable(context.getTheme(), attr);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Resources.Theme theme, @AttrRes int attr) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getDrawable(0);
        } finally {
            a.recycle();
        }
    }

    @Nullable
    public static CharSequence[] getTextArray(@NonNull Context context, @AttrRes int attr) {
        return getTextArray(context.getTheme(), attr);
    }

    @Nullable
    public static CharSequence[] getTextArray(@NonNull Resources.Theme theme, @AttrRes int attr) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        try {
            return a.getTextArray(0);
        } finally {
            a.recycle();
        }
    }
}