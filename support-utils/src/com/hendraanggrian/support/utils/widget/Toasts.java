package com.hendraanggrian.support.utils.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.View;
import android.widget.Toast;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Toasts {

    private Toasts() {
    }

    @NonNull
    public static Toast showShort(@NonNull Context context, @Nullable CharSequence text) {
        return showText(context, text, Toast.LENGTH_SHORT);
    }

    @NonNull
    public static Toast showShort(@NonNull Context context, @StringRes int resId) {
        return showTextRes(context, resId, Toast.LENGTH_SHORT);
    }

    @NonNull
    public static Toast showShort(@NonNull Context context, @NonNull View view) {
        return showCustomView(context, view, Toast.LENGTH_SHORT);
    }

    @NonNull
    public static Toast showLong(@NonNull Context context, @Nullable CharSequence text) {
        return showText(context, text, Toast.LENGTH_LONG);
    }

    @NonNull
    public static Toast showLong(@NonNull Context context, @StringRes int resId) {
        return showTextRes(context, resId, Toast.LENGTH_LONG);
    }

    @NonNull
    public static Toast showLong(@NonNull Context context, @NonNull View view) {
        return showCustomView(context, view, Toast.LENGTH_LONG);
    }

    @NonNull
    private static Toast showText(@NonNull Context context, @Nullable CharSequence text, int duration) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        return toast;
    }

    @NonNull
    private static Toast showTextRes(@NonNull Context context, @StringRes int resId, int duration) {
        Toast toast = Toast.makeText(context, resId, duration);
        toast.show();
        return toast;
    }

    @NonNull
    private static Toast showCustomView(@NonNull Context context, @NonNull View view, int duration) {
        Toast toast = new Toast(context);
        toast.setView(view);
        toast.setDuration(duration);
        toast.show();
        return toast;
    }
}