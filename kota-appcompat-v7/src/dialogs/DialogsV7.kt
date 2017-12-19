@file:JvmMultifileClass
@file:JvmName("DialogsV7Kt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.content.DialogInterface
import android.content.DialogInterface.*
import android.support.annotation.StringRes
import android.support.v7.app.AlertDialog

@JvmOverloads
inline fun AlertDialog.setPositiveButton(
        text: CharSequence,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setButton(BUTTON_POSITIVE, text) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.setPositiveButton(
        @StringRes textId: Int,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setPositiveButton(getText(textId), action)

@JvmOverloads
inline fun AlertDialog.setNegativeButton(
        text: CharSequence,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setButton(BUTTON_NEGATIVE, text) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.setNegativeButton(
        @StringRes textId: Int,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setNegativeButton(getText(textId), action)

@JvmOverloads
inline fun AlertDialog.setNeutralButton(
        text: CharSequence,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setButton(BUTTON_NEUTRAL, text) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.setNeutralButton(
        @StringRes textId: Int,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setNeutralButton(getText(textId), action)

@JvmOverloads
inline fun AlertDialog.setOKButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setPositiveButton(android.R.string.ok, action)

@JvmOverloads
inline fun AlertDialog.setCancelButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setNegativeButton(android.R.string.cancel, action)

@JvmOverloads
inline fun AlertDialog.setYesButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setPositiveButton(android.R.string.yes, action)

@JvmOverloads
inline fun AlertDialog.setNoButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
) = setNegativeButton(android.R.string.no, action)