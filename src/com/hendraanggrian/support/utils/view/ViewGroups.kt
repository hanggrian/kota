package com.hendraanggrian.support.utils.view

import android.view.View
import android.view.ViewGroup
import java.util.*

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */

fun ViewGroup.findViewsWithTag(tag: Any, recursive: Boolean = false): Collection<View> {
    val views = ArrayList<View>()
    (0..childCount - 1).map { getChildAt(it) }
            .forEach {
                if (recursive && it is ViewGroup) {
                    views.addAll(findViewsWithTag(tag, true))
                } else {
                    val childTag = it.tag
                    if (childTag != null && childTag == tag) {
                        views.add(it)
                    }
                }
            }
    return views
}

fun ViewGroup.getChilds(): Collection<View> = (0..childCount - 1).map { getChildAt(it) }

fun ViewGroup.containsView(child: View, recursive: Boolean = false): Boolean {
    checkNotNull(parent)
    checkNotNull(child)
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