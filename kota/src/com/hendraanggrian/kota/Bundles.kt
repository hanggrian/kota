@file:JvmName("BundlesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

inline fun bundleOf(key: String, value: Boolean): Bundle {
    val bundle = Bundle()
    bundle.putBoolean(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Byte): Bundle {
    val bundle = Bundle()
    bundle.putByte(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Char): Bundle {
    val bundle = Bundle()
    bundle.putChar(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Short): Bundle {
    val bundle = Bundle()
    bundle.putShort(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Int): Bundle {
    val bundle = Bundle()
    bundle.putInt(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Long): Bundle {
    val bundle = Bundle()
    bundle.putLong(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Float): Bundle {
    val bundle = Bundle()
    bundle.putFloat(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Double): Bundle {
    val bundle = Bundle()
    bundle.putDouble(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: String): Bundle {
    val bundle = Bundle()
    bundle.putString(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: CharSequence): Bundle {
    val bundle = Bundle()
    bundle.putCharSequence(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Parcelable): Bundle {
    val bundle = Bundle()
    bundle.putParcelable(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Serializable): Bundle {
    val bundle = Bundle()
    bundle.putSerializable(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: BooleanArray): Bundle {
    val bundle = Bundle()
    bundle.putBooleanArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: ByteArray): Bundle {
    val bundle = Bundle()
    bundle.putByteArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: CharArray): Bundle {
    val bundle = Bundle()
    bundle.putCharArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: DoubleArray): Bundle {
    val bundle = Bundle()
    bundle.putDoubleArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: FloatArray): Bundle {
    val bundle = Bundle()
    bundle.putFloatArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: IntArray): Bundle {
    val bundle = Bundle()
    bundle.putIntArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: LongArray): Bundle {
    val bundle = Bundle()
    bundle.putLongArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: ShortArray): Bundle {
    val bundle = Bundle()
    bundle.putShortArray(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Bundle): Bundle {
    val bundle = Bundle()
    bundle.putBundle(key, value)
    return bundle
}

inline fun bundleOf(key: String, value: Array<*>): Bundle {
    val bundle = Bundle()
    @Suppress("UNCHECKED_CAST") when {
        value.isArrayOf<Parcelable>() -> bundle.putParcelableArray(key, value as Array<out Parcelable>)
        value.isArrayOf<CharSequence>() -> bundle.putCharSequenceArray(key, value as Array<out CharSequence>)
        value.isArrayOf<String>() -> bundle.putStringArray(key, value as Array<out String>)
        else -> throw IllegalStateException("Unsupported bundle component (${value.javaClass})")
    }
    return bundle
}

inline fun bundleOf(vararg pairs: Pair<String, Any?>): Bundle = when {
    pairs.isEmpty() -> Bundle.EMPTY
    else -> {
        val bundle = Bundle()
        pairs.forEach { (key, value) ->
            when (value) {
                null -> bundle.putSerializable(key, null)
                is Boolean -> bundle.putBoolean(key, value)
                is Byte -> bundle.putByte(key, value)
                is Char -> bundle.putChar(key, value)
                is Short -> bundle.putShort(key, value)
                is Int -> bundle.putInt(key, value)
                is Long -> bundle.putLong(key, value)
                is Float -> bundle.putFloat(key, value)
                is Double -> bundle.putDouble(key, value)
                is String -> bundle.putString(key, value)
                is CharSequence -> bundle.putCharSequence(key, value)
                is Parcelable -> bundle.putParcelable(key, value)
                is Serializable -> bundle.putSerializable(key, value)
                is BooleanArray -> bundle.putBooleanArray(key, value)
                is ByteArray -> bundle.putByteArray(key, value)
                is CharArray -> bundle.putCharArray(key, value)
                is DoubleArray -> bundle.putDoubleArray(key, value)
                is FloatArray -> bundle.putFloatArray(key, value)
                is IntArray -> bundle.putIntArray(key, value)
                is LongArray -> bundle.putLongArray(key, value)
                is Array<*> -> @Suppress("UNCHECKED_CAST") when {
                    value.isArrayOf<Parcelable>() -> bundle.putParcelableArray(key, value as Array<out Parcelable>)
                    value.isArrayOf<CharSequence>() -> bundle.putCharSequenceArray(key, value as Array<out CharSequence>)
                    value.isArrayOf<String>() -> bundle.putStringArray(key, value as Array<out String>)
                    else -> throw IllegalStateException("Unsupported bundle component (${value.javaClass})")
                }
                is ShortArray -> bundle.putShortArray(key, value)
                is Bundle -> bundle.putBundle(key, value)
                else -> throw IllegalStateException("Unsupported bundle component (${value.javaClass})")
            }
        }
        bundle
    }
}