@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.text

import android.text.Editable
import android.text.SpanWatcher
import android.text.Spannable
import android.text.TextWatcher

@JvmOverloads
inline fun spanWatcherOf(
        noinline onSpanChanged: ((text: Spannable, what: Any, ostart: Int, oend: Int, nstart: Int, nend: Int) -> Unit)? = null,
        noinline onSpanRemoved: ((text: Spannable, what: Any, start: Int, end: Int) -> Unit)? = null,
        noinline onSpanAdded: ((text: Spannable, what: Any, start: Int, end: Int) -> Unit)? = null
): SpanWatcher = object : SpanWatcher {
    override fun onSpanChanged(text: Spannable, what: Any, ostart: Int, oend: Int, nstart: Int, nend: Int) {
        onSpanChanged?.invoke(text, what, ostart, oend, nstart, nend)
    }

    override fun onSpanRemoved(text: Spannable, what: Any, start: Int, end: Int) {
        onSpanRemoved?.invoke(text, what, start, end)
    }

    override fun onSpanAdded(text: Spannable, what: Any, start: Int, end: Int) {
        onSpanAdded?.invoke(text, what, start, end)
    }
}

@JvmOverloads
inline fun textWatcherOf(
        noinline beforeTextChanged: ((s: CharSequence, start: Int, count: Int, after: Int) -> Unit)? = null,
        noinline afterTextChanged: ((s: Editable) -> Unit)? = null,
        noinline onTextChanged: ((s: CharSequence, start: Int, before: Int, count: Int) -> Unit)? = null
): TextWatcher = object : TextWatcher {
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        beforeTextChanged?.invoke(s, start, count, after)
    }

    override fun afterTextChanged(s: Editable) {
        afterTextChanged?.invoke(s)
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        onTextChanged?.invoke(s, start, before, count)
    }
}