package com.hendraanggrian.support.utils.text;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class DecimalFormatsTest {

    @Test
    public void format() throws Exception {
        assertNull(DecimalFormats.formats);
        assertEquals(DecimalFormats.format("###,###.##", 92000.5), "92,000.5");
        assertNotNull(DecimalFormats.formats);
        assertEquals(DecimalFormats.formats.size(), 1);
    }

    @Test
    public void prettyFormat() throws Exception {
        assertNull(DecimalFormats.suffixes);
        assertEquals(DecimalFormats.prettyFormat(0), "0");
        assertEquals(DecimalFormats.prettyFormat(5), "5");
        assertEquals(DecimalFormats.prettyFormat(999), "999");
        assertEquals(DecimalFormats.prettyFormat(1_000), "1k");
        assertEquals(DecimalFormats.prettyFormat(-5_821), "-5.8k");
        assertEquals(DecimalFormats.prettyFormat(10_500), "10k");
        assertEquals(DecimalFormats.prettyFormat(-101_800), "-101k");
        assertEquals(DecimalFormats.prettyFormat(2_000_000), "2M");
        assertEquals(DecimalFormats.prettyFormat(-7_800_000), "-7.8M");
        assertEquals(DecimalFormats.prettyFormat(92_150_000), "92M");
        assertEquals(DecimalFormats.prettyFormat(123_200_000), "123M");
        assertEquals(DecimalFormats.prettyFormat(9_999_999), "9.9M");
        assertEquals(DecimalFormats.prettyFormat(999_999_999_999_999_999L), "999P");
        assertEquals(DecimalFormats.prettyFormat(1_230_000_000_000_000L), "1.2P");
        assertEquals(DecimalFormats.prettyFormat(Long.MIN_VALUE), "-9.2E");
        assertEquals(DecimalFormats.prettyFormat(Long.MAX_VALUE), "9.2E");
        assertNotNull(DecimalFormats.suffixes);
        assertEquals(DecimalFormats.suffixes.size(), 6);
    }
}