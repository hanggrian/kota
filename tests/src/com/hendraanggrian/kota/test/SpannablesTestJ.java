package com.hendraanggrian.kota.test;

import android.graphics.Color;
import android.support.test.runner.AndroidJUnit4;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import com.hendraanggrian.kota.text.SpannablesKt;

import org.junit.Test;
import org.junit.runner.RunWith;

import kotlin.jvm.functions.Function0;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class SpannablesTestJ {

    @Test
    public void test() throws Exception {
        Spannable spannable = new SpannableString("");
        SpannablesKt.setSpans(spannable, new ForegroundColorSpan(Color.RED));
        SpannablesKt.removeSpans(spannable);
        SpannablesKt.putSpans(spannable, "", new Function0<Object>() {
            @Override
            public Object invoke() {
                return new ForegroundColorSpan(Color.RED);
            }
        });
    }
}