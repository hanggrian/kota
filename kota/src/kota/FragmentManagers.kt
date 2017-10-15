@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Fragment
import android.app.FragmentManager
import android.support.annotation.IdRes
import android.support.annotation.RequiresApi

inline fun FragmentManager.replace(@IdRes containerViewId: Int, fragment: Fragment, transit: FragmentTransit) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment)
        .commit()

inline fun FragmentManager.replace(@IdRes containerViewId: Int, fragment: Fragment, tag: String, transit: FragmentTransit) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment, tag)
        .commit()

@RequiresApi(24)
inline fun FragmentManager.replaceNow(@IdRes containerViewId: Int, fragment: Fragment, transit: FragmentTransit) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment)
        .commitNow()

@RequiresApi(24)
inline fun FragmentManager.replaceNow(@IdRes containerViewId: Int, fragment: Fragment, tag: String, transit: FragmentTransit) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment, tag)
        .commitNow()