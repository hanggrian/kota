@file:JvmName("Preferences")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.app.Fragment
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

inline val Fragment.preferences: SharedPreferences get() = PreferenceManager.getDefaultSharedPreferences(activity)
inline val Context.preferences: SharedPreferences get() = PreferenceManager.getDefaultSharedPreferences(this)

@JvmOverloads inline fun Fragment.getPreferences(name: String, mode: Int = Context.MODE_PRIVATE): SharedPreferences = activity.getPreferences(name, mode)
@JvmOverloads inline fun Context.getPreferences(
        name: String,
        mode: Int = Context.MODE_PRIVATE
): SharedPreferences = getSharedPreferences(name, mode)