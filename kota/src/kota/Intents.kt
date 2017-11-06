@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.RequiresApi

/** Returns true if one or more activities can handle this intent. */
inline fun Intent.isResolvable(context: Context): Boolean = resolveActivity(context.packageManager) != null

/** Brings back result of this activity to previous activity that started it. */
@JvmOverloads
inline fun Activity.finishWithResult(resultCode: Int, data: Intent? = null) {
    setResult(resultCode, data)
    finish()
}