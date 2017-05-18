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
        assertEquals(MimeTypes.guessExtension("txt"), "text/plain");
        assertEquals(MimeTypes.guessExtension("jpg"), "image/jpeg");
        assertNull(MimeTypes.guessExtension(""));
        assertNull(MimeTypes.guessExtension(null));
    }

    @Test
    public void guessUrl() throws Exception{
        assertEquals(MimeTypes.guessURL("http://www.somewebsite.com/someimage.jpg"), "image/jpeg");
        assertNull(MimeTypes.guessURL(""));
        assertNull(MimeTypes.guessURL(null));
    }
}