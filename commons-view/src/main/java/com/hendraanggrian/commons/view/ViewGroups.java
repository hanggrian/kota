package com.hendraanggrian.commons.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class ViewGroups {

    public static final int MATCH_PARENT = ViewGroup.LayoutParams.MATCH_PARENT;
    public static final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;

    private ViewGroups() {
    }

    public static <VG extends ViewGroup, V extends View> V addView(
            @NonNull VG parent,
            @NonNull Class<V> childCls,
            int width,
            int height) {
        return addView(parent, childCls, null, width, height);
    }

    public static <VG extends ViewGroup, V extends View> V addView(
            @NonNull VG parent,
            @NonNull Class<V> childCls,
            @Nullable Integer index,
            int width,
            int height) {
        try {
            Constructor<V> childConstructor = childCls.getConstructor(Context.class);
            V child = childConstructor.newInstance(parent.getContext());
            child.setLayoutParams(new VG.LayoutParams(width, height));
            if (index != null)
                parent.addView(child, index);
            else
                parent.addView(child);
            return child;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}