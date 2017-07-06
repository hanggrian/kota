package com.hendraanggrian.support.utils.test;

import android.support.test.runner.AndroidJUnit4;

import com.hendraanggrian.support.utils.content.Themes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class ThemesTest {

    @Test
    public void test() {
        Assert.assertNotEquals(Themes.getColorOrDefault(getTargetContext(), android.R.attr.colorAccent, 0), 0);
    }
}