package com.example.spannabletext;

import android.app.Activity;

import com.hendraanggrian.kota.Logs;
import com.hendraanggrian.kota.Services;
import com.hendraanggrian.kota.ToastsKt;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public class Test {

    public static void main(Activity activity) {
        Services.getLayoutInflater(activity);

        Logs.debug(activity, "asdasd");
        ToastsKt.toast(activity, "");
    }
}