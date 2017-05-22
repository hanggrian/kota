package com.hendraanggrian.support.utils.content;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Resources2 {

    private Resources2() {
    }

    public static int toPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int toDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static boolean exists(@NonNull Context context, @NonNull String resName, @NonNull String defType) {
        return exists(context.getResources(), resName, defType, context.getPackageName());
    }

    public static boolean exists(@NonNull Resources res, @NonNull String resName, @NonNull String defType, @NonNull String packageName) {
        return res.getIdentifier(resName, defType, packageName) != 0;
    }
}