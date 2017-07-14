package com.hendraanggrian.kota.app

import android.app.Activity
import android.content.Intent

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

@JvmOverloads
fun Activity.finishWithResult(resultCode: Int, data: Intent? = null) {
    setResult(resultCode, data)
    finish()
}