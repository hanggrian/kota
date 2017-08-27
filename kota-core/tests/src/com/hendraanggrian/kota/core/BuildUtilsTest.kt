package com.hendraanggrian.kota.core

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.hendraanggrian.kota.runIfMinSdk
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class BuildUtilsTest {

    @JvmField var rule = ActivityTestRule(AppCompatActivity::class.java)

    @Test
    @Throws(Exception::class)
    fun doIfVersion() {
        runIfMinSdk(21) {
            Log.d("runIfMinSdk()", true.toString())
        }
    }
}