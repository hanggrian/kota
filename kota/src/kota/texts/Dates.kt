@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.format.DateUtils

inline val Long.isToday: Boolean get() = DateUtils.isToday(this)