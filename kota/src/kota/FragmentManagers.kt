@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Fragment
import android.app.FragmentManager
import android.support.annotation.IdRes
import android.support.annotation.RequiresApi
import kota.internal.FragmentTransit
import kota.internal.setTransit

@JvmOverloads
inline fun FragmentManager.add(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.add(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment, tag)
        .commit()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.addNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment)
        .commitNow()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.addNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .add(containerViewId, fragment, tag)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.replace(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment)
        .commit()

@JvmOverloads
inline fun FragmentManager.replace(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment, tag)
        .commit()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.replaceNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment)
        .commitNow()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.replaceNow(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        tag: String,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .replace(containerViewId, fragment, tag)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.remove(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .remove(fragment)
        .commit()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.removeNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .remove(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.hide(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .hide(fragment)
        .commit()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.hideNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .hide(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.show(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .show(fragment)
        .commit()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.showNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .show(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.detach(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .detach(fragment)
        .commit()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.detachNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .detach(fragment)
        .commitNow()

@JvmOverloads
inline fun FragmentManager.attach(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .attach(fragment)
        .commit()

@RequiresApi(24)
@JvmOverloads
inline fun FragmentManager.attachNow(
        fragment: Fragment,
        transit: FragmentTransit = NoTransit
) = beginTransaction()
        .setTransit(transit)
        .attach(fragment)
        .commitNow()