@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.views

import android.view.Menu
import android.view.MenuItem

inline val Menu.items: List<MenuItem> get() = (0 until size()).map { getItem(it) }

inline val Menu.firstItem: MenuItem get() = getItem(0)
inline val Menu.firstItemOrNull: MenuItem? get() = if (isEmpty) null else firstItem

inline val Menu.lastItem: MenuItem get() = getItem(lastIndex)
inline val Menu.lastItemOrNull: MenuItem? get() = if (isEmpty) null else lastItem

inline val Menu.isEmpty: Boolean get() = size() == 0
inline val Menu.lastIndex: Int get() = size() - 1

inline fun Menu.getItemOrNull(index: Int): MenuItem? = if (index in 0..lastIndex) getItem(index) else null

inline fun Menu.forEachItem(action: (MenuItem) -> Unit) {
    for (item in items) action(item)
}

inline fun Menu.forEachItemIndexed(action: (Int, MenuItem) -> Unit) {
    var i = 0
    for (item in items) action(i++, item)
}