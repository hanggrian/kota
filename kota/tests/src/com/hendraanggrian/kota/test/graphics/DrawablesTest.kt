package com.hendraanggrian.kota.test.graphics

import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.runner.AndroidJUnit4
import junit.framework.Assert.assertNotNull
import kota.contents.getDrawable2
import kota.graphics.toBitmap
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class DrawablesTest {

    @Test
    @Throws(Exception::class)
    fun bitmap() {
        val drawable = getTargetContext().getDrawable2(android.R.drawable.ic_delete)
        assertNotNull(drawable)
        assertNotNull(drawable.toBitmap())
    }
}