@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Activity
import android.content.Intent
import android.support.annotation.MenuRes
import android.view.Menu

inline fun Activity.inflateMenu(@MenuRes menuRes: Int, menu: Menu) = menuInflater.inflate(menuRes, menu)

/** Brings back result of this activity to previous activity that started it. */
@JvmOverloads
inline fun Activity.finishWithResult(resultCode: Int, data: Intent? = null) {
    setResult(resultCode, data)
    finish()
}