@file:JvmName("DatesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.format.DateUtils
import java.util.*

inline val Long.isToday: Boolean get() = DateUtils.isToday(this)

inline val Date.isToday: Boolean get() = time.isToday

inline val Calendar.isToday: Boolean get() = timeInMillis.isToday