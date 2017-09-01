@file:JvmName("SupportThemes")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.resources

import android.content.res.TypedArray
import android.support.v4.app.Fragment
import android.util.AttributeSet

@JvmOverloads
inline fun Fragment.openTypedArray(
        set: AttributeSet? = null,
        /*@StyleableRes*/ attrs: IntArray,
        /*@AttrRes*/ defStyleAttr: Int = 0,
        /*@StyleRes*/ defStyleRes: Int = 0,
        noinline getter: TypedArray.() -> Unit
) = context.openTypedArray(set, attrs, defStyleAttr, defStyleRes, getter)