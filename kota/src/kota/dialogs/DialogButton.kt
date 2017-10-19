package kota.dialogs

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.DialogInterface.*
import android.support.annotation.StringRes

open class DialogButton @PublishedApi internal constructor(
        @PublishedApi internal val type: Int,
        @PublishedApi internal val text: Any,
        @PublishedApi internal val action: ((DialogInterface) -> Unit)?
) {
    operator fun component1(): Int = type
    operator fun component2(): Any = text
    operator fun component3(): ((DialogInterface) -> Unit)? = action
}

open class PositiveButton : DialogButton {
    @JvmOverloads constructor(text: CharSequence, action: ((DialogInterface) -> Unit)? = null) : super(BUTTON_POSITIVE, text, action)
    @JvmOverloads constructor(@StringRes text: Int, action: ((DialogInterface) -> Unit)? = null) : super(BUTTON_POSITIVE, text, action)
}

open class NegativeButton : DialogButton {
    @JvmOverloads constructor(text: CharSequence, action: ((DialogInterface) -> Unit)? = null) : super(BUTTON_NEGATIVE, text, action)
    @JvmOverloads constructor(@StringRes text: Int, action: ((DialogInterface) -> Unit)? = null) : super(BUTTON_NEGATIVE, text, action)
}

open class NeutralButton : DialogButton {
    @JvmOverloads constructor(text: CharSequence, action: ((DialogInterface) -> Unit)? = null) : super(BUTTON_NEUTRAL, text, action)
    @JvmOverloads constructor(@StringRes text: Int, action: ((DialogInterface) -> Unit)? = null) : super(BUTTON_NEUTRAL, text, action)
}

open class OkButton(action: ((DialogInterface) -> Unit)?) : PositiveButton(android.R.string.ok, action) {
    companion object : OkButton(null)
}

open class CancelButton(action: ((DialogInterface) -> Unit)?) : NegativeButton(android.R.string.cancel, action) {
    companion object : CancelButton(null)
}

open class YesButton(action: ((DialogInterface) -> Unit)?) : PositiveButton(android.R.string.yes, action) {
    companion object : YesButton(null)
}

open class NoButton(action: ((DialogInterface) -> Unit)?) : NegativeButton(android.R.string.no, action) {
    companion object : NoButton(null)
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