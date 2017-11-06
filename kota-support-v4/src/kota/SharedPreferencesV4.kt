@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.SharedPreferences
import android.support.v4.app.Fragment

/** Retrieve a default sharedPreferences of this Context. */
inline val Fragment.sharedPreferences: SharedPreferences get() = context!!.sharedPreferences