package kota

import android.support.v4.app.FragmentTransaction

@PublishedApi
@Suppress("NOTHING_TO_INLINE")
internal inline fun FragmentTransaction.setTransit(transit: FragmentTransit): FragmentTransaction = transit.let { (type, value) ->
    return when (type) {
        0 -> {
            if (value.size == 2) setCustomAnimations(value[0], value[1])
            else setCustomAnimations(value[0], value[1], value[2], value[3])
        }
        1 -> setTransition(value[0])
        else -> setTransitionStyle(value[0])
    }
}