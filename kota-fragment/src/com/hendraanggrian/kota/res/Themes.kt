@file:JvmName("ThemesFragment")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.res

import android.content.res.TypedArray
import android.support.v4.app.Fragment
import android.util.AttributeSet
import com.hendraanggrian.kota.res.openTypedArray

@JvmOverloads inline fun Fragment.openTypedArray(set: AttributeSet? = null, attrs: IntArray, defStyleAttr: Int = 0, defStyleRes: Int = 0, noinline getter: TypedArray.() -> Unit) = context.openTypedArray(set, attrs, defStyleAttr, defStyleRes, getter)