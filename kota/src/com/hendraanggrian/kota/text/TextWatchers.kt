@file:JvmName("TextWatchersKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.text

import android.text.Editable
import android.text.TextWatcher

/** Returns a text change listener from supplied  */
@JvmOverloads
inline fun textWatcherOf(
        noinline beforeTextChanged: ((CharSequence, Int, Int, Int) -> Unit)? = null,
        noinline onTextChanged: ((CharSequence, Int, Int, Int) -> Unit)? = null,
        noinline afterTextChanged: ((Editable) -> Unit)? = null
): TextWatcher = object : TextWatcher {
    override fun beforeTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int) {
        beforeTextChanged?.invoke(p0, p1, p2, p3)
    }

    override fun onTextChanged(p0: CharSequence, p1: Int, p2: Int, p3: Int) {
        onTextChanged?.invoke(p0, p1, p2, p3)
    }

    override fun afterTextChanged(p0: Editable) {
        afterTextChanged?.invoke(p0)
    }
}