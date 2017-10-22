@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Activity
import android.app.Dialog
import android.app.Fragment
import android.util.Log
import java.util.*

@PublishedApi
internal fun Any.toString2(): String = when (this) {
    is String -> this
    is Array<*> -> Arrays.toString(this)
    is Collection<*> -> Arrays.toString(this.toTypedArray())
    else -> toString()
}

@JvmOverloads inline fun verbose(tag: String, msg: Any, tr: Throwable? = null): Int =
        if (tr != null) Log.v(tag, msg.toString2(), tr)
        else Log.v(tag, msg.toString2())

@JvmOverloads inline fun Activity.verbose(msg: Any, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.verbose(msg: Any, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.verbose(msg: Any, tr: Throwable? = null): Int = verbose(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun debug(tag: String, msg: Any, tr: Throwable? = null): Int =
        if (tr != null) Log.d(tag, msg.toString2(), tr)
        else Log.d(tag, msg.toString2())

@JvmOverloads inline fun Activity.debug(msg: Any, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.debug(msg: Any, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.debug(msg: Any, tr: Throwable? = null): Int = debug(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun info(tag: String, msg: Any, tr: Throwable? = null): Int =
        if (tr != null) Log.i(tag, msg.toString2(), tr)
        else Log.i(tag, msg.toString2())

@JvmOverloads inline fun Activity.info(msg: Any, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.info(msg: Any, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.info(msg: Any, tr: Throwable? = null): Int = info(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun warn(tag: String, msg: Any, tr: Throwable? = null): Int =
        if (tr != null) Log.w(tag, msg.toString2(), tr)
        else Log.w(tag, msg.toString2())

@JvmOverloads inline fun Activity.warn(msg: Any, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.warn(msg: Any, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.warn(msg: Any, tr: Throwable? = null): Int = warn(javaClass.simpleName, msg, tr)

inline fun warn(tag: Any, tr: Throwable): Int = Log.w(tag.toString2(), tr)

inline fun Activity.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)
inline fun Fragment.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)
inline fun Dialog.warn(tr: Throwable): Int = warn(javaClass.simpleName, tr)

@JvmOverloads inline fun error(tag: String, msg: Any, tr: Throwable? = null): Int =
        if (tr != null) Log.e(tag, msg.toString2(), tr)
        else Log.e(tag, msg.toString2())

@JvmOverloads inline fun Activity.error(msg: Any, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.error(msg: Any, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.error(msg: Any, tr: Throwable? = null): Int = error(javaClass.simpleName, msg, tr)

@JvmOverloads inline fun wtf(tag: String, msg: Any, tr: Throwable? = null): Int =
        if (tr != null) Log.wtf(tag, msg.toString2(), tr)
        else Log.wtf(tag, msg.toString2())

@JvmOverloads inline fun Activity.wtf(msg: Any, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Fragment.wtf(msg: Any, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)
@JvmOverloads inline fun Dialog.wtf(msg: Any, tr: Throwable? = null): Int = wtf(javaClass.simpleName, msg, tr)

inline fun wtf(tag: String, tr: Throwable): Int = Log.wtf(tag, tr)

inline fun Activity.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)
inline fun Fragment.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)
inline fun Dialog.wtf(tr: Throwable): Int = wtf(javaClass.simpleName, tr)