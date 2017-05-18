package com.hendraanggrian.support.utils.text;

import android.graphics.Color;
import android.support.test.runner.AndroidJUnit4;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class SpansTest {

    @Test
    public void format() throws Exception {
        Spans.Spec[] specs = new Spans.Spec[]{
                Spans.of("World", Spannable.SPAN_EXCLUSIVE_EXCLUSIVE, new ForegroundColorSpan(Color.BLACK))
        };
        assertEquals(Spans.format("Hello %s", specs), "Hello world");
    }
}