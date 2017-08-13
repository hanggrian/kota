@file:JvmName("DateUtils2")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.text

import android.content.Context
import android.text.format.DateUtils
import android.text.format.DateUtils.*
import java.util.*

@JvmOverloads inline fun Long.toRelativeTimeSpanString(
        now: Long = System.currentTimeMillis(),
        minResolution: Long = MINUTE_IN_MILLIS,
        flags: Int = FORMAT_SHOW_DATE or FORMAT_SHOW_YEAR or FORMAT_ABBREV_MONTH
): CharSequence = DateUtils.getRelativeTimeSpanString(this, now, minResolution, flags)

@JvmOverloads inline fun Date.toRelativeTimeSpanString(
        now: Date = Date(System.currentTimeMillis()),
        minResolution: Long = MINUTE_IN_MILLIS,
        flags: Int = FORMAT_SHOW_DATE or FORMAT_SHOW_YEAR or FORMAT_ABBREV_MONTH
): CharSequence = time.toRelativeTimeSpanString(now.time, minResolution, flags)

@JvmOverloads inline fun Calendar.toRelativeTimeSpanString(
        now: Calendar = Calendar.getInstance().apply { timeInMillis = System.currentTimeMillis() },
        minResolution: Long = MINUTE_IN_MILLIS,
        flags: Int = FORMAT_SHOW_DATE or FORMAT_SHOW_YEAR or FORMAT_ABBREV_MONTH
): CharSequence = timeInMillis.toRelativeTimeSpanString(now.timeInMillis, minResolution, flags)

@JvmOverloads inline fun Long.formatElapsedTime(recycle: StringBuilder? = null): String = DateUtils.formatElapsedTime(recycle, this)
@JvmOverloads inline fun Date.formatElapsedTime(recycle: StringBuilder? = null): String = time.formatElapsedTime(recycle)
@JvmOverloads inline fun Calendar.formatElapsedTime(recycle: StringBuilder? = null): String = timeInMillis.formatElapsedTime(recycle)

inline fun Long.formatSameDayTime(now: Long, dateStyle: Int, timeStyle: Int): CharSequence = DateUtils.formatSameDayTime(this, now, dateStyle, timeStyle)
inline fun Date.formatSameDayTime(now: Date, dateStyle: Int, timeStyle: Int): CharSequence = time.formatSameDayTime(now.time, dateStyle, timeStyle)
inline fun Calendar.formatSameDayTime(now: Calendar, dateStyle: Int, timeStyle: Int): CharSequence = timeInMillis.formatSameDayTime(now.timeInMillis, dateStyle, timeStyle)

inline fun Long.isToday(): Boolean = DateUtils.isToday(this)
inline fun Date.isToday(): Boolean = time.isToday()
inline fun Calendar.isToday(): Boolean = timeInMillis.isToday()

@JvmOverloads inline fun Long.formatDateRange(
        context: Context,
        formatter: Formatter = Formatter(StringBuilder(50), Locale.getDefault()),
        endMillis: Long,
        flags: Int
): Formatter = DateUtils.formatDateRange(context, formatter, this, endMillis, flags)

@JvmOverloads inline fun Date.formatDateRange(
        context: Context,
        formatter: Formatter = Formatter(StringBuilder(50), Locale.getDefault()),
        endMillis: Date,
        flags: Int
): Formatter = time.formatDateRange(context, formatter, endMillis.time, flags)

@JvmOverloads inline fun Calendar.formatDateRange(
        context: Context,
        formatter: Formatter = Formatter(StringBuilder(50), Locale.getDefault()),
        endMillis: Calendar,
        flags: Int
): Formatter = timeInMillis.formatDateRange(context, formatter, endMillis.timeInMillis, flags)

inline fun Long.formatDateTime(context: Context, flags: Int): String = DateUtils.formatDateTime(context, this, flags)
inline fun Date.formatDateTime(context: Context, flags: Int): String = time.formatDateTime(context, flags)
inline fun Calendar.formatDateTime(context: Context, flags: Int): String = timeInMillis.formatDateTime(context, flags)

@JvmOverloads inline fun Long.toRelativeTimeSpanString(
        context: Context,
        withPreposition: Boolean = false
): CharSequence = DateUtils.getRelativeTimeSpanString(context, this, withPreposition)

@JvmOverloads inline fun Date.toRelativeTimeSpanString(
        context: Context,
        withPreposition: Boolean = false
): CharSequence = time.toRelativeTimeSpanString(context, withPreposition)

@JvmOverloads inline fun Calendar.toRelativeTimeSpanString(
        context: Context,
        withPreposition: Boolean = false
): CharSequence = timeInMillis.toRelativeTimeSpanString(context, withPreposition)