package kota.resources

import android.support.test.runner.AndroidJUnit4
import kota.colorIntOf
import kota.toColorInt
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
        val white = "#FFFFFF".toColorInt()
    }
}