@file:JvmName("Activities")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.app

import android.app.Activity
import android.content.Intent

@JvmOverloads inline fun Activity.finishWithResult(
        resultCode: Int,
        data: Intent? = null
): Unit {
    setResult(resultCode, data)
    finish()
}