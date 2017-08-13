package com.hendraanggrian.common.test.text;

import android.graphics.Color;
import android.support.test.runner.AndroidJUnit4;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import com.hendraanggrian.common.text.Spannables;

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
        Spannables.setSpans(spannable, new ForegroundColorSpan(Color.RED));
        Spannables.removeSpans(spannable);
        Spannables.putSpans(spannable, "", new Function0<Object>() {
            @Override
            public Object invoke() {
                return new ForegroundColorSpan(Color.RED);
            }
        });
    }
}