package com.hendraanggrian.support.utils.test;

import android.support.test.runner.AndroidJUnit4;

import com.hendraanggrian.support.utils.content.Configurations;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.junit.Assert.assertEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class ConfigurationsTest {

    @Test
    public void hasTouchscreen() throws Exception {
        Assert.assertEquals(Configurations.hasTouchscreen(getTargetContext()), true);
    }
}