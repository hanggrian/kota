@file:JvmName("SupportPreferencesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.support.v4.app.Fragment

inline val Fragment.preferences: SharedPreferences get() = PreferenceManager.getDefaultSharedPreferences(context)

@JvmOverloads
inline fun Fragment.getPreferences(name: String, mode: Int = Context.MODE_PRIVATE): SharedPreferences = context.getSharedPreferences(name, mode)