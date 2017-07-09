package com.hendraanggrian.support.utils.test

import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.support.utils.content.hasTouchscreen
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class ConfigurationsTest {

    @Test
    @Throws(Exception::class)
    fun hasTouchscreen() {
        Assert.assertEquals(getTargetContext().hasTouchscreen(), true)
    }
}