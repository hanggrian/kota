package com.hendraanggrian.support.utils.content;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import static com.hendraanggrian.support.utils.Preconditions.checkNotNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Themes {

    private Themes() {
    }

    @NonNull
    public static CharSequence getText(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getText(context.getTheme(), attr);
    }

    @NonNull
    public static CharSequence getText(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return checkNotNull(getTextInternal(theme, attr, true));
    }

    @Nullable
    public static CharSequence getTextOrNull(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getTextOrNull(context.getTheme(), attr);
    }

    @Nullable
    public static CharSequence getTextOrNull(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getTextInternal(theme, attr, false);
    }

    @Nullable
    private static CharSequence getTextInternal(@NonNull Resources.Theme theme, @AttrRes int attr, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getText(0);
        } finally {
            a.recycle();
        }
    }

    @NonNull
    public static String getString(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getString(context.getTheme(), attr);
    }

    @NonNull
    public static String getString(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return checkNotNull(getStringInternal(theme, attr, true));
    }

    @Nullable
    public static String getStringOrNull(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getStringOrNull(context.getTheme(), attr);
    }

    @Nullable
    public static String getStringOrNull(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getStringInternal(theme, attr, false);
    }

    @Nullable
    private static String getStringInternal(@NonNull Resources.Theme theme, @AttrRes int attr, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getString(0);
        } finally {
            a.recycle();
        }
    }

    public static boolean getBoolean(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getBoolean(context.getTheme(), attr);
    }

    public static boolean getBoolean(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getBooleanInternal(theme, attr, false, true);
    }

    public static boolean getBooleanOrDefault(@NonNull Context context, @AttrRes int attr, boolean defValue) {
        checkNotNull(context);
        return getBooleanOrDefault(context.getTheme(), attr, defValue);
    }

    public static boolean getBooleanOrDefault(@NonNull Resources.Theme theme, @AttrRes int attr, boolean defValue) {
        checkNotNull(theme);
        return getBooleanInternal(theme, attr, defValue, false);
    }

    private static boolean getBooleanInternal(@NonNull Resources.Theme theme, @AttrRes int attr, boolean defValue, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getBoolean(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static int getInt(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getInt(context.getTheme(), attr);
    }

    public static int getInt(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getIntInternal(theme, attr, 0, true);
    }

    public static int getIntOrDefault(@NonNull Context context, @AttrRes int attr, int defValue) {
        checkNotNull(context);
        return getIntOrDefault(context.getTheme(), attr, defValue);
    }

    public static int getIntOrDefault(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue) {
        checkNotNull(theme);
        return getIntInternal(theme, attr, defValue, false);
    }

    private static int getIntInternal(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getInt(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static float getFloat(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getFloat(context.getTheme(), attr);
    }

    public static float getFloat(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getFloatInternal(theme, attr, 0.0F, true);
    }

    public static float getFloatOrDefault(@NonNull Context context, @AttrRes int attr, float defValue) {
        checkNotNull(context);
        return getFloatOrDefault(context.getTheme(), attr, defValue);
    }

    public static float getFloatOrDefault(@NonNull Resources.Theme theme, @AttrRes int attr, float defValue) {
        checkNotNull(theme);
        return getFloatInternal(theme, attr, defValue, false);
    }

    private static float getFloatInternal(@NonNull Resources.Theme theme, @AttrRes int attr, float defValue, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getFloat(0, defValue);
        } finally {
            a.recycle();
        }
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getColor(context.getTheme(), attr);
    }

    @ColorInt
    public static int getColor(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getColorInternal(theme, attr, 0, true);
    }

    @ColorInt
    public static int getColorOrDefault(@NonNull Context context, @AttrRes int attr, @ColorInt int defValue) {
        checkNotNull(context);
        return getColorOrDefault(context.getTheme(), attr, defValue);
    }

    @ColorInt
    public static int getColorOrDefault(@NonNull Resources.Theme theme, @AttrRes int attr, @ColorInt int defValue) {
        checkNotNull(theme);
        return getColorInternal(theme, attr, defValue, false);
    }

    @ColorInt
    private static int getColorInternal(@NonNull Resources.Theme theme, @AttrRes int attr, @ColorInt int defValue, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getColor(0, defValue);
        } finally {
            a.recycle();
        }
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getColorStateList(context.getTheme(), attr);
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return checkNotNull(getColorStateListInternal(theme, attr, true));
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getColorStateListOrNull(context.getTheme(), attr);
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getColorStateListInternal(theme, attr, false);
    }

    @Nullable
    private static ColorStateList getColorStateListInternal(@NonNull Resources.Theme theme, @AttrRes int attr, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getColorStateList(0);
        } finally {
            a.recycle();
        }
    }

    public static float getDimension(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getDimension(context.getTheme(), attr);
    }

    public static float getDimension(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getDimensionInternal(theme, attr, 0.0F, true);
    }

    public static float getDimensionOrDefault(@NonNull Context context, @AttrRes int attr, float defValue) {
        checkNotNull(context);
        return getDimensionOrDefault(context.getTheme(), attr, defValue);
    }

    public static float getDimensionOrDefault(@NonNull Resources.Theme theme, @AttrRes int attr, float defValue) {
        checkNotNull(theme);
        return getDimensionInternal(theme, attr, defValue, false);
    }

    private static float getDimensionInternal(@NonNull Resources.Theme theme, @AttrRes int attr, float defValue, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getDimension(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static int getDimensionPixelOffset(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getDimensionPixelOffset(context.getTheme(), attr);
    }

    public static int getDimensionPixelOffset(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getDimensionPixelOffsetInternal(theme, attr, 0, true);
    }

    public static int getDimensionPixelOffsetOrDefault(@NonNull Context context, @AttrRes int attr, int defValue) {
        checkNotNull(context);
        return getDimensionPixelOffsetOrDefault(context.getTheme(), attr, defValue);
    }

    public static int getDimensionPixelOffsetOrDefault(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue) {
        checkNotNull(theme);
        return getDimensionPixelOffsetInternal(theme, attr, defValue, false);
    }

    private static int getDimensionPixelOffsetInternal(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getDimensionPixelOffset(0, defValue);
        } finally {
            a.recycle();
        }
    }

    public static int getDimensionPixelSize(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getDimensionPixelSize(context.getTheme(), attr);
    }

    public static int getDimensionPixelSize(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getDimensionPixelSizeInternal(theme, attr, 0, true);
    }

    public static int getDimensionPixelSizeOrDefault(@NonNull Context context, @AttrRes int attr, int defValue) {
        checkNotNull(context);
        return getDimensionPixelSizeOrDefault(context.getTheme(), attr, defValue);
    }

    public static int getDimensionPixelSizeOrDefault(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue) {
        checkNotNull(theme);
        return getDimensionPixelSizeInternal(theme, attr, defValue, false);
    }

    private static int getDimensionPixelSizeInternal(@NonNull Resources.Theme theme, @AttrRes int attr, int defValue, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getDimensionPixelSize(0, defValue);
        } finally {
            a.recycle();
        }
    }

    @NonNull
    public static Drawable getDrawable(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getDrawable(context.getTheme(), attr);
    }

    @NonNull
    public static Drawable getDrawable(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return checkNotNull(getDrawableInternal(theme, attr, true));
    }

    @Nullable
    public static Drawable getDrawableOrNull(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getDrawableOrNull(context.getTheme(), attr);
    }

    @Nullable
    public static Drawable getDrawableOrNull(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getDrawableInternal(theme, attr, false);
    }

    @Nullable
    private static Drawable getDrawableInternal(@NonNull Resources.Theme theme, @AttrRes int attr, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getDrawable(0);
        } finally {
            a.recycle();
        }
    }

    @NonNull
    public static CharSequence[] getTextArray(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getTextArray(context.getTheme(), attr);
    }

    @NonNull
    public static CharSequence[] getTextArray(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return checkNotNull(getTextArrayInternal(theme, attr, true));
    }

    @Nullable
    public static CharSequence[] getTextArrayOrNull(@NonNull Context context, @AttrRes int attr) {
        checkNotNull(context);
        return getTextArrayOrNull(context.getTheme(), attr);
    }

    @Nullable
    public static CharSequence[] getTextArrayOrNull(@NonNull Resources.Theme theme, @AttrRes int attr) {
        checkNotNull(theme);
        return getTextArrayInternal(theme, attr, false);
    }

    @Nullable
    private static CharSequence[] getTextArrayInternal(@NonNull Resources.Theme theme, @AttrRes int attr, boolean strict) {
        TypedArray a = theme.obtainStyledAttributes(new int[]{attr});
        if (strict && !a.hasValue(0)) {
            throw new NullPointerException();
        }
        try {
            return a.getTextArray(0);
        } finally {
            a.recycle();
        }
    }
}