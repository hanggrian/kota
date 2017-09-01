package com.example.spannabletext

import android.content.res.AssetManager
import android.graphics.Paint
import android.graphics.Typeface
import android.net.Uri
import android.text.TextPaint
import android.text.style.TypefaceSpan
import java.io.File

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class FontSpan(family: String, private val typeface: Typeface) : TypefaceSpan(family) {

    constructor(uri: Uri) : this(File(uri.path))

    constructor(file: String) : this(Typeface.createFromFile(file))

    constructor(family: String, file: String) : this(family, Typeface.createFromFile(file))

    constructor(file: File) : this(Typeface.createFromFile(file))

    constructor(family: String, file: File) : this(family, Typeface.createFromFile(file))

    constructor(mgr: AssetManager, path: String) : this(Typeface.createFromAsset(mgr, path))

    constructor(family: String, mgr: AssetManager, path: String) : this(family, Typeface.createFromAsset(mgr, path))

    constructor(typeface: Typeface) : this("", typeface)

    override fun updateDrawState(textPaint: TextPaint) = applyCustomTypeface(textPaint)

    override fun updateMeasureState(paint: TextPaint) = applyCustomTypeface(paint)

    private fun applyCustomTypeface(paint: Paint) {
        val oldStyle: Int
        val old = paint.typeface
        oldStyle = old?.style ?: 0
        val fake = oldStyle and typeface.style.inv()
        if (fake and Typeface.BOLD != 0)
            paint.isFakeBoldText = true
        if (fake and Typeface.ITALIC != 0)
            paint.textSkewX = -0.25f
        paint.typeface = typeface
    }
}