package kota.internal

import android.app.FragmentTransaction
import kota.BuildConfig.TRANSIT_TYPE_CONSTANT
import kota.BuildConfig.TRANSIT_TYPE_CUSTOM

open class FragmentTransit @PublishedApi internal constructor(
        @PublishedApi internal val type: Int,
        @PublishedApi internal vararg val value: Int
) {
    operator fun component1(): Int = type
    operator fun component2(): IntArray = value
}

@PublishedApi
@Suppress("NOTHING_TO_INLINE")
internal inline fun FragmentTransaction.setTransit(transit: FragmentTransit): FragmentTransaction = transit.let { (type, value) ->
    return when (type) {
        TRANSIT_TYPE_CUSTOM ->
            if (value.size == 2) setCustomAnimations(value[0], value[1])
            else setCustomAnimations(value[0], value[1], value[2], value[3])
        TRANSIT_TYPE_CONSTANT -> setTransition(value[0])
        else -> setTransitionStyle(value[0])
    }
}