@file:JvmName("LayoutInflaters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota.view

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.xmlpull.v1.XmlPullParser

@JvmOverloads inline fun Context.inflateLayout(
        @LayoutRes resource: Int,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = LayoutInflater.from(this).inflate(resource, root, attachToRoot)

@JvmOverloads inline fun Context.inflateLayout(
        parser: XmlPullParser,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = LayoutInflater.from(this).inflate(parser, root, attachToRoot)