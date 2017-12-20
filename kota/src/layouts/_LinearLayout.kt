package kota

import android.annotation.SuppressLint
import android.content.Context
import android.widget.LinearLayout

@SuppressLint("ViewConstructor")
class _LinearLayout(context: Context, orientation: Int) : LinearLayout(context), LinearLayoutParameterizable<LinearLayout.LayoutParams> {
    init {
        setOrientation(orientation)
    }
}