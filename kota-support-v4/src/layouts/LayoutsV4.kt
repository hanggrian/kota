@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.Context
import android.support.v4.app.FragmentTabHost
import android.support.v4.widget.DrawerLayout
import android.widget.FrameLayout

class _DrawerLayout(context: Context) : DrawerLayout(context), MarginLayoutParameterizable<DrawerLayout.LayoutParams>

class _FragmentTabHost(context: Context) : FragmentTabHost(context), FrameLayoutParameterizable<FrameLayout.LayoutParams>