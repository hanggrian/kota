@file:JvmMultifileClass
@file:JvmName("DialogsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.AlertDialog
import android.app.Fragment
import android.content.Context
import android.content.DialogInterface
import android.support.annotation.ArrayRes
import android.support.annotation.StringRes

@JvmOverloads
inline fun Context.choiceAlert(
        items: Array<out CharSequence>,
        checked: Int,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
        .apply { title?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.choiceAlert(
        items: Array<out CharSequence>,
        checked: Int,
        title: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(items, checked, title, action, init)

@JvmOverloads
inline fun Context.choiceAlert(
        @ArrayRes items: Int,
        checked: Int,
        @StringRes titleId: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = AlertDialog.Builder(this)
        .setSingleChoiceItems(items, checked, DialogInterface.OnClickListener(action))
        .apply { titleId?.let { setTitle(it) } }
        .create()
        .apply { init?.invoke(this) }

@JvmOverloads
inline fun Fragment.choiceAlert(
        @ArrayRes items: Int,
        checked: Int,
        @StringRes titleId: CharSequence? = null,
        noinline action: (dialog: DialogInterface, Int) -> Unit,
        noinline init: (AlertDialog.() -> Unit)? = null
): AlertDialog = activity.choiceAlert(items, checked, titleId, action, init)