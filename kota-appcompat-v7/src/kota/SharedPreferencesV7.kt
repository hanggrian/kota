@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.SharedPreferences
import android.support.v7.app.AppCompatDialog

/** Retrieve a default sharedPreferences of this Context. */
inline val AppCompatDialog.sharedPreferences: SharedPreferences get() = context.sharedPreferences