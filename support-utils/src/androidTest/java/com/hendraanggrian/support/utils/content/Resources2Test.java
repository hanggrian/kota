package com.hendraanggrian.support.utils.content;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class Resources2Test {

    @Test
    public void getIdentifier() throws Exception {
        assertEquals(Resources2.getIdentifier(
                getTargetContext(),
                "",
                Resources2.TYPE_ANIM
        ), 0);
        assertNotEquals(Resources2.getIdentifier(
                getTargetContext().getResources(),
                "app_name",
                Resources2.TYPE_STRING,
                "com.hendraanggrian.support.utils.test"
        ), 0);
    }
}