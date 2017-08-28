@file:JvmName("Bundles")
@file:Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST", "UNUSED")

package com.hendraanggrian.kota

import android.app.Fragment
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

inline fun bundleOf(key: String, value: Boolean): Bundle = Bundle().apply { putBoolean(key, value) }
inline fun bundleOf(key: String, value: Byte): Bundle = Bundle().apply { putByte(key, value) }
inline fun bundleOf(key: String, value: Char): Bundle = Bundle().apply { putChar(key, value) }
inline fun bundleOf(key: String, value: Short): Bundle = Bundle().apply { putShort(key, value) }
inline fun bundleOf(key: String, value: Int): Bundle = Bundle().apply { putInt(key, value) }
inline fun bundleOf(key: String, value: Long): Bundle = Bundle().apply { putLong(key, value) }
inline fun bundleOf(key: String, value: Float): Bundle = Bundle().apply { putFloat(key, value) }
inline fun bundleOf(key: String, value: Double): Bundle = Bundle().apply { putDouble(key, value) }
inline fun bundleOf(key: String, value: String): Bundle = Bundle().apply { putString(key, value) }
inline fun bundleOf(key: String, value: CharSequence): Bundle = Bundle().apply { putCharSequence(key, value) }
inline fun bundleOf(key: String, value: Parcelable): Bundle = Bundle().apply { putParcelable(key, value) }
inline fun bundleOf(key: String, value: Serializable): Bundle = Bundle().apply { putSerializable(key, value) }
inline fun bundleOf(key: String, value: BooleanArray): Bundle = Bundle().apply { putBooleanArray(key, value) }
inline fun bundleOf(key: String, value: ByteArray): Bundle = Bundle().apply { putByteArray(key, value) }
inline fun bundleOf(key: String, value: CharArray): Bundle = Bundle().apply { putCharArray(key, value) }
inline fun bundleOf(key: String, value: DoubleArray): Bundle = Bundle().apply { putDoubleArray(key, value) }
inline fun bundleOf(key: String, value: FloatArray): Bundle = Bundle().apply { putFloatArray(key, value) }
inline fun bundleOf(key: String, value: IntArray): Bundle = Bundle().apply { putIntArray(key, value) }
inline fun bundleOf(key: String, value: LongArray): Bundle = Bundle().apply { putLongArray(key, value) }
inline fun bundleOf(key: String, value: ShortArray): Bundle = Bundle().apply { putShortArray(key, value) }
inline fun bundleOf(key: String, value: Bundle): Bundle = Bundle().apply { putBundle(key, value) }
inline fun bundleOf(key: String, value: Array<*>): Bundle = Bundle().apply {
    when {
        value.isArrayOf<Parcelable>() -> putParcelableArray(key, value as Array<out Parcelable>)
        value.isArrayOf<CharSequence>() -> putCharSequenceArray(key, value as Array<out CharSequence>)
        value.isArrayOf<String>() -> putStringArray(key, value as Array<out String>)
        else -> throw IllegalStateException("Unsupported bundle component (${value.javaClass})")
    }
}

inline fun bundleOf(vararg pairs: Pair<String, Any?>): Bundle = Bundle().apply {
    pairs.forEach { (key, value) ->
        when (value) {
            null -> putSerializable(key, null)
            is Boolean -> putBoolean(key, value)
            is Byte -> putByte(key, value)
            is Char -> putChar(key, value)
            is Short -> putShort(key, value)
            is Int -> putInt(key, value)
            is Long -> putLong(key, value)
            is Float -> putFloat(key, value)
            is Double -> putDouble(key, value)
            is String -> putString(key, value)
            is CharSequence -> putCharSequence(key, value)
            is Parcelable -> putParcelable(key, value)
            is Serializable -> putSerializable(key, value)
            is BooleanArray -> putBooleanArray(key, value)
            is ByteArray -> putByteArray(key, value)
            is CharArray -> putCharArray(key, value)
            is DoubleArray -> putDoubleArray(key, value)
            is FloatArray -> putFloatArray(key, value)
            is IntArray -> putIntArray(key, value)
            is LongArray -> putLongArray(key, value)
            is Array<*> -> when {
                value.isArrayOf<Parcelable>() -> putParcelableArray(key, value as Array<out Parcelable>)
                value.isArrayOf<CharSequence>() -> putCharSequenceArray(key, value as Array<out CharSequence>)
                value.isArrayOf<String>() -> putStringArray(key, value as Array<out String>)
                else -> throw IllegalStateException("Unsupported bundle component (${value.javaClass})")
            }
            is ShortArray -> putShortArray(key, value)
            is Bundle -> putBundle(key, value)
            else -> throw IllegalStateException("Unsupported bundle component (${value.javaClass})")
        }
    }
}

inline fun Fragment.setExtras(extras: Bundle): Fragment = apply { arguments = extras }