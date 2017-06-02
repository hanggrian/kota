package com.hendraanggrian.support.utils.view;

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

    public static boolean setVisibility(@NonNull View view, int visibility) {
        if (view.getVisibility() != visibility)
            view.setVisibility(visibility);
        return visibility == VISIBLE;
    }

    public static boolean setVisible(@NonNull View view, boolean visible) {
        return setVisibility(view, visible ? VISIBLE : GONE);
    }
}