@file:JvmName("ActivitiesKt")
@file:Suppress("NOTHING_TO_INLINE")

package com.example.kota.utils

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

inline fun AppCompatActivity.replaceFragment(@IdRes id: Int, fragment: Fragment) = supportFragmentManager.beginTransaction().replace(id, fragment).commitNow()