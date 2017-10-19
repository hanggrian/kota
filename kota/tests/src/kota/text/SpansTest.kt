package kota.text

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
        val spannable1 = "Hello world".toSpannable()
        spannable1.spanRange(0, 5, ForegroundColorSpan(Color.RED))
        spannable1.spanRange(6, spannable1.length, ForegroundColorSpan(Color.BLUE))
        assertEquals(spannable1.spans.size, 2)

        val spannable2 = "Hello world".toSpannable()
        spannable2.span(Regex("Hello"), { ForegroundColorSpan(Color.RED) })
        spannable2.span(Regex("world"), { ForegroundColorSpan(Color.BLUE) })
        assertEquals(spannable2.spans.size, 2)

        spannable2.clearSpans()
        assertEquals(spannable2.spans.size, 0)
    }
}