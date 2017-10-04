@file:JvmName("MenusKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.views

import android.view.Menu
import android.view.MenuItem

inline val Menu.items: List<MenuItem> get() = (0 until size()).map { getItem(it) }

inline fun Menu.forEach(action: (MenuItem) -> Unit) {
    for (item in items) action(item)
}

inline fun Menu.forEachIndexed(action: (Int, MenuItem) -> Unit) {
    var i = 0
    for (item in items) action(i++, item)
}