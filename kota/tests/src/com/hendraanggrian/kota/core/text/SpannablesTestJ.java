package com.hendraanggrian.kota.core.text;

import android.support.test.runner.AndroidJUnit4;
import android.text.Spannable;
import android.text.SpannableString;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class SpannablesTestJ {

    @Test
    public void test() throws Exception {
        Spannable spannable = new SpannableString("");
        /*Spans.setSpans(spannable, new ForegroundColorSpan(Color.RED));
        Spans.removeSpans(spannable);
        Spans.putSpans(spannable, "", new Function0<Object>() {
            @Override
            public Object invoke() {
                return new ForegroundColorSpan(Color.RED);
            }
        });*/
    }
}