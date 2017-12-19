@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.preference.Preference
import android.preference.PreferenceFragment

inline fun <reified T : Preference> PreferenceFragment.find(key: CharSequence): T = findPreference(key) as T

inline fun <reified T : Preference> PreferenceFragment.findNullable(key: CharSequence): T? = findPreference(key) as? T