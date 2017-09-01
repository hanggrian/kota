package com.hendraanggrian.kota.core

import android.annotation.SuppressLint
import android.content.Context
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.kota.text.toMime
import com.hendraanggrian.kota.toast
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
        val context: Context? = null
        context!!.toast("")
    }
}