package com.hendraanggrian.kota.test.content;

import android.annotation.SuppressLint;
import android.support.test.runner.AndroidJUnit4;

import com.hendraanggrian.kota.content.Resources2;

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
                Resources2.getText(getTargetContext(), android.R.string.ok, ""));
    }

    @Test
    public void getQuantityText() throws Exception {
        assertEquals(
                getTargetContext().getResources().getQuantityText(com.hendraanggrian.kota.test.R.plurals.test_plural, 2),
                Resources2.getQuantityText(getTargetContext(), com.hendraanggrian.kota.test.R.plurals.test_plural, 2));
    }

    @Test
    public void getTextArray() throws Exception {
        assertArrayEquals(
                getTargetContext().getResources().getTextArray(android.R.array.emailAddressTypes),
                Resources2.getTextArray(getTargetContext(), android.R.array.emailAddressTypes));
    }

    @Test
    public void getQuantityString() throws Exception {
        assertEquals(
                getTargetContext().getResources().getQuantityString(com.hendraanggrian.kota.test.R.plurals.test_plural2, 1, 2),
                Resources2.getQuantityString(getTargetContext(), com.hendraanggrian.kota.test.R.plurals.test_plural2, 1, 2));
    }

    @Test
    public void getStringArray() throws Exception {
        assertArrayEquals(
                getTargetContext().getResources().getStringArray(android.R.array.emailAddressTypes),
                Resources2.getStringArray(getTargetContext(), android.R.array.emailAddressTypes));
    }

    @Test
    public void getInteger() throws Exception {
        assertEquals(
                getTargetContext().getResources().getInteger(android.R.integer.config_longAnimTime),
                Resources2.getInteger(getTargetContext(), android.R.integer.config_longAnimTime));
    }

    @Test
    public void getIntArray() throws Exception {
        assertArrayEquals(
                getTargetContext().getResources().getIntArray(com.hendraanggrian.kota.test.R.array.test_integer_array),
                Resources2.getIntArray(getTargetContext(), com.hendraanggrian.kota.test.R.array.test_integer_array));
    }

    @Test
    public void getDimension() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDimension(android.R.dimen.app_icon_size),
                Resources2.getDimension(getTargetContext(), android.R.dimen.app_icon_size));
    }

    @Test
    public void getDimensionPixelOffset() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDimensionPixelOffset(android.R.dimen.app_icon_size),
                Resources2.getDimensionPixelOffset(getTargetContext(), android.R.dimen.app_icon_size));
    }

    @Test
    public void getDimensionPixelSize() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDimensionPixelSize(android.R.dimen.app_icon_size),
                Resources2.getDimensionPixelSize(getTargetContext(), android.R.dimen.app_icon_size));
    }

    @Test
    public void getDrawable() throws Exception {
        assertEquals(
                getTargetContext().getResources().getDrawable(android.R.drawable.alert_dark_frame),
                Resources2.getDrawable2(getTargetContext(), android.R.drawable.alert_dark_frame));
    }

    @Test
    public void getColor() throws Exception {
        assertEquals(
                getTargetContext().getResources().getColor(android.R.color.background_dark),
                Resources2.getColor2(getTargetContext(), android.R.color.background_dark));
    }

    @Test
    public void getColorStateList() throws Exception {
        assertEquals(
                getTargetContext().getResources().getColorStateList(android.R.color.background_dark),
                Resources2.getColorStateList2(getTargetContext(), android.R.color.background_dark));
    }

    @Test
    public void getBoolean() throws Exception {
        assertEquals(
                getTargetContext().getResources().getBoolean(com.hendraanggrian.kota.test.R.bool.abc_action_bar_embed_tabs),
                Resources2.getBoolean(getTargetContext(), com.hendraanggrian.kota.test.R.bool.abc_action_bar_embed_tabs));
    }

    @Test
    public void getLayout() throws Exception {
        assertEquals(
                getTargetContext().getResources().getLayout(com.hendraanggrian.kota.test.R.layout.activity_viewgroups),
                Resources2.getLayout(getTargetContext(), com.hendraanggrian.kota.test.R.layout.activity_viewgroups));
    }

    @Test
    public void getAnimation() throws Exception {
        assertEquals(
                getTargetContext().getResources().getAnimation(android.R.anim.accelerate_decelerate_interpolator),
                Resources2.getAnimation(getTargetContext(), android.R.anim.accelerate_decelerate_interpolator));
    }

    @Test
    public void getXml() throws Exception {
        assertEquals(
                getTargetContext().getResources().getXml(com.hendraanggrian.kota.test.R.xml.test_xml),
                Resources2.getXml(getTargetContext(), com.hendraanggrian.kota.test.R.xml.test_xml));
    }
}