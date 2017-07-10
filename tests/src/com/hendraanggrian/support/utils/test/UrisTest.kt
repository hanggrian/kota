package com.hendraanggrian.support.utils.test

import android.annotation.SuppressLint
import android.net.Uri
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.support.utils.content.isFile
import com.hendraanggrian.support.utils.content.isNetwork
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class UrisTest {

    @Test
    @Throws(Exception::class)
    fun networkUri() {
        Assert.assertEquals(Uri.parse("https://www.somewebsite.com/mytext.txt").isNetwork(), true)
    }

    @Test
    @SuppressLint("SdCardPath")
    @Throws(Exception::class)
    fun localUri() {
        assertEquals(Uri.fromFile(File("/sdcard/android")).isFile(), true)
    }
}