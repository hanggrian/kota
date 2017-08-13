package com.hendraanggrian.common.test.content;

import android.content.res.Configuration;
import android.os.Build;
import android.support.test.runner.AndroidJUnit4;

import com.hendraanggrian.common.content.Configurations;

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
        Configurations.getScreenSize(config);
        Configurations.isScreenSizeAtLeast(config, Configuration.SCREENLAYOUT_SIZE_LARGE);
        Configurations.isScreenLong(config);
        if (Build.VERSION.SDK_INT >= 17) {
            Configurations.isRtl(config);
        }
        Configurations.hasTouchscreen(config);
        Configurations.hasKeyboard(config);
        Configurations.isKeyboardHidden(config);
        Configurations.isHardKeyboardHidden(config);
        Configurations.hasNavigation(config);
        Configurations.isNavigationHidden(config);
        Configurations.isLandscape(config);
        Configurations.getTypeMode(config);
        Configurations.isTypeModeNormal(config);
        Configurations.getNightMode(config);
        Configurations.isNightMode(config);
    }
}