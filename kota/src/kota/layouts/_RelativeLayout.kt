package kota.layouts

import android.content.Context
import android.support.annotation.RequiresApi
import android.view.View
import android.widget.RelativeLayout

class _RelativeLayout(context: Context) : RelativeLayout(context), MarginLayoutParamsable<RelativeLayout.LayoutParams> {
    infix fun <V : View> V.alignWithParent(align: Boolean): V = apply { lparams.alignWithParent = align }
    infix fun <V : View> V.addRule(verb: Int): V = apply { lparams.addRule(verb) }
    fun <V : View> V.addRule(verb: Int, subject: Int): V = apply { lparams.addRule(verb, subject) }
    @RequiresApi(17) infix fun <V : View> V.removeRule(verb: Int): V = apply { lparams.removeRule(verb) }

    val View.alignWithParent: Boolean get() = lparams.alignWithParent
    val View.rules: IntArray get() = lparams.rules

    @RequiresApi(17) override fun <V : View> V.resolveDirection(direction: Int): V = apply { lparams.resolveLayoutDirection(direction) }
}