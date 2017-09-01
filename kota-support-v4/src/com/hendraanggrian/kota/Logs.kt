@file:JvmName("SupportLogs")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.support.v4.app.Fragment

@JvmOverloads
inline fun Fragment.verbose(msg: String, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun Fragment.debug(msg: String, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun Fragment.info(msg: String, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun Fragment.warn(msg: String, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)

inline fun Fragment.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)

@JvmOverloads
inline fun Fragment.error(msg: String, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun Fragment.wtf(msg: String, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)

inline fun Fragment.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)