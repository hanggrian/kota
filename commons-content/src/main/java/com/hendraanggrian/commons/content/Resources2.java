package com.hendraanggrian.commons.content;

import android.content.res.Resources;

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
}