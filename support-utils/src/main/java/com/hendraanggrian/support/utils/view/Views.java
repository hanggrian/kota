package com.hendraanggrian.support.utils.view;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;

import java.lang.reflect.InvocationTargetException;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Views {

    private Views() {
    }

    public static <T extends View> T newInstance(@NonNull Class<T> cls, @NonNull Context context) {
        try {
            return cls.getConstructor(Context.class).newInstance(context);
        } catch (InstantiationException e) {
            throw new RuntimeException("Unable to create an instance of " + cls.getSimpleName() +
                    ": is this view class abstract?");
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to create an instance of " + cls.getSimpleName() +
                    ": is this view class private?");
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Unable to create an instance of " + cls.getSimpleName() +
                    ": unknown error.");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to create an instance of " + cls.getSimpleName() +
                    ": does this view has Context-only constructor?");
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends View> T findViewById(@NonNull View view, @IdRes int id) {
        return (T) view.findViewById(id);
    }

    @SuppressWarnings("unchecked")
    public static <T extends View> T findViewWithTag(@NonNull View view, @NonNull String tag) {
        return (T) view.findViewWithTag(tag);
    }

    public static boolean setVisibility(@NonNull View view, int visibility) {
        if (visibility == VISIBLE && view.getVisibility() != VISIBLE)
            view.setVisibility(VISIBLE);
        else if (visibility == GONE && view.getVisibility() != GONE)
            view.setVisibility(GONE);
        else if (visibility == INVISIBLE && view.getVisibility() != INVISIBLE)
            view.setVisibility(INVISIBLE);
        return visibility == View.VISIBLE;
    }

    public static boolean setVisible(@NonNull View view, boolean visible) {
        return setVisibility(view, visible ? VISIBLE : GONE);
    }

    public static void setVisibilities(int visibility, @NonNull View... views) {
        for (View view : views)
            view.setVisibility(visibility);
    }

    public static void setVisibles(boolean visible, @NonNull View... views) {
        for (View view : views)
            view.setVisibility(visible ? VISIBLE : GONE);
    }
}