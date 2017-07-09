package com.hendraanggrian.support.utils.test

import android.annotation.SuppressLint
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.support.utils.content.extensionToMime
import com.hendraanggrian.support.utils.content.pathToMime
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class MimeTypesTest {

    @Test
    @SuppressLint("SdCardPath")
    @Throws(Exception::class)
    fun guessExtension() {
        assertEquals("/sdcard/home/important.txt".pathToMime(), "text/plain")
        assertEquals("txt".extensionToMime(), "text/plain")
        assertEquals("jpg".extensionToMime(), "image/jpeg")
        assertNull("".extensionToMime())
    }

    @Test
    @Throws(Exception::class)
    fun guessUrl() {
        assertEquals("http://www.somewebsite.com/someimage.jpg".pathToMime(), "image/jpeg")
    }
}