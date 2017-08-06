@file:JvmName("ViewGroups")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.view.View
import android.view.ViewGroup

@JvmOverloads fun ViewGroup.findAllViewsWithTag(tag: Any, recursive: Boolean = false): List<View> {
    val views = ArrayList<View>()
    (0..childCount - 1)
            .map { getChildAt(it) }
            .forEach {
                if (recursive && it is ViewGroup) {
                    views.addAll(findAllViewsWithTag(tag, true))
                } else {
                    val childTag = it.tag
                    if (childTag != null && childTag == tag) {
                        views.add(it)
                    }
                }
            }
    return views
}

inline fun ViewGroup.getAllChilds(): List<View> = (0..childCount - 1).map { getChildAt(it) }

inline fun ViewGroup.addAllViews(views: Collection<View>): Unit = views.forEach { addView(it) }
inline fun ViewGroup.addAllViews(vararg views: View): Unit = views.forEach { addView(it) }

inline fun ViewGroup.removeAllViews(views: Collection<View>): Unit = views.forEach { removeView(it) }
inline fun ViewGroup.removeAllViews(vararg views: View): Unit = views.forEach { removeView(it) }

@JvmOverloads fun ViewGroup.containsView(child: View, recursive: Boolean = false): Boolean {
    for (i in 0..childCount - 1) {
        val view = getChildAt(i)
        if (recursive && view is ViewGroup) {
            if (containsView(child, true)) {
                return true
            }
        } else if (getChildAt(i) === child) {
            return true
        }
    }
    return false
}