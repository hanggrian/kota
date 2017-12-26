package kota

import android.app.FragmentTransaction
import android.app.FragmentTransaction.*
import android.support.annotation.AnimatorRes
import android.support.annotation.StyleRes
import kota.FragmentTransit.Companion.TRANSIT_TYPE_CONSTANT
import kota.FragmentTransit.Companion.TRANSIT_TYPE_CUSTOM

open class FragmentTransit @PublishedApi internal constructor(
        private val type: Int,
        private vararg val value: Int
) {
    operator fun component1(): Int = type
    operator fun component2(): IntArray = value

    companion object {
        const val TRANSIT_TYPE_CUSTOM: Int = 0
        const val TRANSIT_TYPE_CONSTANT: Int = 1
        const val TRANSIT_TYPE_STYLE: Int = 2
    }
}

@PublishedApi
@Suppress("NOTHING_TO_INLINE")
internal inline fun FragmentTransaction.setTransit(transit: FragmentTransit): FragmentTransaction = transit.let { (type, value) ->
    return when (type) {
        TRANSIT_TYPE_CUSTOM -> if (value.size == 2) setCustomAnimations(value[0], value[1]) else setCustomAnimations(value[0], value[1], value[2], value[3])
        TRANSIT_TYPE_CONSTANT -> setTransition(value[0])
        else -> setTransitionStyle(value[0])
    }
}

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