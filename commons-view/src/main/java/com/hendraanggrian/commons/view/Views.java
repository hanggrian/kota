package com.hendraanggrian.commons.view;

import android.support.annotation.NonNull;
import android.view.View;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Views {

    private Views() {
    }

    public static <V extends View> boolean setVisible(@NonNull V v, boolean visible) {
        if (visible && v.getVisibility() != VISIBLE)
            v.setVisibility(VISIBLE);
        else if (!visible && v.getVisibility() != GONE)
            v.setVisibility(GONE);
        return visible;
    }

    public static <V extends View> void setVisibility(int visibility, @NonNull V... vs) {
        for (V v : vs)
            v.setVisibility(visibility);
    }
}