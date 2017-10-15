@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

inline fun FragmentManager.replace(@IdRes containerViewId: Int, fragment: Fragment, transit: FragmentTransit) = beginTransaction()
        .replace(containerViewId, fragment)
        .setTransit(transit)
        .commit()

inline fun FragmentManager.replace(@IdRes containerViewId: Int, fragment: Fragment, tag: String, transit: FragmentTransit) = beginTransaction()
        .replace(containerViewId, fragment, tag)
        .setTransit(transit)
        .commit()

inline fun FragmentManager.replaceNow(@IdRes containerViewId: Int, fragment: Fragment, transit: FragmentTransit) = beginTransaction()
        .replace(containerViewId, fragment)
        .setTransit(transit)
        .commitNow()

inline fun FragmentManager.replaceNow(@IdRes containerViewId: Int, fragment: Fragment, tag: String, transit: FragmentTransit) = beginTransaction()
        .replace(containerViewId, fragment, tag)
        .setTransit(transit)
        .commitNow()