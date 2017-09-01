@file:JvmName("PreferencesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.app.Fragment
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

inline val Context.preferences: SharedPreferences get() = PreferenceManager.getDefaultSharedPreferences(this)

inline val Fragment.preferences: SharedPreferences get() = activity.preferences

@JvmOverloads
inline fun Context.getPreferences(name: String, mode: Int = Context.MODE_PRIVATE): SharedPreferences = getSharedPreferences(name, mode)

@JvmOverloads
inline fun Fragment.getPreferences(name: String, mode: Int = Context.MODE_PRIVATE): SharedPreferences = activity.getPreferences(name, mode)

inline fun SharedPreferences.getString(key: String): String {
    require(contains(key))
    return getString(key, null)
}

inline fun SharedPreferences.getStringSet(key: String): MutableSet<String> {
    require(contains(key))
    return getStringSet(key, null)
}

inline fun SharedPreferences.getInt(key: String): Int {
    require(contains(key))
    return getInt(key, 0)
}

inline fun SharedPreferences.getLong(key: String): Long {
    require(contains(key))
    return getLong(key, 0L)
}

inline fun SharedPreferences.getFloat(key: String): Float {
    require(contains(key))
    return getFloat(key, 0F)
}

inline fun SharedPreferences.getBoolean(key: String): Boolean {
    require(contains(key))
    return getBoolean(key, false)
}