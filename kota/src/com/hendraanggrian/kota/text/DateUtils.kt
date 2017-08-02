package com.hendraanggrian.kota.text

import android.content.Context
import android.text.format.DateUtils
import android.text.format.DateUtils.*
import java.util.*

@JvmOverloads
fun Long.toRelativeTimeSpanString(
        now: Long = System.currentTimeMillis(),
        minResolution: Long = MINUTE_IN_MILLIS,
        flags: Int = FORMAT_SHOW_DATE or FORMAT_SHOW_YEAR or FORMAT_ABBREV_MONTH): CharSequence =
        DateUtils.getRelativeTimeSpanString(this, now, minResolution, flags)

@JvmOverloads
fun Date.toRelativeTimeSpanString(
        now: Date = Date(System.currentTimeMillis()),
        minResolution: Long = MINUTE_IN_MILLIS,
        flags: Int = FORMAT_SHOW_DATE or FORMAT_SHOW_YEAR or FORMAT_ABBREV_MONTH): CharSequence =
        time.toRelativeTimeSpanString(now.time, minResolution, flags)

@JvmOverloads
fun Calendar.toRelativeTimeSpanString(
        now: Calendar = Calendar.getInstance().apply { timeInMillis = System.currentTimeMillis() },
        minResolution: Long = MINUTE_IN_MILLIS,
        flags: Int = FORMAT_SHOW_DATE or FORMAT_SHOW_YEAR or FORMAT_ABBREV_MONTH): CharSequence =
        timeInMillis.toRelativeTimeSpanString(now.timeInMillis, minResolution, flags)

@JvmOverloads
fun Long.formatElapsedTime(recycle: StringBuilder? = null): String = DateUtils.formatElapsedTime(recycle, this)

@JvmOverloads
fun Date.formatElapsedTime(recycle: StringBuilder? = null): String = time.formatElapsedTime(recycle)

@JvmOverloads
fun Calendar.formatElapsedTime(recycle: StringBuilder? = null): String = timeInMillis.formatElapsedTime(recycle)

fun Long.formatSameDayTime(now: Long, dateStyle: Int, timeStyle: Int): CharSequence = DateUtils.formatSameDayTime(this, now, dateStyle, timeStyle)
fun Date.formatSameDayTime(now: Date, dateStyle: Int, timeStyle: Int): CharSequence = DateUtils.formatSameDayTime(time, now.time, dateStyle, timeStyle)
fun Calendar.formatSameDayTime(now: Calendar, dateStyle: Int, timeStyle: Int): CharSequence = DateUtils.formatSameDayTime(timeInMillis, now.timeInMillis, dateStyle, timeStyle)

fun Long.isToday(): Boolean = DateUtils.isToday(this)
fun Date.isToday(): Boolean = time.isToday()
fun Calendar.isToday(): Boolean = timeInMillis.isToday()

@JvmOverloads
fun Long.formatDateRange(
        context: Context,
        formatter: Formatter = Formatter(StringBuilder(50), Locale.getDefault()),
        endMillis: Long,
        flags: Int): Formatter =
        DateUtils.formatDateRange(context, formatter, this, endMillis, flags)

@JvmOverloads
fun Date.formatDateRange(
        context: Context,
        formatter: Formatter = Formatter(StringBuilder(50), Locale.getDefault()),
        endMillis: Date,
        flags: Int): Formatter =
        time.formatDateRange(context, formatter, endMillis.time, flags)

@JvmOverloads
fun Calendar.formatDateRange(
        context: Context,
        formatter: Formatter = Formatter(StringBuilder(50), Locale.getDefault()),
        endMillis: Calendar,
        flags: Int): Formatter =
        timeInMillis.formatDateRange(context, formatter, endMillis.timeInMillis, flags)

fun Long.formatDateTime(context: Context, flags: Int) = DateUtils.formatDateTime(context, this, flags)
fun Date.formatDateTime(context: Context, flags: Int) = time.formatDateTime(context, flags)
fun Calendar.formatDateTime(context: Context, flags: Int) = timeInMillis.formatDateTime(context, flags)

@JvmOverloads
fun Long.toRelativeTimeSpanString(
        context: Context,
        withPreposition: Boolean = false): CharSequence =
        DateUtils.getRelativeTimeSpanString(context, this, withPreposition)

@JvmOverloads
fun Date.toRelativeTimeSpanString(
        context: Context,
        withPreposition: Boolean = false): CharSequence =
        time.toRelativeTimeSpanString(context, withPreposition)

@JvmOverloads
fun Calendar.toRelativeTimeSpanString(
        context: Context,
        withPreposition: Boolean = false): CharSequence =
        timeInMillis.toRelativeTimeSpanString(context, withPreposition)