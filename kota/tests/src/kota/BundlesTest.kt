package kota

import android.support.test.runner.AndroidJUnit4
import kota.bundleOf
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BundlesTest {

    @Test
    @Throws(Exception::class)
    fun doIfVersion() {
        val bundle1 = bundleOf("Some key", 1)
        val bundle2 = bundleOf(Pair("Some key", 1), Pair("Another key", 2))
    }
}