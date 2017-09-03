@file:JvmName("SupportPreferencesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.contents

import android.content.Context
import android.content.SharedPreferences
import android.support.v4.app.Fragment
import com.hendraanggrian.kota.contents.preferences

/** Retrieve a default preferences of this Context */
inline val Fragment.preferences: SharedPreferences get() = context.preferences

/** Retrieve a default preferences of Context attached to this Fragment */
@JvmOverloads
inline fun Fragment.getPreferences(name: String, mode: Int = Context.MODE_PRIVATE): SharedPreferences = context.getSharedPreferences(name, mode)