package com.hendraanggrian.kota.test

import android.support.test.runner.AndroidJUnit4
import android.util.Log
import com.hendraanggrian.kota.runIfAtLeast
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
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