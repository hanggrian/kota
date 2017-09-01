@file:JvmName("PreferencesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

inline val Context.preferences: SharedPreferences get() = PreferenceManager.getDefaultSharedPreferences(this)

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

inline fun SharedPreferences.getBoolean(key: String): Boolean {
    require(contains(key))
    return getBoolean(key, false)
}