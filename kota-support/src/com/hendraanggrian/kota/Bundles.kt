@file:JvmName("SupportBundles")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

import android.os.Bundle
import android.support.v4.app.Fragment

inline fun Fragment.setExtras(extras: Bundle): Fragment = apply { arguments = extras }