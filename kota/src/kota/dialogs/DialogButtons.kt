@file:JvmName("DialogButtonsKt")
@file:Suppress("NOTHING_TO_INLINE")

package kota.dialogs

import android.app.AlertDialog

@PublishedApi internal inline fun AlertDialog.Builder.setButtons(vararg buttons: DialogButton): AlertDialog.Builder = apply {
    buttons.forEach {
        when (it) {
            is PositiveButton -> if (it.text is Int) setPositiveButton(it.text, { dialog, _ -> it.action?.invoke(dialog) })
            else setPositiveButton(it.text as CharSequence, { dialog, _ -> it.action?.invoke(dialog) })
            is NegativeButton -> if (it.text is Int) setNegativeButton(it.text, { dialog, _ -> it.action?.invoke(dialog) })
            else setNegativeButton(it.text as CharSequence, { dialog, _ -> it.action?.invoke(dialog) })
            is NeutralButton -> if (it.text is Int) setNeutralButton(it.text, { dialog, _ -> it.action?.invoke(dialog) })
            else setNeutralButton(it.text as CharSequence, { dialog, _ -> it.action?.invoke(dialog) })
        }
    }
}