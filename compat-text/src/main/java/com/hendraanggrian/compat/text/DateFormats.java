package com.hendraanggrian.compat.text;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class DateFormats {

    @Nullable static Map<String, DateFormat> formats;
    @Nullable private static Locale defaultLocale;

    private DateFormats() {
    }

    public static void setDefaultLocale(@Nullable Locale defaultLocale) {
        DateFormats.defaultLocale = defaultLocale;
    }

    @NonNull
    public static String format(@NonNull String format, @NonNull Calendar calendar) {
        return format(format, calendar.getTime());
    }

    @NonNull
    public static String format(@NonNull String format, long millis) {
        Date date = new Date();
        date.setTime(millis);
        return format(format, date);
    }

    @NonNull
    public static String format(@NonNull String format, @NonNull Date input) {
        return get(format).format(input);
    }

    @NonNull
    public static Date parse(@NonNull String format, @NonNull String input) {
        try {
            if (TextUtils.isEmpty(input))
                throw new NullPointerException();
            return get(format).parse(input);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static DateFormat get(@NonNull String key) {
        if (formats == null)
            formats = new WeakHashMap<>();
        DateFormat format = formats.get(key);
        if (format != null)
            return format;
        format = new SimpleDateFormat(key, defaultLocale != null ? defaultLocale : Locale.getDefault());
        formats.put(key, format);
        return format;
    }
}