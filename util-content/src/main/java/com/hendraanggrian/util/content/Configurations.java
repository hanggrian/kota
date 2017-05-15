package com.hendraanggrian.util.content;

import android.content.res.Configuration;
import android.support.annotation.NonNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Configurations {

    private Configurations() {
    }

    public static int getScreenLayoutSize(@NonNull Configuration config) {
        return config.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
    }
}