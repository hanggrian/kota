package com.hendraanggrian.support.utils.view;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;

import static com.hendraanggrian.support.utils.Preconditions.checkNotNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class ViewGroups {

    private ViewGroups() {
    }

    @NonNull
    public static Collection<View> findViewsWithTag(@NonNull ViewGroup parent, @NonNull Object tag) {
        return findViewsWithTag(parent, tag, false);
    }

    @NonNull
    public static Collection<View> findViewsWithTag(@NonNull ViewGroup parent, @NonNull Object tag, boolean recursive) {
        checkNotNull(parent);
        checkNotNull(tag);
        Collection<View> views = new ArrayList<>();
        for (int i = 0; i < parent.getChildCount(); i++) {
            View view = parent.getChildAt(i);
            if (recursive && view instanceof ViewGroup) {
                views.addAll(findViewsWithTag((ViewGroup) view, tag, true));
            } else {
                Object childTag = view.getTag();
                if (childTag != null && childTag.equals(tag)) {
                    views.add(view);
                }
            }
        }
        return views;
    }

    @NonNull
    public static Collection<View> getChilds(@NonNull ViewGroup parent) {
        checkNotNull(parent);
        Collection<View> childs = new ArrayList<>();
        for (int i = 0; i < parent.getChildCount(); i++) {
            childs.add(parent.getChildAt(i));
        }
        return childs;
    }

    public static boolean hasView(@NonNull ViewGroup parent, @NonNull View child) {
        return hasView(parent, child, false);
    }

    public static boolean hasView(@NonNull ViewGroup parent, @NonNull View child, boolean recursive) {
        checkNotNull(parent);
        checkNotNull(child);
        for (int i = 0; i < parent.getChildCount(); i++) {
            View view = parent.getChildAt(i);
            if (recursive && view instanceof ViewGroup) {
                if (hasView((ViewGroup) view, child, true)) {
                    return true;
                }
            } else if (parent.getChildAt(i) == child) {
                return true;
            }
        }
        return false;
    }
}