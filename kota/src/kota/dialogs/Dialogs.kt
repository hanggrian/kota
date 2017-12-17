@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota.dialogs

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.drawable.Drawable
import android.support.annotation.AttrRes
import android.support.annotation.DrawableRes
import android.support.annotation.RequiresApi
import android.support.annotation.StringRes
import android.view.KeyEvent
import android.view.View

interface DialogBuilder<out D : AlertDialog> {
    val context: Context

    fun title(@StringRes titleId: Int)
    fun title(title: CharSequence)
    fun title(customTitleView: View)

    fun message(@StringRes messageId: Int)
    fun message(message: CharSequence)

    fun icon(@DrawableRes iconId: Int)
    fun icon(icon: Drawable)
    fun iconAttr(@AttrRes attrId: Int)

    fun positiveButton(@StringRes textId: Int, action: ((dialog: DialogInterface) -> Unit)?)
    fun positiveButton(text: CharSequence, action: ((dialog: DialogInterface) -> Unit)?)

    fun negativeButton(@StringRes textId: Int, action: ((dialog: DialogInterface) -> Unit)?)
    fun negativeButton(text: CharSequence, action: ((dialog: DialogInterface) -> Unit)?)

    fun neutralButton(@StringRes textId: Int, action: ((dialog: DialogInterface) -> Unit)?)
    fun neutralButton(text: CharSequence, action: ((dialog: DialogInterface) -> Unit)?)

    fun cancelable(cancelable: Boolean)

    fun onCancel(action: (dialog: DialogInterface) -> Unit)
    fun onDismiss(action: (dialog: DialogInterface) -> Unit)
    fun onKey(action: (dialog: DialogInterface, keyCode: Int, e: KeyEvent) -> Boolean)

    fun build(): D
    fun show(): D
}

internal class AlertBuilder(override val context: Context) : DialogBuilder<AlertDialog> {
    private val builder = AlertDialog.Builder(context)

    override fun title(@StringRes titleId: Int) {
        builder.setTitle(titleId)
    }

    override fun title(title: CharSequence) {
        builder.setTitle(title)
    }

    override fun title(customTitleView: View) {
        builder.setCustomTitle(customTitleView)
    }

    override fun message(@StringRes messageId: Int) {
        builder.setMessage(messageId)
    }

    override fun message(message: CharSequence) {
        builder.setMessage(message)
    }

    override fun icon(@DrawableRes iconId: Int) {
        builder.setIcon(iconId)
    }

    override fun icon(icon: Drawable) {
        builder.setIcon(icon)
    }

    override fun iconAttr(@AttrRes attrId: Int) {
        builder.setIconAttribute(attrId)
    }

    override fun positiveButton(@StringRes textId: Int, action: ((dialog: DialogInterface) -> Unit)?) {
        builder.setPositiveButton(textId) { dialog, _ -> action?.invoke(dialog) }
    }

    override fun positiveButton(text: CharSequence, action: ((dialog: DialogInterface) -> Unit)?) {
        builder.setPositiveButton(text) { dialog, _ -> action?.invoke(dialog) }
    }

    override fun negativeButton(@StringRes textId: Int, action: ((dialog: DialogInterface) -> Unit)?) {
        builder.setNegativeButton(textId) { dialog, _ -> action?.invoke(dialog) }
    }

    override fun negativeButton(text: CharSequence, action: ((dialog: DialogInterface) -> Unit)?) {
        builder.setNegativeButton(text) { dialog, _ -> action?.invoke(dialog) }
    }

    override fun neutralButton(@StringRes textId: Int, action: ((dialog: DialogInterface) -> Unit)?) {
        builder.setNeutralButton(textId) { dialog, _ -> action?.invoke(dialog) }
    }

    override fun neutralButton(text: CharSequence, action: ((dialog: DialogInterface) -> Unit)?) {
        builder.setNeutralButton(text) { dialog, _ -> action?.invoke(dialog) }
    }

    override fun cancelable(cancelable: Boolean) {
        builder.setCancelable(cancelable)
    }

    override fun onCancel(action: (dialog: DialogInterface) -> Unit) {
        builder.setOnCancelListener(action)
    }

    @RequiresApi(17)
    override fun onDismiss(action: (dialog: DialogInterface) -> Unit) {
        builder.setOnDismissListener(action)
    }

    override fun onKey(action: (dialog: DialogInterface, keyCode: Int, e: KeyEvent) -> Boolean) {
        builder.setOnKeyListener(action)
    }

    override fun build(): AlertDialog = builder.create()

    override fun show(): AlertDialog = builder.show()
}