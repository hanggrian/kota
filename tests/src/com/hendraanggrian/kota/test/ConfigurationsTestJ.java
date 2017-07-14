package com.hendraanggrian.kota.test;

import android.content.res.Configuration;
import android.os.Build;
import android.support.test.runner.AndroidJUnit4;

import com.hendraanggrian.kota.content.ConfigurationsKt;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class ConfigurationsTestJ {

    @Test
    public void test() throws Exception {
        Configuration config = getTargetContext().getResources().getConfiguration();
        ConfigurationsKt.getScreenSize(config);
        ConfigurationsKt.isScreenSizeAtLeast(config, Configuration.SCREENLAYOUT_SIZE_LARGE);
        ConfigurationsKt.isScreenLong(config);
        if (Build.VERSION.SDK_INT >= 17) {
            ConfigurationsKt.isRtl(config);
        }
        ConfigurationsKt.hasTouchscreen(config);
        ConfigurationsKt.hasKeyboard(config);
        ConfigurationsKt.isKeyboardHidden(config);
        ConfigurationsKt.isHardKeyboardHidden(config);
        ConfigurationsKt.hasNavigation(config);
        ConfigurationsKt.isNavigationHidden(config);
        ConfigurationsKt.isLandscape(config);
        ConfigurationsKt.getTypeMode(config);
        ConfigurationsKt.isTypeModeNormal(config);
        ConfigurationsKt.getNightMode(config);
        ConfigurationsKt.isNightMode(config);
    }
}