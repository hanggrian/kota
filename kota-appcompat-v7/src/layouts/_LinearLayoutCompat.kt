package kota

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.LinearLayoutCompat

@SuppressLint("ViewConstructor")
class _LinearLayoutCompat(context: Context, orientation: Int) : LinearLayoutCompat(context), LinearLayoutCompatParameterizable<LinearLayoutCompat.LayoutParams> {
    init {
        setOrientation(orientation)
    }
}