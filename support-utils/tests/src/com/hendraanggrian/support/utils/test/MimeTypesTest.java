package com.hendraanggrian.support.utils.test;

import android.annotation.SuppressLint;
import android.support.test.runner.AndroidJUnit4;

import com.hendraanggrian.support.utils.content.MimeTypes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class MimeTypesTest {

    @Test
    @SuppressLint("SdCardPath")
    public void guessExtension() throws Exception {
        Assert.assertEquals(MimeTypes.fromUrlOrNull("/sdcard/home/important.txt"), "text/plain");

        assertEquals(MimeTypes.fromExtensionOrNull("txt"), "text/plain");
        assertEquals(MimeTypes.fromExtensionOrNull("jpg"), "image/jpeg");
        assertNull(MimeTypes.fromExtensionOrNull(""));
        assertNull(MimeTypes.fromExtensionOrNull(null));
    }

    @Test
    public void guessUrl() throws Exception {
        assertEquals(MimeTypes.fromUrlOrNull("http://www.somewebsite.com/someimage.jpg"), "image/jpeg");
        assertNull(MimeTypes.fromUrlOrNull(""));
        assertNull(MimeTypes.fromUrlOrNull(null));
    }
}