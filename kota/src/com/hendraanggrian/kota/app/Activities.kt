package com.hendraanggrian.kota.app

import android.app.Activity
import android.content.Intent

@JvmOverloads
fun Activity.finishWithResult(resultCode: Int, data: Intent? = null) {
    setResult(resultCode, data)
    finish()
}