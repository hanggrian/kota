package kota

import android.support.v4.app.FragmentTransaction

@PublishedApi
@Suppress("NOTHING_TO_INLINE")
internal inline fun FragmentTransaction.setTransit(transit: FragmentTransit): FragmentTransaction = when (transit.type) {
    TYPE_CUSTOM -> {
        transit as CustomTransit
        if (transit.value.size == 2) setCustomAnimations(transit.value[0], transit.value[1])
        else setCustomAnimations(transit.value[0], transit.value[1], transit.value[2], transit.value[3])
    }
    TYPE_CONSTANT -> setTransition(transit.value[0])
    else -> setTransitionStyle(transit.value[0])
}