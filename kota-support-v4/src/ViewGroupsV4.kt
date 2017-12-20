@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.view.View

inline fun <reified T : View> Fragment.find(@IdRes id: Int): T = view?.findViewById(id) as T

inline fun <reified T : View> Fragment.findNullable(@IdRes id: Int): T? = view?.findViewById(id) as? T