@file:JvmMultifileClass
@file:JvmName("ViewsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.app.Dialog
import android.app.Fragment
import android.app.MediaRouteButton
import android.content.Context
import android.gesture.GestureOverlayView
import android.inputmethodservice.ExtractEditText
import android.media.tv.TvView
import android.opengl.GLSurfaceView
import android.support.annotation.RequiresApi
import android.view.*
import android.webkit.WebView

@RequiresApi(16)
@JvmOverloads inline fun Context.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(this).apply { init?.invoke(this) }

@RequiresApi(16)
@JvmOverloads inline fun Fragment.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(activity).apply { init?.invoke(this) }

@RequiresApi(16)
@JvmOverloads inline fun Dialog.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(context).apply { init?.invoke(this) }

@RequiresApi(16)
@JvmOverloads inline fun ViewGroup.mediaRouteButton(noinline init: ((@KotaDsl MediaRouteButton).() -> Unit)? = null): MediaRouteButton = MediaRouteButton(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.gestureOverlayView(noinline init: ((@KotaDsl GestureOverlayView).() -> Unit)? = null): GestureOverlayView = GestureOverlayView(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.extractEditText(noinline init: ((@KotaDsl ExtractEditText).() -> Unit)? = null): ExtractEditText = ExtractEditText(context).apply {
    init?.invoke(this)
    addView(this)
}

@RequiresApi(21)
@JvmOverloads inline fun Context.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(this).apply { init?.invoke(this) }

@RequiresApi(21)
@JvmOverloads inline fun Fragment.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(activity).apply { init?.invoke(this) }

@RequiresApi(21)
@JvmOverloads inline fun Dialog.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(context).apply { init?.invoke(this) }

@RequiresApi(21)
@JvmOverloads inline fun ViewGroup.tvView(noinline init: ((@KotaDsl TvView).() -> Unit)? = null): TvView = TvView(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.glSurfaceView(noinline init: ((@KotaDsl GLSurfaceView).() -> Unit)? = null): GLSurfaceView = GLSurfaceView(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.surfaceView(noinline init: ((@KotaDsl SurfaceView).() -> Unit)? = null): SurfaceView = SurfaceView(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.textureView(noinline init: ((@KotaDsl TextureView).() -> Unit)? = null): TextureView = TextureView(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.view(noinline init: ((@KotaDsl View).() -> Unit)? = null): View = View(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.viewStub(noinline init: ((@KotaDsl ViewStub).() -> Unit)? = null): ViewStub = ViewStub(context).apply {
    init?.invoke(this)
    addView(this)
}

@JvmOverloads inline fun Context.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(this).apply { init?.invoke(this) }
@JvmOverloads inline fun Fragment.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(activity).apply { init?.invoke(this) }
@JvmOverloads inline fun Dialog.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(context).apply { init?.invoke(this) }
@JvmOverloads inline fun ViewGroup.webView(noinline init: ((@KotaDsl WebView).() -> Unit)? = null): WebView = WebView(context).apply {
    init?.invoke(this)
    addView(this)
}