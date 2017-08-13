package com.hendraanggrian.common.test.content

import android.support.test.InstrumentationRegistry
import com.hendraanggrian.common.content.openTypedArray

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class TypedArraysTest {

    fun test() {
        InstrumentationRegistry.getTargetContext().theme.openTypedArray(null, intArrayOf(0)) {

        }
    }
}