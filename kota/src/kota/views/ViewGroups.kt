@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.views

import android.view.View
import android.view.ViewGroup

inline val ViewGroup.childs: List<View> get() = (0 until childCount).map { getChildAt(it) }

inline val ViewGroup.firstChild: View get() = getChildAt(0)
inline val ViewGroup.firstChildOrNull: View? get() = if (isEmpty) null else firstChild

inline val ViewGroup.lastChild: View get() = getChildAt(lastIndex)
inline val ViewGroup.lastChildOrNull: View? get() = if (isEmpty) null else lastChild

inline val ViewGroup.isEmpty: Boolean get() = childCount == 0
inline val ViewGroup.lastIndex: Int get() = childCount - 1

inline fun ViewGroup.forEachChild(action: (View) -> Unit) {
    for (child in childs) action(child)
}

inline fun ViewGroup.forEachChildIndexed(action: (Int, View) -> Unit) {
    var i = 0
    for (child in childs) action(i++, child)
}