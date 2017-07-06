package com.hendraanggrian.support.utils.content;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.AnyRes;
import android.support.annotation.NonNull;
import android.support.annotation.Px;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.hendraanggrian.support.utils.Preconditions.checkNotNull;

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
            TYPE_ANIM,
            TYPE_DRAWABLE,
            TYPE_COLOR,
            TYPE_LAYOUT,
            TYPE_MENU,
            TYPE_STRING,
            TYPE_ARRAY,
            TYPE_PLURALS,
            TYPE_STYLE,
            TYPE_BOOL,
            TYPE_DIMENSION,
            TYPE_ANIM,
            TYPE_ID,
            TYPE_INTEGER
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private Resources2() {
    }

    @AnyRes
    public static int getId(@NonNull Context context, @NonNull String resName, @Type @NonNull String resType) {
        checkNotNull(context);
        return getId(context.getResources(), resName, resType, context.getPackageName());
    }

    @AnyRes
    public static int getId(@NonNull Resources res, @NonNull String resName, @Type @NonNull String resType, @NonNull String packageName) {
        checkNotNull(res);
        checkNotNull(resName);
        checkNotNull(resType);
        checkNotNull(packageName);
        return res.getIdentifier(resName, resType, packageName);
    }

    @Px
    public static int toPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int toDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }
}