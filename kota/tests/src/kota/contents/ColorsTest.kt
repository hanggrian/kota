package kota.contents

import android.support.test.runner.AndroidJUnit4
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