@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.contents

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.annotation.RequiresApi

/** Returns true if one or more activities can handle this intent. */
inline fun Intent.isResolvable(context: Context): Boolean = resolveActivity(context.packageManager) != null

/** Starts an activity that can handle this [intent], otherwise [fallback] will be executed. */
inline fun Context.startActivityResolved(intent: Intent, fallback: () -> Unit) =
        if (intent.isResolvable(this)) startActivity(intent)
        else fallback()

/** Starts an activity that can handle this [intent], otherwise [fallback] will be executed. */
inline fun Activity.startActivityResolved(intent: Intent, fallback: () -> Unit) =
        if (intent.isResolvable(this)) startActivity(intent)
        else fallback()

/** Starts an activity that can handle this [intent], otherwise [fallback] will be executed. */
inline fun Fragment.startActivityResolved(intent: Intent, fallback: () -> Unit) =
        if (intent.isResolvable(activity)) startActivity(intent)
        else fallback()

/** Starts an activity that can handle this [intent] with options, otherwise [fallback] will be executed. */
@RequiresApi(16)
inline fun Context.startActivityResolved(intent: Intent, options: Bundle, fallback: () -> Unit) =
        if (intent.isResolvable(this)) startActivity(intent, options)
        else fallback()

/** Starts an activity that can handle this [intent] with options, otherwise [fallback] will be executed. */
@RequiresApi(16)
inline fun Activity.startActivityResolved(intent: Intent, options: Bundle, fallback: () -> Unit) =
        if (intent.isResolvable(this)) startActivity(intent, options)
        else fallback()

/** Starts an activity that can handle this [intent] with options, otherwise [fallback] will be executed. */
@RequiresApi(16)
inline fun Fragment.startActivityResolved(intent: Intent, options: Bundle, fallback: () -> Unit) =
        if (intent.isResolvable(activity)) startActivity(intent, options)
        else fallback()

/** Starts activities that can handle each [intents], otherwise [fallback] will be executed. */
inline fun Context.startActivitiesResolved(intents: Array<Intent>, fallback: () -> Unit) =
        if (intents.all { it.isResolvable(this) }) startActivities(intents)
        else fallback()

/** Starts activities that can handle each [intents], otherwise [fallback] will be executed. */
inline fun Activity.startActivitiesResolved(intents: Array<Intent>, fallback: () -> Unit) =
        if (intents.all { it.isResolvable(this) }) startActivities(intents)
        else fallback()

/** Starts activities that can handle each [intents] with options, otherwise [fallback] will be executed. */
@RequiresApi(16)
inline fun Context.startActivitiesResolved(intents: Array<Intent>, options: Bundle, fallback: () -> Unit) =
        if (intents.all { it.isResolvable(this) }) startActivities(intents, options)
        else fallback()

/** Starts activities that can handle each [intents] with options, otherwise [fallback] will be executed. */
@RequiresApi(16)
inline fun Activity.startActivitiesResolved(intents: Array<Intent>, options: Bundle, fallback: () -> Unit) =
        if (intents.all { it.isResolvable(this) }) startActivities(intents, options)
        else fallback()

/** Starts an activity for result that can handle this [intent], otherwise [fallback] will be executed. */
inline fun Activity.startActivityForResultResolved(intent: Intent, requestCode: Int, fallback: () -> Unit) =
        if (intent.isResolvable(this)) startActivityForResult(intent, requestCode)
        else fallback()

/** Starts an activity for result that can handle this [intent], otherwise [fallback] will be executed. */
inline fun Fragment.startActivityForResultResolved(intent: Intent, requestCode: Int, fallback: () -> Unit) =
        if (intent.isResolvable(activity)) startActivityForResult(intent, requestCode)
        else fallback()

/** Starts an activity for result that can handle this [intent] with options, otherwise [fallback] will be executed. */
@RequiresApi(16)
inline fun Activity.startActivityForResultResolved(intent: Intent, requestCode: Int, options: Bundle, fallback: () -> Unit) =
        if (intent.isResolvable(this)) startActivityForResult(intent, requestCode, options)
        else fallback()

/** Starts an activity for result that can handle this [intent] with options, otherwise [fallback] will be executed. */
@RequiresApi(16)
inline fun Fragment.startActivityForResultResolved(intent: Intent, requestCode: Int, options: Bundle, fallback: () -> Unit) =
        if (intent.isResolvable(activity)) startActivityForResult(intent, requestCode, options)
        else fallback()

/** Brings back result of this activity to previous activity that started it. */
inline fun Activity.finishWithResult(resultCode: Int, data: Intent) {
    setResult(resultCode, data)
    finish()
}