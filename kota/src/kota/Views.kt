@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Activity
import android.app.Dialog
import android.app.Fragment
import android.support.annotation.IdRes
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup

inline fun <reified T : View> View.find(@IdRes id: Int): T = findViewById<T>(id) as T
inline fun <reified T : View> Activity.find(@IdRes id: Int): T = findViewById<T>(id) as T
inline fun <reified T : View> Fragment.find(@IdRes id: Int): T = view?.findViewById<T>(id) as T
inline fun <reified T : View> Dialog.find(@IdRes id: Int): T = findViewById<T>(id) as T

inline fun <reified T : View> View.findNullable(@IdRes id: Int): T? = findViewById(id)
inline fun <reified T : View> Activity.findNullable(@IdRes id: Int): T? = findViewById(id)
inline fun <reified T : View> Fragment.findNullable(@IdRes id: Int): T? = view?.findViewById(id)
inline fun <reified T : View> Dialog.findNullable(@IdRes id: Int): T? = findViewById(id)

inline operator fun ViewGroup.get(index: Int): View = getChildAt(index)!!
inline fun ViewGroup.getOrNull(index: Int): View? = if (index in 0..lastIndex) getChildAt(index) else null

inline val ViewGroup.childs: List<View> get() = (0 until childCount).map { getChildAt(it) }
inline val ViewGroup.firstChild: View get() = this[0]
inline val ViewGroup.firstChildOrNull: View? get() = if (isEmpty) null else firstChild
inline val ViewGroup.lastChild: View get() = this[lastIndex]
inline val ViewGroup.lastChildOrNull: View? get() = if (isEmpty) null else lastChild

inline val ViewGroup.isEmpty: Boolean get() = childCount == 0
inline val ViewGroup.lastIndex: Int get() = childCount - 1

inline fun ViewGroup.forEachChild(action: (View) -> Unit) = childs.forEach(action)
inline fun ViewGroup.forEachChildIndexed(action: (Int, View) -> Unit) = childs.forEachIndexed(action)

inline val Activity.contentView: View? get() = findViewById<ViewGroup>(android.R.id.content)?.getChildAt(0)

inline var View.isVisible: Boolean
    get() = visibility == VISIBLE
    set(visible) {
        visibility = if (visible) VISIBLE else GONE
    }

inline fun <V : View> V.setVisibilityThen(
        visibility: Int,
        block: V.() -> Unit,
        fallback: V.() -> Unit
) {
    this.visibility = visibility
    if (visibility == VISIBLE) block(this)
    else fallback(this)
}

inline fun <V : View> V.setVisibilityThen(
        visibility: Int,
        block: V.() -> Unit
) {
    this.visibility = visibility
    if (visibility == VISIBLE) block(this)
}

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        block: V.() -> Unit,
        fallback: V.() -> Unit
) {
    this.isVisible = visible
    if (visibility == VISIBLE) block(this)
    else fallback(this)
}

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        block: V.() -> Unit
) {
    this.isVisible = visible
    if (visibility == VISIBLE) block(this)
}