package com.hendraanggrian.commons.content;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Drawables {

    private Drawables() {
    }

    @NonNull
    public static Drawable fromBitmap(@NonNull Resources res, @NonNull Bitmap bitmap) {
        return new BitmapDrawable(res, bitmap);
    }

    @NonNull
    public static Drawable fromColor(@ColorInt int color) {
        return new ColorDrawable(color);
    }

    @NonNull
    public static Drawable fromColorRes(@NonNull Context context, @ColorRes int colorRes) {
        return fromColor(ContextCompat.getColor(context, colorRes));
    }

    @NonNull
    public static Drawable fromColorAttr(@NonNull Context context, @AttrRes int colorAttr) {
        int color = Themes.getColor(context, colorAttr, -1);
        if (color != -1)
            return fromColor(color);
        throw new IllegalArgumentException("invalid attribute!");
    }

    @NonNull
    public static Bitmap toBitmap(@NonNull Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap != null) {
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }
}