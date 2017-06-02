package com.hendraanggrian.support.utils.view;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class ViewGroups {

    public static final int MATCH_PARENT = ViewGroup.LayoutParams.MATCH_PARENT;
    public static final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;

    private ViewGroups() {
    }

    public static void replaceView(@NonNull View currentView, @NonNull View newView) {
        ViewGroup parent = Views.getParent(currentView);
        if (parent != null) {
            int index = parent.indexOfChild(currentView);
            parent.removeView(currentView);
            if (containsView(parent, newView))
                parent.removeView(newView);
            parent.addView(newView, index);
        }
    }

    public static boolean containsView(@NonNull ViewGroup parent, @NonNull View child) {
        for (int i = 0; i < parent.getChildCount(); i++)
            if (parent.getChildAt(i) == child)
                return true;
        return false;
    }

    public static boolean containsViews(@NonNull ViewGroup parent, @NonNull View... childs) {
        if (childs.length == 0)
            return false;
        int count = 0;
        for (View child : childs)
            if (ViewGroups.containsView(parent, child))
                count++;
        return count == childs.length;
    }

    public static <VG extends ViewGroup, V extends View> V addView(@NonNull VG parent, @NonNull Class<V> childCls, int width, int height) {
        return addView(parent, childCls, width, height, -1);
    }

    public static <VG extends ViewGroup, V extends View> V addView(@NonNull VG parent, @NonNull Class<V> childCls, int width, int height, int index) {
        V child = Views.newInstance(childCls, parent.getContext());
        child.setLayoutParams(new VG.LayoutParams(width, height));
        parent.addView(child, index);
        return child;
    }

    public static void addViews(@NonNull ViewGroup parent, @NonNull Collection<View> childs) {
        for (View child : childs)
            parent.addView(child);
    }

    public static void addViews(@NonNull ViewGroup parent, @NonNull View... childs) {
        addViews(parent, Arrays.asList(childs));
    }

    public static void removeViews(@NonNull ViewGroup parent, @NonNull Collection<View> childs) {
        for (View child : childs)
            parent.removeView(child);
    }

    public static void removeViews(@NonNull ViewGroup parent, @NonNull View... childs) {
        removeViews(parent, Arrays.asList(childs));
    }
}