package com.example.spannabletext;

import android.app.Activity;

import com.hendraanggrian.kota.LogsKt;
import com.hendraanggrian.kota.ServicesKt;
import com.hendraanggrian.kota.ToastsKt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public class Test {

    public static void main(Activity activity) {
        ServicesKt.getLayoutInflater(activity);

        LogsKt.debug(activity, "asdasd");
        ToastsKt.toast(activity, "");

        Collection a = new ArrayList<String>();
        Collection b = Arrays.<String>asList();
    }
}