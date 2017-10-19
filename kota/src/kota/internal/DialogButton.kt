package kota.internal

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.DialogInterface.*

open class DialogButton @PublishedApi internal constructor(
        @PublishedApi internal val type: Int,
        @PublishedApi internal val text: Any,
        @PublishedApi internal val action: ((DialogInterface) -> Unit)?
) {
    operator fun component1(): Int = type
    operator fun component2(): Any = text
    operator fun component3(): ((DialogInterface) -> Unit)? = action
}

@PublishedApi
@Suppress("NOTHING_TO_INLINE")
internal inline fun AlertDialog.Builder.setButtons(vararg buttons: DialogButton): AlertDialog.Builder = apply {
    buttons.forEach { (type, text, action) ->
        when (type) {
            BUTTON_POSITIVE ->
                if (text is Int) setPositiveButton(text, { dialog, _ -> action?.invoke(dialog) })
                else setPositiveButton(text as CharSequence, { dialog, _ -> action?.invoke(dialog) })
            BUTTON_NEGATIVE ->
                if (text is Int) setNegativeButton(text, { dialog, _ -> action?.invoke(dialog) })
                else setNegativeButton(text as CharSequence, { dialog, _ -> action?.invoke(dialog) })
            BUTTON_NEUTRAL ->
                if (text is Int) setNeutralButton(text, { dialog, _ -> action?.invoke(dialog) })
                else setNeutralButton(text as CharSequence, { dialog, _ -> action?.invoke(dialog) })
        }
    }
}