package com.hendraanggrian.kota.test.texts

import android.graphics.Color
import android.support.test.runner.AndroidJUnit4
import android.text.style.ForegroundColorSpan
import com.hendraanggrian.kota.texts.*
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class SpansTest {

    @Test
    @Throws(Exception::class)
    fun test() {
        val spannable1 = spannableOf("Hello world")
        spannable1.setSpans(0, 5, ForegroundColorSpan(Color.RED))
        spannable1.setSpans(6, spannable1.length, ForegroundColorSpan(Color.BLUE))
        Assert.assertEquals(spannable1.spans.size, 2)

        val spannable2 = spannableOf("Hello world")
        spannable2.putSpans(Regex("Hello"), { ForegroundColorSpan(Color.RED) })
        spannable2.putSpans(Regex("world"), { ForegroundColorSpan(Color.BLUE) })
        Assert.assertEquals(spannable2.spans.size, 2)

        spannable2.clearSpans()
        Assert.assertEquals(spannable2.spans.size, 0)
    }
}