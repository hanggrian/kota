@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.Editable
import android.text.TextWatcher

/** Returns a text change listener from supplied  */
@JvmOverloads
inline fun textWatcherOf(
        noinline onTextChanged: ((CharSequence, Int, Int, Int) -> Unit)? = null,
        noinline beforeTextChanged: ((CharSequence, Int, Int, Int) -> Unit)? = null,
        noinline afterTextChanged: ((Editable) -> Unit)? = null
): TextWatcher = object : TextWatcher {
    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) = onTextChanged?.invoke(s, start, before, count) ?: Unit
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) = beforeTextChanged?.invoke(s, start, count, after) ?: Unit
    override fun afterTextChanged(s: Editable) = afterTextChanged?.invoke(s) ?: Unit
}