@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.content.Context
import android.content.Intent

/** Returns true if one or more activities can handle this intent. */
inline fun Intent.isResolvable(context: Context): Boolean = resolveActivity(context.packageManager) != null

/** Returns true if one or more activities can handle this intent. */
inline fun Intent.isResolvable(fragment: Fragment): Boolean = resolveActivity(fragment.activity.packageManager) != null

/** Returns true if one or more activities can handle this intent. */
inline fun Intent.isResolvable(dialog: Dialog): Boolean = resolveActivity(dialog.context.packageManager) != null