package com.hendraanggrian.kota.test.content

import android.support.test.InstrumentationRegistry
import com.hendraanggrian.kota.content.obtainStyledAttributesBy

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class TypedArraysTest {

    fun test() {
        InstrumentationRegistry.getTargetContext().theme.obtainStyledAttributesBy(null, intArrayOf(0)) {

        }
    }
}