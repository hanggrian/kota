@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.v7.app.AppCompatDialog

@JvmOverloads
inline fun AppCompatDialog.verbose(msg: String, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun AppCompatDialog.debug(msg: String, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun AppCompatDialog.info(msg: String, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun AppCompatDialog.warn(msg: String, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)

inline fun AppCompatDialog.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)
@JvmOverloads
inline fun AppCompatDialog.error(msg: String, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)

@JvmOverloads
inline fun AppCompatDialog.wtf(msg: String, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)

inline fun AppCompatDialog.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)