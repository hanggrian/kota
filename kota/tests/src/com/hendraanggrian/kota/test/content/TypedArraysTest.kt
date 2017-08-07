package com.hendraanggrian.kota.test.content

import android.support.test.InstrumentationRegistry
import com.hendraanggrian.kota.content.openTypedArray

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class TypedArraysTest {

    fun test() {
        InstrumentationRegistry.getTargetContext().theme.openTypedArray(null, intArrayOf(0)) {

        }
    }
}