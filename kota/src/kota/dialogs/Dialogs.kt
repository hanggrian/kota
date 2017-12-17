@file:JvmMultifileClass
@file:JvmName("AlertsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.annotation.StringRes

@JvmOverloads
inline fun AlertDialog.Builder.setPositiveButton(
        @StringRes textId: Int,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setPositiveButton(textId) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.Builder.setPositiveButton(
        text: CharSequence,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setPositiveButton(text) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.Builder.setNegativeButton(
        @StringRes textId: Int,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setNegativeButton(textId) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.Builder.setNegativeButton(
        text: CharSequence,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setNegativeButton(text) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.Builder.setNeutralButton(
        @StringRes textId: Int,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setNeutralButton(textId) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.Builder.setNeutralButton(
        text: CharSequence,
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setNeutralButton(text) { dialog, _ -> action?.invoke(dialog) }

@JvmOverloads
inline fun AlertDialog.Builder.setOKButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setPositiveButton(android.R.string.ok, action)

@JvmOverloads
inline fun AlertDialog.Builder.setCancelButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setNegativeButton(android.R.string.cancel, action)

@JvmOverloads
inline fun AlertDialog.Builder.setYesButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setPositiveButton(android.R.string.yes, action)

@JvmOverloads
inline fun AlertDialog.Builder.setNoButton(
        noinline action: ((dialog: DialogInterface) -> Unit)? = null
): AlertDialog.Builder = setNegativeButton(android.R.string.no, action)