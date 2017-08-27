package com.hendraanggrian.kota.core.text

import android.graphics.Color
import android.support.test.runner.AndroidJUnit4
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import com.hendraanggrian.kota.text.putSpans
import com.hendraanggrian.kota.text.setSpans
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class SpannablesTestK {

    @Test
    @Throws(Exception::class)
    fun test() {
        val spannable = SpannableString("")
        spannable.setSpans(ForegroundColorSpan(Color.RED))
        // spannable.clearSpans()
        spannable.putSpans("", { ForegroundColorSpan(Color.RED) })
    }
}