package com.hendraanggrian.kota.test;

import android.annotation.SuppressLint;
import android.support.test.runner.AndroidJUnit4;

import com.hendraanggrian.kota.content.ResourcesKt;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
@SuppressLint("PrivateResource")
public class ResourcesTestJ {

    @Test
    public void getText() throws Exception {
        assertEquals(
                getTargetContext().getResources().getText(android.R.string.ok, ""),
                ResourcesKt.getText(getTargetContext(), android.R.string.ok, ""));
    }

    @Test
    public void getQuantityText() throws Exception {
        assertEquals(
                getTargetContext().getResources().getQuantityText(R.plurals.test_plural, 2),
                ResourcesKt.getQuantityText(getTargetContext(), R.plurals.test_plural, 2));
    }

    @Test
    public void getTextArray() throws Exception {
        assertArrayEquals(
                getTargetContext().getResources().getTextArray(android.R.array.emailAddressTypes),
                ResourcesKt.getTextArray(getTargetContext(), android.R.array.emailAddressTypes));
    }

    @Test
    public void getQuantityString() throws Exception {
        assertEquals(
                getTargetContext().getResources().getQuantityString(R.plurals.test_plural2, 1, 2),
                ResourcesKt.getQuantityString(getTargetContext(), R.plurals.test_plural2, 1, 2));
    }

    @Test
    public void getStringArray() throws Exception {
        assertArrayEquals(
                getTargetContext().getResources().getStringArray(android.R.array.emailAddressTypes),
                ResourcesKt.getStringArray(getTargetContext(), android.R.array.emailAddressTypes));
    }

    @Test
    public void getInteger() throws Exception {
        assertEquals(
                getTargetContext().getResources().getInteger(android.R.integer.config_longAnimTime),
                ResourcesKt.getInteger(getTargetContext(), android.R.integer.config_longAnimTime));
    }

    @Test
    public void getIntArray() throws Exception {
        assertArrayEquals(
                getTargetContext().getResources().getIntArray(R.array.test_integer_array),
                ResourcesKt.getIntArray(getTargetContext(), R.array.test_integer_array));
    }

    @Test
    public void getDimension() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDimension(android.R.dimen.app_icon_size),
                ResourcesKt.getDimension(getTargetContext(), android.R.dimen.app_icon_size));
    }

    @Test
    public void getDimensionPixelOffset() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDimensionPixelOffset(android.R.dimen.app_icon_size),
                ResourcesKt.getDimensionPixelOffset(getTargetContext(), android.R.dimen.app_icon_size));
    }

    @Test
    public void getDimensionPixelSize() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDimensionPixelSize(android.R.dimen.app_icon_size),
                ResourcesKt.getDimensionPixelSize(getTargetContext(), android.R.dimen.app_icon_size));
    }

    @Test
    public void getDrawable() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDrawable(android.R.drawable.alert_dark_frame),
                ResourcesKt.getDrawable2(getTargetContext(), android.R.drawable.alert_dark_frame));
    }

    @Test
    public void getColor() throws Exception {
        assertEquals(
                getTargetContext().getResources().getColor(android.R.color.background_dark),
                ResourcesKt.getColor2(getTargetContext(), android.R.color.background_dark));
    }

    @Test
    public void getColorStateList() throws Exception {
        assertEquals(
                getTargetContext().getResources().getColorStateList(android.R.color.background_dark),
                ResourcesKt.getColorStateList2(getTargetContext(), android.R.color.background_dark));
    }

    @Test
    public void getBoolean() throws Exception {
        assertEquals(
                getTargetContext().getResources().getBoolean(R.bool.abc_action_bar_embed_tabs),
                ResourcesKt.getBoolean(getTargetContext(), R.bool.abc_action_bar_embed_tabs));
    }

    @Test
    public void getLayout() throws Exception {
        assertEquals(
                getTargetContext().getResources().getLayout(R.layout.activity_viewgroups),
                ResourcesKt.getLayout(getTargetContext(), R.layout.activity_viewgroups));
    }

    @Test
    public void getAnimation() throws Exception {
        assertEquals(
                getTargetContext().getResources().getAnimation(android.R.anim.accelerate_decelerate_interpolator),
                ResourcesKt.getAnimation(getTargetContext(), android.R.anim.accelerate_decelerate_interpolator));
    }

    @Test
    public void getXml() throws Exception {
        assertEquals(
                getTargetContext().getResources().getXml(R.xml.test_xml),
                ResourcesKt.getXml(getTargetContext(), R.xml.test_xml));
    }
}