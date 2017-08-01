package com.hendraanggrian.kota.test.text

import android.graphics.Color
import android.support.test.runner.AndroidJUnit4
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import com.hendraanggrian.kota.text.putSpans
import com.hendraanggrian.kota.text.removeSpans
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
        spannable.setSpans(spans = ForegroundColorSpan(Color.RED))
        spannable.removeSpans()
        spannable.putSpans("", spans = {
            ForegroundColorSpan(Color.RED)
        })
    }
}