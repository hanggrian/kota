@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.v7.preference.Preference
import android.support.v7.preference.PreferenceFragmentCompat

inline fun <reified T : Preference> PreferenceFragmentCompat.find(key: CharSequence): T = findPreference(key)!! as T

inline fun <reified T : Preference> PreferenceFragmentCompat.findNullable(key: CharSequence): T? = findPreference(key) as T?