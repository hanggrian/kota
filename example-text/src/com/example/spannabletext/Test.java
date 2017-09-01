package com.example.spannabletext;

import android.app.Activity;

import com.hendraanggrian.kota.Logs;
import com.hendraanggrian.kota.Services;
import com.hendraanggrian.kota.Toasts;

/**
 * Created by hendraanggrian on 8/26/17.
 */

public class Test {

    public static void main(Activity activity) {
        Services.getLayoutInflater(activity);

        Logs.debug(activity, "asdasd");
        Toasts.toast(activity, "");

        String.format("Hello %s World", "asdasd");
    }
}