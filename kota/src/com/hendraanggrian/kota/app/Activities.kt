@file:JvmName("Activities")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.app

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.IntRange

@JvmOverloads
inline fun Activity.startActivityForResultBy(intent: Intent, @IntRange(from = 0, to = 65535) requestCode: Int, options: Bundle? = null): Unit {
    if (Build.VERSION.SDK_INT >= 16 && options != null) {
        startActivityForResult(intent, requestCode, options)
    } else {
        startActivityForResult(intent, requestCode)
    }
}

@JvmOverloads
inline fun Fragment.startActivityForResultBy(intent: Intent, @IntRange(from = 0, to = 65535) requestCode: Int, options: Bundle? = null): Unit {
    if (Build.VERSION.SDK_INT >= 16 && options != null) {
        startActivityForResult(intent, requestCode, options)
    } else {
        startActivityForResult(intent, requestCode)
    }
}

@JvmOverloads
inline fun android.support.v4.app.Fragment.startActivityForResultBy(intent: Intent, @IntRange(from = 0, to = 65535) requestCode: Int, options: Bundle? = null): Unit {
    if (Build.VERSION.SDK_INT >= 16 && options != null) {
        startActivityForResult(intent, requestCode, options)
    } else {
        startActivityForResult(intent, requestCode)
    }
}

@JvmOverloads
inline fun Activity.finishWithResult(resultCode: Int, data: Intent? = null): Unit {
    setResult(resultCode, data)
    finish()
}