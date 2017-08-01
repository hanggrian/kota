package com.hendraanggrian.kota.test.webkit

import android.annotation.SuppressLint
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.kota.content.toMime
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
        assertEquals("/sdcard/home/important.txt".toMime(), "text/plain")
        assertEquals("txt".toMime(), "text/plain")
        assertEquals("jpg".toMime(), "image/jpeg")
        assertNull("".toMime())
    }

    @Test
    @Throws(Exception::class)
    fun guessUrl() {
        assertEquals("http://www.somewebsite.com/someimage.jpg".toMime(), "image/jpeg")
    }
}