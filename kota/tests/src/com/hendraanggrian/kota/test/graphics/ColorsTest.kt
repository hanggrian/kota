package com.hendraanggrian.kota.test.graphics

import android.support.test.runner.AndroidJUnit4
import kota.graphics.colorIntOf
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class ColorsTest {

    @Test
    @Throws(Exception::class)
    fun colorInt() {
        val white = colorIntOf("#FFFFFF")
    }
}