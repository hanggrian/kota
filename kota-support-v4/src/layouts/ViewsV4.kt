@file:JvmMultifileClass
@file:JvmName("ViewsV4Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.support.v4.widget.DrawerLayout
import android.view.ViewGroup

//region Layout
inline fun Context.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(this).apply(init)
inline fun Fragment.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(activity).apply(init)
inline fun Dialog.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(context).apply(init)
inline fun ViewGroup.drawerLayout(init: (@KotaDsl _DrawerLayout).() -> Unit): DrawerLayout = _DrawerLayout(context).apply {
    init()
    addView(this)
}
//endregion