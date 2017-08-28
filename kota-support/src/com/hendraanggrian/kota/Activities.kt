@file:JvmName("SupportActivities")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment

inline fun Fragment.startActivityResolved(intent: Intent, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivity(intent)
    else -> fallback()
}

inline fun Fragment.startActivityResolved(intent: Intent, options: Bundle, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivity(intent, options)
    else -> fallback()
}

inline fun Fragment.startActivityForResultResolved(intent: Intent, requestCode: Int, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivityForResult(intent, requestCode)
    else -> fallback()
}

inline fun Fragment.startActivityForResultResolved(intent: Intent, requestCode: Int, options: Bundle, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivityForResult(intent, requestCode, options)
    else -> fallback()
}