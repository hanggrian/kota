package com.hendraanggrian.kota.view

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup
import org.xmlpull.v1.XmlPullParser

@JvmOverloads
fun Context.inflateBy(@LayoutRes resource: Int, root: ViewGroup, attachToRoot: Boolean = false) = LayoutInflater.from(this).inflate(resource, root, attachToRoot)!!

@JvmOverloads
fun Context.inflateBy(parser: XmlPullParser, root: ViewGroup, attachToRoot: Boolean = false) = LayoutInflater.from(this).inflate(parser, root, attachToRoot)!!