package com.hendraanggrian.support.commonsutils.test

import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.runner.AndroidJUnit4
import com.hendraanggrian.support.commonsutils.content.*
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4::class)
class ResourcesTestK {

    @Test
    @Throws(Exception::class)
    fun getText() = assertEquals(
            getTargetContext().resources.getText(android.R.string.ok, ""),
            getTargetContext().getText(android.R.string.ok, ""))

    @Test
    @Throws(Exception::class)
    fun getQuantityText() = assertEquals(
            getTargetContext().resources.getQuantityText(R.plurals.test_plural, 2),
            getTargetContext().getQuantityText(R.plurals.test_plural, 2))

    @Test
    @Throws(Exception::class)
    fun getTextArray() = assertArrayEquals(
            getTargetContext().resources.getTextArray(android.R.array.emailAddressTypes),
            getTargetContext().getTextArray(android.R.array.emailAddressTypes))

    @Test
    @Throws(Exception::class)
    fun getQuantityString() = assertEquals(
            getTargetContext().resources.getQuantityString(R.plurals.test_plural2, 1, 2),
            getTargetContext().getQuantityString(R.plurals.test_plural2, 1, 2))

    @Test
    @Throws(Exception::class)
    fun getStringArray() = assertArrayEquals(
            getTargetContext().resources.getStringArray(android.R.array.emailAddressTypes),
            getTargetContext().getStringArray(android.R.array.emailAddressTypes))

    @Test
    @Throws(Exception::class)
    fun getInteger() = assertEquals(
            getTargetContext().resources.getInteger(android.R.integer.config_longAnimTime),
            getTargetContext().getInteger(android.R.integer.config_longAnimTime))

    @Test
    @Throws(Exception::class)
    fun getIntArray() = assertArrayEquals(
            getTargetContext().resources.getIntArray(R.array.test_integer_array),
            getTargetContext().getIntArray(R.array.test_integer_array))

    @Test
    @Throws(Exception::class)
    fun getDimension() = assertEquals(
            getTargetContext().resources.getDimension(android.R.dimen.app_icon_size),
            getTargetContext().getDimension(android.R.dimen.app_icon_size))

    @Test
    @Throws(Exception::class)
    fun getDimensionPixelOffset() = assertEquals(
            getTargetContext().resources.getDimensionPixelOffset(android.R.dimen.app_icon_size),
            getTargetContext().getDimensionPixelOffset(android.R.dimen.app_icon_size))

    @Test
    @Throws(Exception::class)
    fun getDimensionPixelSize() = assertEquals(
            getTargetContext().resources.getDimensionPixelSize(android.R.dimen.app_icon_size),
            getTargetContext().getDimensionPixelSize(android.R.dimen.app_icon_size))

    @Test
    @Throws(Exception::class)
    fun getDrawable() = assertEquals(
            getTargetContext().resources.getDrawable(android.R.drawable.alert_dark_frame),
            getTargetContext().getDrawable2(android.R.drawable.alert_dark_frame))

    @Test
    @Throws(Exception::class)
    fun getColor() = assertEquals(
            getTargetContext().resources.getColor(android.R.color.background_dark).toLong(),
            getTargetContext().getColor2(android.R.color.background_dark).toLong())

    @Test
    @Throws(Exception::class)
    fun getColorStateList() = assertEquals(
            getTargetContext().resources.getColorStateList(android.R.color.background_dark),
            getTargetContext().getColorStateList2(android.R.color.background_dark))

    @Test
    @Throws(Exception::class)
    fun getBoolean() = assertEquals(
            getTargetContext().resources.getBoolean(R.bool.abc_action_bar_embed_tabs),
            getTargetContext().getBoolean(R.bool.abc_action_bar_embed_tabs))

    @Test
    @Throws(Exception::class)
    fun getLayout() = assertEquals(
            getTargetContext().resources.getLayout(R.layout.activity_viewgroups),
            getTargetContext().getLayout(R.layout.activity_viewgroups))

    @Test
    @Throws(Exception::class)
    fun getAnimation() = assertEquals(
            getTargetContext().resources.getAnimation(android.R.anim.accelerate_decelerate_interpolator),
            getTargetContext().getAnimation(android.R.anim.accelerate_decelerate_interpolator))

    @Test
    @Throws(Exception::class)
    fun getXml() = assertEquals(
            getTargetContext().resources.getXml(R.xml.test_xml),
            getTargetContext().getXml(R.xml.test_xml))
}