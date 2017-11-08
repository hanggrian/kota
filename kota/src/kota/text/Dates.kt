@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.format.DateUtils.isToday

inline val Long.isToday: Boolean get() = isToday(this)