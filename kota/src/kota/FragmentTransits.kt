package kota

import android.app.FragmentTransaction
import android.support.annotation.AnimatorRes
import android.support.annotation.StyleRes
import kota.internal.FragmentTransit
import kota.internal.TYPE_CONSTANT
import kota.internal.TYPE_CUSTOM
import kota.internal.TYPE_STYLE

open class CustomTransit : FragmentTransit {
    constructor(@AnimatorRes enter: Int, @AnimatorRes exit: Int) : super(TYPE_CUSTOM, enter, exit)
    constructor(@AnimatorRes enter: Int, @AnimatorRes exit: Int,
                @AnimatorRes popEnter: Int, @AnimatorRes popExit: Int) : super(TYPE_CUSTOM, enter, exit, popEnter, popExit)
}

object NoTransit : FragmentTransit(TYPE_CONSTANT, FragmentTransaction.TRANSIT_NONE)
object OpenTransit : FragmentTransit(TYPE_CONSTANT, FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
object CloseTransit : FragmentTransit(TYPE_CONSTANT, FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)

open class FadeTransit : FragmentTransit(TYPE_CONSTANT, FragmentTransaction.TRANSIT_FRAGMENT_FADE) {
    companion object : FadeTransit()
}

open class StyleTransit(@StyleRes styleRes: Int) : FragmentTransit(TYPE_STYLE, styleRes)