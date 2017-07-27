package com.hendraanggrian.kota.test.content.res

import android.content.res.Configuration
import android.os.Build
import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.kota.content.res.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class ConfigurationsTestK {

    @Test
    @Throws(Exception::class)
    fun test() {
        val context = getTargetContext()
        context.getScreenSize()
        context.isScreenSizeAtLeast(Configuration.SCREENLAYOUT_SIZE_LARGE)
        context.isScreenLong()
        if (Build.VERSION.SDK_INT >= 17) {
            context.isRtl()
        }
        context.hasTouchscreen()
        context.hasKeyboard()
        context.isKeyboardHidden()
        context.isHardKeyboardHidden()
        context.hasNavigation()
        context.isNavigationHidden()
        context.isLandscape()
        context.getTypeMode()
        context.isTypeModeNormal()
        context.getNightMode()
        context.isNightMode()
    }
}