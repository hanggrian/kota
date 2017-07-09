package com.hendraanggrian.support.utils.test

import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.support.utils.content.Themes
import org.junit.Assert.assertNotEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class ThemesTest {

    @Test
    fun test() {
        assertNotEquals(Themes.getColorOrDefault(getTargetContext(), android.R.attr.colorAccent, 0).toLong(), 0)
    }
}