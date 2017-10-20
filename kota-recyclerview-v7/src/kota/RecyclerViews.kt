@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.res.Configuration.*
import android.support.v7.widget.*
import android.widget.LinearLayout
import kota.resources.screenSize

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
inline fun RecyclerView.setAutoStaggeredLayoutManager(
        smallSpanCount: Int,
        normalSpanCount: Int,
        largeSpanCount: Int,
        xlargeSpanCount: Int,
        orientation: Int = LinearLayout.VERTICAL
) {
    layoutManager = StaggeredGridLayoutManager(when (context.screenSize) {
        SCREENLAYOUT_SIZE_SMALL -> smallSpanCount
        SCREENLAYOUT_SIZE_NORMAL -> normalSpanCount
        SCREENLAYOUT_SIZE_LARGE -> largeSpanCount
        SCREENLAYOUT_SIZE_XLARGE -> xlargeSpanCount
        else -> normalSpanCount
    }, orientation)
}

@JvmOverloads
inline fun RecyclerView.setAutoStaggeredLayoutManager(
        spanCount: Int,
        orientation: Int = LinearLayout.VERTICAL
) {
    check(spanCount > 1, { "Requires min span count of 2." })
    setAutoStaggeredLayoutManager(spanCount - 1, spanCount, spanCount + 1, spanCount + 2, orientation)
}

@JvmOverloads
inline fun RecyclerView.addDividerItemDecoration(
        orientation: Int = LinearLayout.VERTICAL,
        index: Int = -1
) = addItemDecoration(DividerItemDecoration(context, orientation), index)