package com.hendraanggrian.support.utils.view;

import android.app.Activity;
import android.content.Context;
import android.os.ResultReceiver;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class InputMethods {

    @IntDef({
            0,
            InputMethodManager.SHOW_IMPLICIT,
            InputMethodManager.SHOW_FORCED
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowFlags {
    }

    @IntDef({
            0,
            InputMethodManager.HIDE_IMPLICIT_ONLY,
            InputMethodManager.HIDE_NOT_ALWAYS
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface HideFlags {
    }

    private InputMethods() {
    }

    public static boolean showSoftInput(@NonNull Activity activity) {
        return showSoftInput(activity, InputMethodManager.SHOW_IMPLICIT);
    }

    public static boolean showSoftInput(@NonNull Activity activity, @ShowFlags int flags) {
        return showSoftInput(activity, flags, null);
    }

    public static boolean showSoftInput(@NonNull Activity activity, @ShowFlags int flags, @Nullable ResultReceiver receiver) {
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && showSoftInput(currentFocus, flags, receiver);
    }

    public static boolean showSoftInput(@NonNull View view) {
        return showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
    }

    public static boolean showSoftInput(@NonNull View view, @ShowFlags int flags) {
        return showSoftInput(view, flags, null);
    }

    public static boolean showSoftInput(@NonNull View view, @ShowFlags int flags, @Nullable ResultReceiver receiver) {
        return getInputMethodManager(view.getContext()).showSoftInput(view, flags, receiver);
    }

    public static boolean hideSoftInput(@NonNull Activity activity) {
        return hideSoftInput(activity, InputMethodManager.HIDE_NOT_ALWAYS);
    }

    public static boolean hideSoftInput(@NonNull Activity activity, @HideFlags int flags) {
        return hideSoftInput(activity, flags, null);
    }

    public static boolean hideSoftInput(@NonNull Activity activity, @HideFlags int flags, @Nullable ResultReceiver receiver) {
        View currentFocus = activity.getCurrentFocus();
        return currentFocus != null && hideSoftInput(currentFocus, flags, receiver);
    }

    public static boolean hideSoftInput(@NonNull View view) {
        return hideSoftInput(view, InputMethodManager.HIDE_NOT_ALWAYS);
    }

    public static boolean hideSoftInput(@NonNull View view, @HideFlags int flags) {
        return hideSoftInput(view, flags, null);
    }

    public static boolean hideSoftInput(@NonNull View view, @HideFlags int flags, @Nullable ResultReceiver receiver) {
        return getInputMethodManager(view.getContext()).hideSoftInputFromWindow(view.getWindowToken(), flags, receiver);
    }

    @NonNull
    private static InputMethodManager getInputMethodManager(@NonNull Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }
}