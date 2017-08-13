@file:JvmName("LayoutInflaters")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.common.view

import android.app.Fragment
import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.xmlpull.v1.XmlPullParser

inline fun Context.getLayoutInflater(): LayoutInflater = LayoutInflater.from(this)

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

@JvmOverloads inline fun Fragment.inflateLayout(
        @LayoutRes resource: Int,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = layoutInflater.inflate(resource, root, attachToRoot)

@JvmOverloads inline fun Fragment.inflateLayout(
        parser: XmlPullParser,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = layoutInflater.inflate(parser, root, attachToRoot)

@JvmOverloads inline fun android.support.v4.app.Fragment.inflateLayout(
        @LayoutRes resource: Int,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = layoutInflater.inflate(resource, root, attachToRoot)

@JvmOverloads inline fun android.support.v4.app.Fragment.inflateLayout(
        parser: XmlPullParser,
        root: ViewGroup?,
        attachToRoot: Boolean = root != null
): View = layoutInflater.inflate(parser, root, attachToRoot)