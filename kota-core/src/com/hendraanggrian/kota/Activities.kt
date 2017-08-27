@file:JvmName("Activities")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.app.Activity
import android.content.Intent
import android.support.annotation.MenuRes
import android.view.Menu
import android.view.View
import android.view.ViewGroup

inline val Activity.contentView: View? get() = findViewById<ViewGroup>(android.R.id.content)?.getChildAt(0)

inline fun Activity.inflateMenu(@MenuRes menuRes: Int, menu: Menu) = menuInflater.inflate(menuRes, menu)

inline fun Activity.finishWithResult(resultCode: Int, data: Intent) {
    setResult(resultCode, data)
    finish()
}