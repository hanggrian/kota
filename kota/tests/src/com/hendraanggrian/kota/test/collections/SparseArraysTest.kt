package com.hendraanggrian.kota.test.collections

import android.support.test.runner.AndroidJUnit4
import junit.framework.Assert.assertEquals
import kota.collections.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class SparseArraysTest {

    private val longSparseArray = longSparseArrayOf(Pair(5L, "Hello world!"))
    private val sparseArray = sparseArrayOf(Pair(5, "Hello world!"))
    private val sparseBooleanArray = sparseBooleanArrayOf(Pair(5, true))
    private val sparseIntArray = sparseIntArrayOf(Pair(5, 5))
    private val sparseLongArray = sparseLongArrayOf(Pair(5, 5L))

    @Test
    @Throws(Exception::class)
    fun longSparseArray() {
        assertEquals(longSparseArray.containsKey(0L), false)
        assertEquals(longSparseArray.containsValue(""), false)

        assertEquals(longSparseArray.containsKey(5L), true)
        assertEquals(longSparseArray.containsValue("Hello world!"), true)

        var i = 0
        longSparseArray.forEach { i++ }
        assertEquals(i, 1)
    }

    @Test
    @Throws(Exception::class)
    fun sparseArray() {
        assertEquals(sparseArray.containsKey(0), false)
        assertEquals(sparseArray.containsValue(""), false)

        assertEquals(sparseArray.containsKey(5), true)
        assertEquals(sparseArray.containsValue("Hello world!"), true)

        var i = 0
        sparseArray.forEach { i++ }
        assertEquals(i, 1)
    }

    @Test
    @Throws(Exception::class)
    fun sparseBooleanArray() {
        assertEquals(sparseBooleanArray.containsKey(0), false)
        assertEquals(sparseBooleanArray.containsValue(false), false)

        assertEquals(sparseBooleanArray.containsKey(5), true)
        assertEquals(sparseBooleanArray.containsValue(true), true)

        var i = 0
        sparseBooleanArray.forEach { i++ }
        assertEquals(i, 1)
    }

    @Test
    @Throws(Exception::class)
    fun sparseIntArray() {
        assertEquals(sparseIntArray.containsKey(0), false)
        assertEquals(sparseIntArray.containsValue(0), false)

        assertEquals(sparseIntArray.containsKey(5), true)
        assertEquals(sparseIntArray.containsValue(5), true)

        var i = 0
        sparseIntArray.forEach { i++ }
        assertEquals(i, 1)
    }

    @Test
    @Throws(Exception::class)
    fun sparseLongArray() {
        assertEquals(sparseLongArray.containsKey(0), false)
        assertEquals(sparseLongArray.containsValue(0L), false)

        assertEquals(sparseLongArray.containsKey(5), true)
        assertEquals(sparseLongArray.containsValue(5L), true)

        var i = 0
        sparseLongArray.forEach { i++ }
        assertEquals(i, 1)
    }
}