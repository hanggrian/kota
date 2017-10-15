@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.views

import android.view.Menu
import android.view.MenuItem

inline val Menu.items: List<MenuItem> get() = (0 until size()).map { getItem(it) }

inline val Menu.first: MenuItem get() = getItem(0)
inline val Menu.firstOrNull: MenuItem? get() = if (isEmpty) null else first

inline val Menu.last: MenuItem get() = getItem(lastIndex)
inline val Menu.lastOrNull: MenuItem? get() = if (isEmpty) null else last

inline val Menu.isEmpty: Boolean get() = size() == 0
inline val Menu.lastIndex: Int get() = size() - 1

inline fun Menu.getItemOrNull(index: Int): MenuItem? = if (index in 0..lastIndex) getItem(index) else null

inline fun Menu.forEach(action: (MenuItem) -> Unit) {
    for (item in items) action(item)
    listOf("").first()
}

inline fun Menu.forEachIndexed(action: (Int, MenuItem) -> Unit) {
    var i = 0
    for (item in items) action(i++, item)
}