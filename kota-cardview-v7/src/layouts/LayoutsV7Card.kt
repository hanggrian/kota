package kota

import android.content.Context
import android.support.v7.widget.CardView
import android.widget.FrameLayout

open class _CardView(context: Context) : CardView(context), ViewRoot, FrameLayoutParameterizable<FrameLayout.LayoutParams>