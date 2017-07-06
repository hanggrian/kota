package com.hendraanggrian.support.utils.view;

import android.content.Context;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;
import static com.hendraanggrian.support.utils.Preconditions.checkNotNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Views {

    @IntDef({VISIBLE, INVISIBLE, GONE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    private Views() {
    }

    @NonNull
    public static <T extends View> T newInstance(@NonNull Class<T> viewCls, @NonNull Context context) {
        return newInstance(viewCls, context, null);
    }

    @NonNull
    @SuppressWarnings("TryWithIdenticalCatches")
    public static <T extends View> T newInstance(@NonNull Class<T> viewCls, @NonNull Context context, @Nullable OnCreatedListener<T> listener) {
        checkNotNull(viewCls);
        checkNotNull(context);
        try {
            T view = viewCls.getConstructor(Context.class).newInstance(context);
            if (listener != null) {
                listener.onCreated(view);
            }
            return view;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + viewCls.getSimpleName(), e);
        } catch (InstantiationException e) {
            throw new RuntimeException("Unable to invoke " + viewCls.getSimpleName(), e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Unable to invoke " + viewCls.getSimpleName(), e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to invoke " + viewCls.getSimpleName(), e);
        }
    }

    public static boolean setVisibility(@NonNull View view, @Visibility int visibility) {
        checkNotNull(view);
        if (view.getVisibility() != visibility) {
            view.setVisibility(visibility);
        }
        return visibility == VISIBLE;
    }

    public static boolean setVisible(@NonNull View view, boolean visible) {
        return setVisibility(view, visible ? VISIBLE : GONE);
    }

    public interface OnCreatedListener<T> {

        void onCreated(@NonNull T v);
    }
}