package kota.resources

import android.content.res.Configuration
import android.os.Build
import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class ResourcesTest {

    private val context = getTargetContext()

    @Test
    @Throws(Exception::class)
    fun configurations() {
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

    @Test
    @Throws(Exception::class)
    fun displayMetrics() {
        14.dp
        14.sp
        dpOf(14)
        spOf(14)
    }

    @Test
    @Throws(Exception::class)
    fun resources() {
        assertEquals(context.getText(android.R.string.ok), "OK")
    }
}