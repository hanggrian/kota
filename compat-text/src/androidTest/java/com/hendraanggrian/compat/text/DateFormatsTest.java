package com.hendraanggrian.compat.text;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class DateFormatsTest {

    @Test
    public void format() throws Exception {
        assertEquals(DateFormats.format("dd-MM-yyyy", 1494940754084L), "16-05-2017");
    }
}