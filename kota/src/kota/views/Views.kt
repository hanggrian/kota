@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.views

import android.app.Activity
import android.app.Dialog
import android.app.Fragment
import android.support.annotation.IdRes
import android.view.View
import android.view.ViewGroup

inline val Activity.contentView: View? get() = findViewById<ViewGroup>(android.R.id.content)?.getChildAt(0)

inline fun <reified T : View> View.find(@IdRes id: Int): T = findViewById(id)!!
inline fun <reified T : View> Activity.find(@IdRes id: Int): T = findViewById(id)!!
inline fun <reified T : View> Fragment.find(@IdRes id: Int): T = view?.findViewById(id)!!
inline fun <reified T : View> Dialog.find(@IdRes id: Int): T = findViewById(id)!!

inline fun <reified T : View> View.findNullable(@IdRes id: Int): T? = findViewById(id)
inline fun <reified T : View> Activity.findNullable(@IdRes id: Int): T? = findViewById(id)
inline fun <reified T : View> Fragment.findNullable(@IdRes id: Int): T? = view?.findViewById(id)
inline fun <reified T : View> Dialog.findNullable(@IdRes id: Int): T? = findViewById(id)

inline fun <V : View> V.setVisibilityThen(
        visibility: Int,
        block: V.() -> Unit,
        fallback: V.() -> Unit
) {
    this.visibility = visibility
    if (visibility == View.VISIBLE) block(this)
    else fallback(this)
}

inline fun <V : View> V.setVisibilityThen(
        visibility: Int,
        block: V.() -> Unit
) {
    this.visibility = visibility
    if (visibility == View.VISIBLE) block(this)
}

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        block: V.() -> Unit,
        fallback: V.() -> Unit
) = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block, fallback)

inline fun <V : View> V.setVisibleThen(
        visible: Boolean,
        block: V.() -> Unit
) = setVisibilityThen(if (visible) View.VISIBLE else View.GONE, block)