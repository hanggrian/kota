@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatDialog
import kota.preferences

/** Retrieve a default preferences of this Context. */
inline val AppCompatDialog.preferences: SharedPreferences get() = context.preferences

/** Retrieve a default preferences of Context attached to this Fragment. */
@JvmOverloads
inline fun AppCompatDialog.getPreferences(name: String, mode: Int = Context.MODE_PRIVATE): SharedPreferences = context.getSharedPreferences(name, mode)