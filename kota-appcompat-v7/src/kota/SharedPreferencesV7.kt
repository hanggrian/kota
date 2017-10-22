@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.support.v7.app.AppCompatDialog

/** Retrieve a default sharedPreferences of this Context. */
inline val AppCompatDialog.sharedPreferences: SharedPreferences get() = context.sharedPreferences

/** Retrieve a default sharedPreferences of Context attached to this Fragment. */
inline fun AppCompatDialog.getSharedPreferences(name: String): SharedPreferences = context.getSharedPreferences(name, MODE_PRIVATE)