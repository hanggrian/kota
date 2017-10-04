@file:JvmName("BundlesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

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