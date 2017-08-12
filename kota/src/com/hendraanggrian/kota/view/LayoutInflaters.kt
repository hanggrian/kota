@file:JvmName("LayoutInflaters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.app.Fragment
import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hendraanggrian.kota.app.getContext2
import org.xmlpull.v1.XmlPullParser

inline fun Context.getLayoutInflater(): LayoutInflater = LayoutInflater.from(this)
inline fun Fragment.getLayoutInflater(): LayoutInflater = LayoutInflater.from(getContext2())
inline fun android.support.v4.app.Fragment.getLayoutInflater(): LayoutInflater = LayoutInflater.from(context)

@JvmOverloads inline fun Context.inflateLayout(
        @LayoutRes resource: Int,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = getLayoutInflater().inflate(resource, root, attachToRoot)

@JvmOverloads inline fun Context.inflateLayout(
        parser: XmlPullParser,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = getLayoutInflater().inflate(parser, root, attachToRoot)