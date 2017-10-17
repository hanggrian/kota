@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Activity
import android.app.Dialog
import android.app.Fragment
import android.util.Log

@JvmOverloads inline fun verbose(tag: String, msg: String, tr: Throwable? = null): Int =
        if (tr != null) Log.v(tag, msg, tr)
        else Log.v(tag, msg)

@JvmOverloads inline fun Activity.verbose(msg: String, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.verbose(msg: String, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.verbose(msg: String, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun debug(tag: String, msg: String, tr: Throwable? = null): Int =
        if (tr != null) Log.d(tag, msg, tr)
        else Log.d(tag, msg)

@JvmOverloads inline fun Activity.debug(msg: String, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.debug(msg: String, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.debug(msg: String, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun info(tag: String, msg: String, tr: Throwable? = null): Int =
        if (tr != null) Log.i(tag, msg, tr)
        else Log.i(tag, msg)

@JvmOverloads inline fun Activity.info(msg: String, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.info(msg: String, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.info(msg: String, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun warn(tag: String, msg: String, tr: Throwable? = null): Int =
        if (tr != null) Log.w(tag, msg, tr)
        else Log.w(tag, msg)

@JvmOverloads inline fun Activity.warn(msg: String, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.warn(msg: String, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.warn(msg: String, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)

inline fun warn(tag: String, tr: Throwable): Int = Log.w(tag, tr)

inline fun Activity.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)
inline fun Fragment.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)
inline fun Dialog.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)

@JvmOverloads inline fun error(tag: String, msg: String, tr: Throwable? = null): Int =
        if (tr != null) Log.e(tag, msg, tr)
        else Log.e(tag, msg)

@JvmOverloads inline fun Activity.error(msg: String, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.error(msg: String, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.error(msg: String, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun wtf(tag: String, msg: String, tr: Throwable? = null): Int =
        if (tr != null) Log.wtf(tag, msg, tr)
        else Log.wtf(tag, msg)

@JvmOverloads inline fun Activity.wtf(msg: String, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.wtf(msg: String, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.wtf(msg: String, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)

inline fun wtf(tag: String, tr: Throwable): Int = Log.wtf(tag, tr)

inline fun Activity.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)
inline fun Fragment.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)
inline fun Dialog.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)