package com.hendraanggrian.support.utils.content;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.AnyRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Resources2 {

    public static final String TYPE_ANIM = "anim";
    public static final String TYPE_DRAWABLE = "drawable";
    public static final String TYPE_COLOR = "color";
    public static final String TYPE_LAYOUT = "layout";
    public static final String TYPE_MENU = "menu";
    public static final String TYPE_STRING = "string";
    public static final String TYPE_ARRAY = "array";
    public static final String TYPE_PLURALS = "plurals";
    public static final String TYPE_STYLE = "style";
    public static final String TYPE_BOOL = "bool";
    public static final String TYPE_DIMENSION = "dimension";
    public static final String TYPE_ID = "id";
    public static final String TYPE_INTEGER = "integer";

    @StringDef({
            TYPE_ANIM, TYPE_DRAWABLE, TYPE_COLOR, TYPE_LAYOUT, TYPE_MENU, TYPE_STRING, TYPE_PLURALS,
            TYPE_ARRAY, TYPE_STYLE, TYPE_BOOL, TYPE_DIMENSION, TYPE_ANIM, TYPE_ID, TYPE_INTEGER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private Resources2() {
    }

    public static int toPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int toDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static boolean isAvailable(@NonNull Context context, @NonNull String resName) {
        return findIdentifier(context, resName) != 0;
    }

    public static boolean isAvailable(@NonNull Resources res, @NonNull String resName, @NonNull String packageName) {
        return findIdentifier(res, resName, packageName) != 0;
    }

    @AnyRes
    public static int findIdentifier(@NonNull Context context, @NonNull String resName) {
        return findIdentifier(context.getResources(), resName, context.getPackageName());
    }

    @AnyRes
    public static int findIdentifier(@NonNull Resources res, @NonNull String resName, @NonNull String packageName) throws Resources.NotFoundException {
        for (String defType : new String[]{
                TYPE_ANIM, TYPE_DRAWABLE, TYPE_COLOR, TYPE_LAYOUT, TYPE_MENU, TYPE_STRING, TYPE_PLURALS,
                TYPE_ARRAY, TYPE_STYLE, TYPE_BOOL, TYPE_DIMENSION, TYPE_ANIM, TYPE_ID, TYPE_INTEGER}) {
            int id = res.getIdentifier(resName, defType, packageName);
            if (id != 0)
                return id;
        }
        throw new Resources.NotFoundException(resName + " not found in " + packageName);
    }

    @AnyRes
    public static int getIdentifier(@NonNull Context context, @NonNull String resName, @Type @NonNull String resType) throws Resources.NotFoundException {
        return getIdentifier(context.getResources(), resName, resType, context.getPackageName());
    }

    @AnyRes
    public static int getIdentifier(@NonNull Resources res, @NonNull String resName, @Type @NonNull String resType, @NonNull String packageName) throws Resources.NotFoundException {
        int id = res.getIdentifier(resName, resType, packageName);
        if (id != 0)
            return id;
        throw new Resources.NotFoundException(resName + " with type " + resType + " not found in " + packageName);
    }
}