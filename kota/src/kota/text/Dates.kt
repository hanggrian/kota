@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.format.DateUtils

inline val Long.isToday: Boolean get() = DateUtils.isToday(this)