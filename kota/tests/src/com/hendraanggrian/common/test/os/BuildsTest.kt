package com.hendraanggrian.common.test.os

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.hendraanggrian.common.os.runIfMinSdk
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class BuildsTest {

    @JvmField var rule = ActivityTestRule(AppCompatActivity::class.java)

    @Test
    @Throws(Exception::class)
    fun doIfVersion() {
        runIfMinSdk(21) {
            Log.d("runIfMinSdk()", true.toString())
        }
    }
}