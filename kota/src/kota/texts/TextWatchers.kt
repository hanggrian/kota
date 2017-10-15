@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.texts

import android.text.Editable
import android.text.TextWatcher

/** Returns a text change listener from supplied  */
@JvmOverloads
inline fun textWatcherOf(
        noinline beforeTextChanged: ((CharSequence, Int, Int, Int) -> Unit)? = null,
        noinline onTextChanged: ((CharSequence, Int, Int, Int) -> Unit)? = null,
        noinline afterTextChanged: ((Editable) -> Unit)? = null
): TextWatcher = object : TextWatcher {
    override fun beforeTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int): Unit = beforeTextChanged?.invoke(p0, p1, p2, p3) ?: Unit
    override fun onTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int): Unit = onTextChanged?.invoke(p0, p1, p2, p3) ?: Unit
    override fun afterTextChanged(p0: Editable): Unit = afterTextChanged?.invoke(p0) ?: Unit
}