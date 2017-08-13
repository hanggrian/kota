@file:JvmName("Activities")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.app

import android.app.Activity
import android.content.Intent

inline fun Activity.finishWithResult(
        resultCode: Int,
        noinline data: () -> Intent?
): Unit {
    setResult(resultCode, data())
    finish()
}