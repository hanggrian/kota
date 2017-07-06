package com.hendraanggrian.support.utils.view;

import android.app.Activity;
import android.content.Context;
import android.os.ResultReceiver;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import static com.hendraanggrian.support.utils.Preconditions.checkNotNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class SoftInputs {

    private SoftInputs() {
    }

    public static boolean showImplicit(@NonNull Activity activity) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && show(currentFocus, InputMethodManager.SHOW_IMPLICIT, null);
    }

    public static boolean showImplicit(@NonNull Activity activity, @Nullable ResultReceiver receiver) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && show(currentFocus, InputMethodManager.SHOW_IMPLICIT, receiver);
    }

    public static boolean showImplicit(@NonNull View view) {
        return show(view, InputMethodManager.SHOW_IMPLICIT, null);
    }

    public static boolean showImplicit(@NonNull View view, @Nullable ResultReceiver receiver) {
        return show(view, InputMethodManager.SHOW_IMPLICIT, receiver);
    }

    public static boolean showForced(@NonNull Activity activity) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && show(currentFocus, InputMethodManager.SHOW_FORCED, null);
    }

    public static boolean showForced(@NonNull Activity activity, @Nullable ResultReceiver receiver) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && show(currentFocus, InputMethodManager.SHOW_FORCED, receiver);
    }

    public static boolean showForced(@NonNull View view) {
        return show(view, InputMethodManager.SHOW_FORCED, null);
    }

    public static boolean showForced(@NonNull View view, @Nullable ResultReceiver receiver) {
        return show(view, InputMethodManager.SHOW_FORCED, receiver);
    }

    private static boolean show(@NonNull View view, int flags, @Nullable ResultReceiver receiver) {
        checkNotNull(view);
        InputMethodManager manager = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        return manager.showSoftInput(view, flags, receiver);
    }

    public static boolean hideImplicit(@NonNull Activity activity) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && hide(currentFocus, InputMethodManager.HIDE_IMPLICIT_ONLY, null);
    }

    public static boolean hideImplicit(@NonNull Activity activity, @Nullable ResultReceiver receiver) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && hide(currentFocus, InputMethodManager.HIDE_IMPLICIT_ONLY, receiver);
    }

    public static boolean hideImplicit(@NonNull View view) {
        return hide(view, InputMethodManager.HIDE_IMPLICIT_ONLY, null);
    }

    public static boolean hideImplicit(@NonNull View view, @Nullable ResultReceiver receiver) {
        return hide(view, InputMethodManager.HIDE_IMPLICIT_ONLY, receiver);
    }

    public static boolean hideNotAlways(@NonNull Activity activity) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && hide(currentFocus, InputMethodManager.HIDE_NOT_ALWAYS, null);
    }

    public static boolean hideNotAlways(@NonNull Activity activity, @Nullable ResultReceiver receiver) {
        checkNotNull(activity);
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && hide(currentFocus, InputMethodManager.HIDE_NOT_ALWAYS, receiver);
    }

    public static boolean hideNotAlways(@NonNull View view) {
        return hide(view, InputMethodManager.HIDE_NOT_ALWAYS, null);
    }

    public static boolean hideNotAlways(@NonNull View view, @Nullable ResultReceiver receiver) {
        return hide(view, InputMethodManager.HIDE_NOT_ALWAYS, receiver);
    }

    private static boolean hide(@NonNull View view, int flags, @Nullable ResultReceiver receiver) {
        checkNotNull(view);
        InputMethodManager manager = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        return manager.hideSoftInputFromWindow(view.getWindowToken(), flags, receiver);
    }
}