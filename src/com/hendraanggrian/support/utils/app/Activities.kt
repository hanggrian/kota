package com.hendraanggrian.support.utils.app

import android.app.Activity
import android.content.Intent

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun Activity.finishWithResult(resultCode: Int) = finishWithResult(resultCode, null)

fun Activity.finishWithResult(resultCode: Int, data: Intent?) {
    setResult(resultCode, data)
    finish()
}