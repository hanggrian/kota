package kota

import android.app.FragmentTransaction.*
import android.support.annotation.AnimatorRes
import android.support.annotation.StyleRes
import kota.BuildConfig.*

open class CustomTransit : FragmentTransit {
    constructor(
            @AnimatorRes enter: Int,
            @AnimatorRes exit: Int
    ) : super(TRANSIT_TYPE_CUSTOM, enter, exit)

    constructor(
            @AnimatorRes enter: Int,
            @AnimatorRes exit: Int,
            @AnimatorRes popEnter: Int,
            @AnimatorRes popExit: Int
    ) : super(TRANSIT_TYPE_CUSTOM, enter, exit, popEnter, popExit)
}

object NoTransit : FragmentTransit(TRANSIT_TYPE_CONSTANT, TRANSIT_NONE)
object OpenTransit : FragmentTransit(TRANSIT_TYPE_CONSTANT, TRANSIT_FRAGMENT_OPEN)
object CloseTransit : FragmentTransit(TRANSIT_TYPE_CONSTANT, TRANSIT_FRAGMENT_CLOSE)

open class FadeTransit : FragmentTransit(TRANSIT_TYPE_CONSTANT, TRANSIT_FRAGMENT_FADE) {
    companion object : FadeTransit()
}

open class StyleTransit(@StyleRes styleRes: Int) : FragmentTransit(TRANSIT_TYPE_STYLE, styleRes)