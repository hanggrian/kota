package kota

import android.support.test.runner.AndroidJUnit4
import android.util.Log
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BuildsTest {

    @Test
    @Throws(Exception::class)
    fun doIfVersion() {
        runIfAtLeast(21) {
            Log.d("runIfAtLeast()", true.toString())
        }
    }
}