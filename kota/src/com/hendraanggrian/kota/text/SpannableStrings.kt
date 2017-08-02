package com.hendraanggrian.kota.text

import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned

fun CharSequence.toSpannableString(): SpannableString = SpannableString.valueOf(this)

fun String.formatSpannableString(vararg args: Pair<Any, Array<out Any>>): SpannableString {
    val list = listOccurrences("%")
    for (start in listOccurrences("%%")) {
        list.remove(Integer.valueOf(start))
        list.remove(Integer.valueOf(start + 1))
    }
    if (list.size != args.size) {
        throw IllegalArgumentException("Expected argument " + list.size + ", was " + args.size)
    }
    val builder = SpannableStringBuilder()
    var remaining = this
    var lastIndex = 0
    for (i in args.indices) {
        val subformat = substring(lastIndex, list[i] + 2)
        lastIndex = list[i] + 2
        remaining = remaining.substring(subformat.length)
        builder.append(subformat.substring(0, subformat.length - 2))
        val arg = args[i]
        if (arg.second.isNotEmpty()) {
            builder.append(String.format(subformat.substring(subformat.length - 2), arg.first), spans = *arg.second, flags = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        } else {
            builder.append(String.format(subformat.substring(subformat.length - 2), arg.first))
        }
    }
    builder.append(remaining)
    return builder.toSpannableString()
}