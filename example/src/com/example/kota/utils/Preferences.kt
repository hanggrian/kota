@file:JvmName("PreferencesKt")
@file:Suppress("NOTHING_TO_INLINE")

package com.example.kota.utils

import android.support.v7.preference.PreferenceFragmentCompat

inline fun PreferenceFragmentCompat.findAndSetOnClickListener(key: CharSequence, noinline onClick: () -> Unit) = findPreference(key).setOnPreferenceClickListener {
    onClick()
    false
}