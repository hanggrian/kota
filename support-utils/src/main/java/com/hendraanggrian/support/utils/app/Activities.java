package com.hendraanggrian.support.utils.app;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Activities {

    private Activities() {
    }

    public static void finishWithResult(@NonNull Activity activity, int resultCode) {
        finishWithResult(activity, resultCode, null);
    }

    public static void finishWithResult(@NonNull Activity activity, int resultCode, @Nullable Intent result) {
        activity.setResult(resultCode, result);
        activity.finish();
    }

    public static void finishWithOkResult(@NonNull Activity activity) {
        finishWithResult(activity, RESULT_OK);
    }

    public static void finishWithOkResult(@NonNull Activity activity, @Nullable Intent result) {
        finishWithResult(activity, RESULT_OK, result);
    }

    public static void finishWithCanceledResult(@NonNull Activity activity) {
        finishWithResult(activity, RESULT_CANCELED);
    }

    public static void finishWithCanceledResult(@NonNull Activity activity, @Nullable Intent result) {
        finishWithResult(activity, RESULT_CANCELED, result);
    }

    public static boolean isResultOk(int userRequestCode, int requestCode, int resultCode) {
        return userRequestCode == requestCode && resultCode == RESULT_OK;
    }

    public static boolean isResultCanceled(int userRequestCode, int requestCode, int resultCode) {
        return userRequestCode == requestCode && resultCode == RESULT_CANCELED;
    }
}