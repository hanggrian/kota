@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.views

import android.view.View
import android.view.ViewGroup

inline val ViewGroup.childs: List<View> get() = (0 until childCount).map { getChildAt(it) }

inline val ViewGroup.first: View get() = getChildAt(0)
inline val ViewGroup.firstOrNull: View? get() = if (isEmpty) null else first

inline val ViewGroup.last: View get() = getChildAt(lastIndex)
inline val ViewGroup.lastOrNull: View? get() = if (isEmpty) null else last

inline val ViewGroup.isEmpty: Boolean get() = childCount == 0
inline val ViewGroup.lastIndex: Int get() = childCount - 1

inline fun ViewGroup.forEach(action: (View) -> Unit) {
    for (child in childs) action(child)
}

inline fun ViewGroup.forEachIndexed(action: (Int, View) -> Unit) {
    var i = 0
    for (child in childs) action(i++, child)
}