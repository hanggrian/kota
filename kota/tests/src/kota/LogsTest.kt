package kota

import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LogsTest {

    @Test
    fun debugTest() {
        debug("a", 1)
        debug("b", arrayOf(1, 2, 3))
        debug("c", listOf(1, 2, 3))
    }
}