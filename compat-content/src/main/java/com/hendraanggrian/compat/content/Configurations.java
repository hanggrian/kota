package com.hendraanggrian.compat.content;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Configurations {

    @IntDef({
            Configuration.SCREENLAYOUT_SIZE_UNDEFINED,
            Configuration.SCREENLAYOUT_SIZE_SMALL,
            Configuration.SCREENLAYOUT_SIZE_NORMAL,
            Configuration.SCREENLAYOUT_SIZE_LARGE,
            Configuration.SCREENLAYOUT_SIZE_XLARGE
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScreenSize {
    }

    @RequiresApi(20)
    @TargetApi(20)
    @IntDef({
            Configuration.UI_MODE_TYPE_UNDEFINED,
            Configuration.UI_MODE_TYPE_NORMAL,
            Configuration.UI_MODE_TYPE_DESK,
            Configuration.UI_MODE_TYPE_CAR,
            Configuration.UI_MODE_TYPE_TELEVISION,
            Configuration.UI_MODE_TYPE_APPLIANCE,
            Configuration.UI_MODE_TYPE_WATCH
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ModeType {
    }

    @IntDef({
            Configuration.UI_MODE_NIGHT_UNDEFINED,
            Configuration.UI_MODE_NIGHT_NO,
            Configuration.UI_MODE_NIGHT_YES
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ModeNight {
    }

    private Configurations() {
    }

    @ScreenSize
    public static int getScreenSize(@NonNull Context context) {
        return getScreenSize(context.getResources());
    }

    @ScreenSize
    public static int getScreenSize(@NonNull Resources res) {
        return getScreenSize(res.getConfiguration());
    }

    @ScreenSize
    public static int getScreenSize(@NonNull Configuration config) {
        @ScreenSize int cur = config.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
        return cur;
    }

    public static boolean isScreenSizeAtLeast(@NonNull Context context, @ScreenSize int size) {
        return isScreenSizeAtLeast(context.getResources(), size);
    }

    public static boolean isScreenSizeAtLeast(@NonNull Resources res, @ScreenSize int size) {
        return isScreenSizeAtLeast(res.getConfiguration(), size);
    }

    public static boolean isScreenSizeAtLeast(@NonNull Configuration config, @ScreenSize int size) {
        int cur = getScreenSize(config);
        return cur != Configuration.SCREENLAYOUT_SIZE_UNDEFINED && cur >= size;
    }

    public static boolean isScreenLong(@NonNull Context context) {
        return isScreenLong(context.getResources());
    }

    public static boolean isScreenLong(@NonNull Resources res) {
        return isScreenLong(res.getConfiguration());
    }

    public static boolean isScreenLong(@NonNull Configuration config) {
        return (config.screenLayout & Configuration.SCREENLAYOUT_LONG_MASK) == Configuration.SCREENLAYOUT_LONG_YES;
    }

    @RequiresApi(23)
    @TargetApi(23)
    public static boolean isScreenRound(@NonNull Context context) {
        return isScreenRound(context.getResources());
    }

    @RequiresApi(23)
    @TargetApi(23)
    public static boolean isScreenRound(@NonNull Resources res) {
        return isScreenRound(res.getConfiguration());
    }

    @RequiresApi(23)
    @TargetApi(23)
    public static boolean isScreenRound(@NonNull Configuration config) {
        return config.isScreenRound();
    }

    @RequiresApi(17)
    @TargetApi(17)
    public static boolean isRtl(@NonNull Context context) {
        return isRtl(context.getResources());
    }

    @RequiresApi(17)
    @TargetApi(17)
    public static boolean isRtl(@NonNull Resources res) {
        return isRtl(res.getConfiguration());
    }

    @RequiresApi(17)
    @TargetApi(17)
    public static boolean isRtl(@NonNull Configuration config) {
        return (config.getLayoutDirection() & Configuration.SCREENLAYOUT_LAYOUTDIR_MASK) == Configuration.SCREENLAYOUT_LAYOUTDIR_RTL;
    }

    public static boolean hasTouchscreen(@NonNull Context context) {
        return hasTouchscreen(context.getResources());
    }

    public static boolean hasTouchscreen(@NonNull Resources res) {
        return hasTouchscreen(res.getConfiguration());
    }

    public static boolean hasTouchscreen(@NonNull Configuration config) {
        return config.touchscreen == Configuration.TOUCHSCREEN_FINGER;
    }

    public static boolean hasKeyboard(@NonNull Context context) {
        return hasKeyboard(context.getResources());
    }

    public static boolean hasKeyboard(@NonNull Resources res) {
        return hasKeyboard(res.getConfiguration());
    }

    public static boolean hasKeyboard(@NonNull Configuration config) {
        return config.keyboard == Configuration.KEYBOARD_QWERTY;
    }

    public static boolean isKeyboardHidden(@NonNull Context context) {
        return isKeyboardHidden(context.getResources());
    }

    public static boolean isKeyboardHidden(@NonNull Resources res) {
        return isKeyboardHidden(res.getConfiguration());
    }

    public static boolean isKeyboardHidden(@NonNull Configuration config) {
        return config.keyboardHidden == Configuration.KEYBOARDHIDDEN_YES;
    }

    public static boolean isHardKeyboardHidden(@NonNull Context context) {
        return isHardKeyboardHidden(context.getResources());
    }

    public static boolean isHardKeyboardHidden(@NonNull Resources res) {
        return isHardKeyboardHidden(res.getConfiguration());
    }

    public static boolean isHardKeyboardHidden(@NonNull Configuration config) {
        return config.hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES;
    }

    public static boolean hasNavigation(@NonNull Context context) {
        return hasNavigation(context.getResources());
    }

    public static boolean hasNavigation(@NonNull Resources res) {
        return hasNavigation(res.getConfiguration());
    }

    public static boolean hasNavigation(@NonNull Configuration config) {
        return config.navigation != Configuration.NAVIGATION_UNDEFINED && config.navigation != Configuration.NAVIGATION_NONAV;
    }

    public static boolean isNavigationHidden(@NonNull Context context) {
        return isNavigationHidden(context.getResources());
    }

    public static boolean isNavigationHidden(@NonNull Resources res) {
        return isNavigationHidden(res.getConfiguration());
    }

    public static boolean isNavigationHidden(@NonNull Configuration config) {
        return config.navigationHidden == Configuration.NAVIGATIONHIDDEN_YES;
    }

    public static boolean isLandscape(@NonNull Context context) {
        return isLandscape(context.getResources());
    }

    public static boolean isLandscape(@NonNull Resources res) {
        return isLandscape(res.getConfiguration());
    }

    public static boolean isLandscape(@NonNull Configuration config) {
        return config.orientation == Configuration.ORIENTATION_LANDSCAPE;
    }

    @ModeType
    public static int getTypeMode(@NonNull Context context) {
        return getTypeMode(context.getResources());
    }

    @ModeType
    public static int getTypeMode(@NonNull Resources res) {
        return getTypeMode(res.getConfiguration());
    }

    @ModeType
    public static int getTypeMode(@NonNull Configuration config) {
        @ModeType int cur = config.uiMode & Configuration.UI_MODE_TYPE_MASK;
        return cur;
    }

    public static boolean isTypeModeNormal(@NonNull Context context) {
        return isTypeModeNormal(context.getResources());
    }

    public static boolean isTypeModeNormal(@NonNull Resources res) {
        return isTypeModeNormal(res.getConfiguration());
    }

    public static boolean isTypeModeNormal(@NonNull Configuration config) {
        return getTypeMode(config) == Configuration.UI_MODE_TYPE_NORMAL;
    }

    @ModeNight
    public static int getNightMode(@NonNull Context context) {
        return getNightMode(context.getResources());
    }

    @ModeNight
    public static int getNightMode(@NonNull Resources res) {
        return getNightMode(res.getConfiguration());
    }

    @ModeNight
    public static int getNightMode(@NonNull Configuration config) {
        @ModeNight int cur = config.uiMode & Configuration.UI_MODE_NIGHT_MASK;
        return cur;
    }

    public static boolean isNightMode(@NonNull Context context) {
        return isNightMode(context.getResources());
    }

    public static boolean isNightMode(@NonNull Resources res) {
        return isNightMode(res.getConfiguration());
    }

    public static boolean isNightMode(@NonNull Configuration config) {
        return getNightMode(config) == Configuration.UI_MODE_NIGHT_YES;
    }
}