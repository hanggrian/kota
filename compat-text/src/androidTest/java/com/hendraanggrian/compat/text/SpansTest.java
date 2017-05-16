package com.hendraanggrian.compat.text;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class SpansTest {

    @Test
    public void format() throws Exception {
        List<Integer> a = Spans.countOccurences("%s asd %%", "%");
        List<Integer> b = Spans.countOccurences("%s asd %%", "%%");
        a.removeAll(b);
        throw new RuntimeException(a.toString());
    }
}