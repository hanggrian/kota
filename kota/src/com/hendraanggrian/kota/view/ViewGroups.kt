@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.app.Activity
import android.view.View
import android.view.ViewGroup

inline val Activity.contentView: View? get() = findViewById<ViewGroup>(android.R.id.content)?.getChildAt(0)

inline val ViewGroup.childs: List<View> get() = (0 until childCount).map { getChildAt(it) }

inline fun ViewGroup.forEach(action: (View) -> Unit) {
    for (child in childs) action(child)
}

inline fun ViewGroup.forEachIndexed(action: (Int, View) -> Unit) {
    var i = 0
    for (child in childs) action(i++, child)
}