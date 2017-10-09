package kota.dialogs

import android.content.DialogInterface
import android.content.DialogInterface.*
import android.support.annotation.StringRes

open class DialogButton @PublishedApi internal constructor(
        val type: Int,
        val text: Any,
        val action: ((DialogInterface) -> Unit)?
) {
    init {
        check(type == BUTTON_POSITIVE || type == BUTTON_NEGATIVE || type == BUTTON_NEUTRAL)
        check(text is CharSequence || text is Int)
    }
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

open class OkButton @JvmOverloads constructor(action: ((DialogInterface) -> Unit)? = null) : PositiveButton(android.R.string.ok, action) {
    companion object : OkButton()
}

open class CancelButton @JvmOverloads constructor(action: ((DialogInterface) -> Unit)? = null) : NegativeButton(android.R.string.cancel, action) {
    companion object : CancelButton()
}

open class YesButton @JvmOverloads constructor(action: ((DialogInterface) -> Unit)? = null) : PositiveButton(android.R.string.yes, action) {
    companion object : YesButton()
}

open class NoButton @JvmOverloads constructor(action: ((DialogInterface) -> Unit)? = null) : NegativeButton(android.R.string.no, action) {
    companion object : NoButton()
}