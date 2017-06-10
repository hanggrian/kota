package com.hendraanggrian.support.utils.content;

import android.support.test.runner.AndroidJUnit4;

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
        assertEquals(Configurations.hasTouchscreen(getTargetContext()), true);
    }
}