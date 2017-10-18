package kota.texts

import android.graphics.Color
import android.support.test.runner.AndroidJUnit4
import android.text.style.ForegroundColorSpan
import org.junit.Assert.assertEquals
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
        spannable1.setSpan(0, 5, ForegroundColorSpan(Color.RED))
        spannable1.setSpan(6, spannable1.length, ForegroundColorSpan(Color.BLUE))
        assertEquals(spannable1.spans.size, 2)

        val spannable2 = spannableOf("Hello world")
        spannable2.putSpans(Regex("Hello"), { ForegroundColorSpan(Color.RED) })
        spannable2.putSpans(Regex("world"), { ForegroundColorSpan(Color.BLUE) })
        assertEquals(spannable2.spans.size, 2)

        spannable2.clearSpans()
        assertEquals(spannable2.spans.size, 0)
    }
}