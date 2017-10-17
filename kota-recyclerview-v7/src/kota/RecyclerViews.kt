@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.v7.widget.*
import android.widget.LinearLayout

inline fun RecyclerView.fixedSize() = setHasFixedSize(true)

@JvmOverloads
inline fun RecyclerView.setLinearLayoutManager(
        orientation: Int = LinearLayout.VERTICAL,
        reverseLayout: Boolean = false
) {
    layoutManager = LinearLayoutManager(context, orientation, reverseLayout)
}

@JvmOverloads
inline fun RecyclerView.setGridLayoutManager(
        spanCount: Int,
        orientation: Int = LinearLayout.VERTICAL,
        reverseLayout: Boolean = false
) {
    layoutManager = GridLayoutManager(context, spanCount, orientation, reverseLayout)
}

@JvmOverloads
inline fun RecyclerView.setStaggeredLayoutManager(
        spanCount: Int,
        orientation: Int = LinearLayout.VERTICAL
) {
    layoutManager = StaggeredGridLayoutManager(spanCount, orientation)
}

@JvmOverloads
inline fun RecyclerView.addDividerItemDecoration(
        orientation: Int = LinearLayout.VERTICAL,
        index: Int = -1
) = addItemDecoration(DividerItemDecoration(context, orientation), index)