@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.Intent
import android.support.v4.app.Fragment

/** Returns true if one or more activities can handle this intent. */
inline fun Intent.isResolvable(fragment: Fragment): Boolean = resolveActivity(fragment.context!!.packageManager) != null