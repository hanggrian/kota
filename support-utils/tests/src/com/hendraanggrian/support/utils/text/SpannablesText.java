package com.hendraanggrian.support.utils.text;

import android.graphics.Color;
import android.support.test.runner.AndroidJUnit4;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class SpannablesText {

    @Test
    public void removeSpansText() throws Exception {
        Object span = new ForegroundColorSpan(Color.BLACK);
        Spannable spannable = new SpannableString("Hello world");
        Spannables.setSpans(spannable, span);
        assertEquals(spannable.getSpans(0, spannable.length(), Object.class).length, 1);
        Spannables.removeSpans(spannable, span, new Object(), null);
        assertEquals(spannable.getSpans(0, spannable.length(), Object.class).length, 0);
    }
}