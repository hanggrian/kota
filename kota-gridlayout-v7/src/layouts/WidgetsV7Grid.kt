@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayout

inline fun Context.supportGridLayout(init: (@KotaDsl _GridLayoutV7).() -> Unit): GridLayout = _GridLayoutV7(this).apply(init)
inline fun android.app.Fragment.supportGridLayout(init: (@KotaDsl _GridLayoutV7).() -> Unit): GridLayout = _GridLayoutV7(activity).apply(init)
inline fun Fragment.supportGridLayout(init: (@KotaDsl _GridLayoutV7).() -> Unit): GridLayout = _GridLayoutV7(context!!).apply(init)
inline fun Dialog.supportGridLayout(init: (@KotaDsl _GridLayoutV7).() -> Unit): GridLayout = _GridLayoutV7(context).apply(init)
inline fun ViewRoot.supportGridLayout(init: (@KotaDsl _GridLayoutV7).() -> Unit): GridLayout = _GridLayoutV7(getContext()).apply(init).add()