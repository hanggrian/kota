@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.Editable
import android.text.TextWatcher

@JvmOverloads
inline fun textWatcherOf(
        noinline beforeTextChanged: ((s: CharSequence, start: Int, count: Int, after: Int) -> Unit)? = null,
        noinline afterTextChanged: ((s: Editable) -> Unit)? = null,
        noinline onTextChanged: ((s: CharSequence, start: Int, before: Int, count: Int) -> Unit)? = null
): TextWatcher = object : TextWatcher {
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) = beforeTextChanged?.invoke(s, start, count, after) ?: Unit
    override fun afterTextChanged(s: Editable) = afterTextChanged?.invoke(s) ?: Unit
    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) = onTextChanged?.invoke(s, start, before, count) ?: Unit
}