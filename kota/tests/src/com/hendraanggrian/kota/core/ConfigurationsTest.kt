package com.hendraanggrian.kota.core

import android.content.res.Configuration
import android.os.Build
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.kota.resources.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class ConfigurationsTest {

    @Test
    @Throws(Exception::class)
    fun test() {
        val context = InstrumentationRegistry.getTargetContext()
        context.screenSize
        context.isScreenSizeAtLeast(Configuration.SCREENLAYOUT_SIZE_LARGE)
        context.isScreenLong
        if (Build.VERSION.SDK_INT >= 17) {
            context.isRtl
        }
        context.hasTouchscreen
        context.hasKeyboard
        context.isKeyboardHidden
        context.isHardKeyboardHidden
        context.hasNavigation
        context.isNavigationHidden
        context.isLandscape
        context.typeMode
        context.isTypeNormal
        context.nightMode
        context.isNightMode
    }
}