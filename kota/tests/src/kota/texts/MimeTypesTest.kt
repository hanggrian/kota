package kota.texts

import android.annotation.SuppressLint
import android.support.test.runner.AndroidJUnit4
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
        assertEquals("/sdcard/home/important.txt".mimeType, "text/plain")
        assertEquals("txt".mimeType, "text/plain")
        assertEquals("jpg".mimeType, "image/jpeg")
        assertNull("".mimeType)
    }

    @Test
    @Throws(Exception::class)
    fun guessUrl() {
        assertEquals("http://www.somewebsite.com/someimage.jpg".mimeType, "image/jpeg")
    }
}