@file:JvmName("Activities")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.annotation.TargetApi
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.RequiresApi

inline fun Context.startActivityResolved(intent: Intent, fallback: () -> Unit) = when {
    intent.resolveActivity(packageManager) != null -> startActivity(intent)
    else -> fallback()
}

inline fun Activity.startActivityResolved(intent: Intent, fallback: () -> Unit) = when {
    intent.resolveActivity(packageManager) != null -> startActivity(intent)
    else -> fallback()
}

inline fun Fragment.startActivityResolved(intent: Intent, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivity(intent)
    else -> fallback()
}

@TargetApi(16)
@RequiresApi(16)
inline fun Context.startActivityResolved(intent: Intent, options: Bundle, fallback: () -> Unit) = when {
    intent.resolveActivity(packageManager) != null -> startActivity(intent, options)
    else -> fallback()
}

@TargetApi(16)
@RequiresApi(16)
inline fun Activity.startActivityResolved(intent: Intent, options: Bundle, fallback: () -> Unit) = when {
    intent.resolveActivity(packageManager) != null -> startActivity(intent, options)
    else -> fallback()
}

@TargetApi(16)
@RequiresApi(16)
inline fun Fragment.startActivityResolved(intent: Intent, options: Bundle, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivity(intent, options)
    else -> fallback()
}

inline fun Context.startActivitiesResolved(intents: Array<Intent>, fallback: () -> Unit) = when {
    intents.all { it.resolveActivity(packageManager) != null } -> startActivities(intents)
    else -> fallback()
}

inline fun Activity.startActivitiesResolved(intents: Array<Intent>, fallback: () -> Unit) = when {
    intents.all { it.resolveActivity(packageManager) != null } -> startActivities(intents)
    else -> fallback()
}

@TargetApi(16)
@RequiresApi(16)
inline fun Context.startActivitiesResolved(intents: Array<Intent>, options: Bundle, fallback: () -> Unit) = when {
    intents.all { it.resolveActivity(packageManager) != null } -> startActivities(intents, options)
    else -> fallback()
}

@TargetApi(16)
@RequiresApi(16)
inline fun Activity.startActivitiesResolved(intents: Array<Intent>, options: Bundle, fallback: () -> Unit) = when {
    intents.all { it.resolveActivity(packageManager) != null } -> startActivities(intents, options)
    else -> fallback()
}

inline fun Activity.startActivityForResultResolved(intent: Intent, requestCode: Int, fallback: () -> Unit) = when {
    intent.resolveActivity(packageManager) != null -> startActivityForResult(intent, requestCode)
    else -> fallback()
}

inline fun Fragment.startActivityForResultResolved(intent: Intent, requestCode: Int, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivityForResult(intent, requestCode)
    else -> fallback()
}

@TargetApi(16)
@RequiresApi(16)
inline fun Activity.startActivityForResultResolved(intent: Intent, requestCode: Int, options: Bundle, fallback: () -> Unit) = when {
    intent.resolveActivity(packageManager) != null -> startActivityForResult(intent, requestCode, options)
    else -> fallback()
}

@TargetApi(16)
@RequiresApi(16)
inline fun Fragment.startActivityForResultResolved(intent: Intent, requestCode: Int, options: Bundle, fallback: () -> Unit) = when {
    intent.resolveActivity(activity.packageManager) != null -> startActivityForResult(intent, requestCode, options)
    else -> fallback()
}

inline fun Activity.finishWithResult(resultCode: Int, data: Intent) {
    setResult(resultCode, data)
    finish()
}