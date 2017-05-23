package com.hendraanggrian.support.utils.content;

import android.support.test.runner.AndroidJUnit4;

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
    public void guessExtension() throws Exception {
        assertEquals(MimeTypes.getMimeTypeFromURL("/sdcard/home/important.txt"), "text/plain");

        assertEquals(MimeTypes.getMimeTypeFromExtension("txt"), "text/plain");
        assertEquals(MimeTypes.getMimeTypeFromExtension("jpg"), "image/jpeg");
        assertNull(MimeTypes.getMimeTypeFromExtension(""));
        assertNull(MimeTypes.getMimeTypeFromExtension(null));
    }

    @Test
    public void guessUrl() throws Exception{
        assertEquals(MimeTypes.getMimeTypeFromURL("http://www.somewebsite.com/someimage.jpg"), "image/jpeg");
        assertNull(MimeTypes.getMimeTypeFromURL(""));
        assertNull(MimeTypes.getMimeTypeFromURL(null));
    }
}