@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.preference.PreferenceManager

@PublishedApi internal const val DEFAULT_VALUE: Int = 0

inline val Context.sharedPreferences: SharedPreferences get() = PreferenceManager.getDefaultSharedPreferences(this)
inline val Fragment.sharedPreferences: SharedPreferences get() = activity.sharedPreferences
inline val Dialog.sharedPreferences: SharedPreferences get() = context.sharedPreferences

inline fun Context.getSharedPreferences(name: String): SharedPreferences = getSharedPreferences(name, MODE_PRIVATE)
inline fun Fragment.getSharedPreferences(name: String): SharedPreferences = activity.getSharedPreferences(name)
inline fun Dialog.getSharedPreferences(name: String): SharedPreferences = context.getSharedPreferences(name)

/**
 * Retrieve a String value from the sharedPreferences.
 * @throws IllegalArgumentException if there is no preference with this name.
 * @throws ClassCastException if there is a preference with this name that is not a String.
 */
inline fun SharedPreferences.getString(key: String): String {
    require(contains(key))
    return getString(key, null)
}

/**
 * Retrieve a Set value from the sharedPreferences.
 * @throws IllegalArgumentException if there is no preference with this name.
 * @throws ClassCastException if there is a preference with this name that is not a Set.
 */
inline fun SharedPreferences.getStringSet(key: String): MutableSet<String> {
    require(contains(key))
    return getStringSet(key, null)
}

/**
 * Retrieve an Int value from the sharedPreferences.
 * @throws IllegalArgumentException if there is no preference with this name.
 * @throws ClassCastException if there is a preference with this name that is not an Int.
 */
inline fun SharedPreferences.getInt(key: String): Int {
    require(contains(key))
    return getInt(key, DEFAULT_VALUE)
}

/**
 * Retrieve a Long value from the sharedPreferences.
 * @throws IllegalArgumentException if there is no preference with this name.
 * @throws ClassCastException if there is a preference with this name that is not a Long.
 */
inline fun SharedPreferences.getLong(key: String): Long {
    require(contains(key))
    return getLong(key, DEFAULT_VALUE.toLong())
}

/**
 * Retrieve a Float value from the sharedPreferences.
 * @throws IllegalArgumentException if there is no preference with this name.
 * @throws ClassCastException if there is a preference with this name that is not a Float.
 */
inline fun SharedPreferences.getFloat(key: String): Float {
    require(contains(key))
    return getFloat(key, DEFAULT_VALUE.toFloat())
}

/**
 * Retrieve a Boolean value from the sharedPreferences.
 * @throws IllegalArgumentException if there is no preference with this name.
 * @throws ClassCastException if there is a preference with this name that is not a Boolean.
 */
inline fun SharedPreferences.getBoolean(key: String): Boolean {
    require(contains(key))
    return getBoolean(key, DEFAULT_VALUE != 0)
}