package com.hendraanggrian.support.utils.view;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class ViewGroups {

    private ViewGroups() {
    }

    @NonNull
    public static Collection<View> findViewsWithTag(@NonNull ViewGroup parent, @NonNull Object tag, boolean recursive) {
        Collection<View> views = new ArrayList<>();
        for (int i = 0; i < parent.getChildCount(); i++) {
            View view = parent.getChildAt(i);
            if (recursive && view instanceof ViewGroup) {
                views.addAll(findViewsWithTag((ViewGroup) view, tag, true));
            } else {
                Object childTag = view.getTag();
                if (childTag != null && childTag.equals(tag))
                    views.add(view);
            }
        }
        return views;
    }

    @NonNull
    public static Collection<View> getChilds(@NonNull ViewGroup parent) {
        Collection<View> childs = new ArrayList<>();
        for (int i = 0; i < parent.getChildCount(); i++)
            childs.add(parent.getChildAt(i));
        return childs;
    }

    public static boolean containsView(@NonNull ViewGroup parent, @NonNull View child) {
        for (int i = 0; i < parent.getChildCount(); i++)
            if (parent.getChildAt(i) == child)
                return true;
        return false;
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