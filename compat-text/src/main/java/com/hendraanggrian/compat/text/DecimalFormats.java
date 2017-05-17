package com.hendraanggrian.compat.text;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class DecimalFormats {

    @Nullable static Map<String, DecimalFormat> formats;
    @Nullable static NavigableMap<Long, String> suffixes;

    private DecimalFormats() {
    }

    @NonNull
    public static String prettyFormat(int value) {
        return prettyFormat(Long.valueOf(value));
    }

    @NonNull
    public static String prettyFormat(long value) {
        if (suffixes == null) {
            suffixes = new TreeMap<>();
            suffixes.put(1_000L, "k");
            suffixes.put(1_000_000L, "M");
            suffixes.put(1_000_000_000L, "G");
            suffixes.put(1_000_000_000_000L, "T");
            suffixes.put(1_000_000_000_000_000L, "P");
            suffixes.put(1_000_000_000_000_000_000L, "E");
        }

        //Long.MIN_VALUE == -Long.MIN_VALUE so we need an adjustment here
        if (value == Long.MIN_VALUE) return prettyFormat(Long.MIN_VALUE + 1);
        if (value < 0) return "-" + prettyFormat(-value);
        if (value < 1000) return Long.toString(value); //deal with easy case

        Map.Entry<Long, String> e = suffixes.floorEntry(value);
        Long divideBy = e.getKey();
        String suffix = e.getValue();

        long truncated = value / (divideBy / 10); //the number part of the output times 10
        boolean hasDecimal = truncated < 100 && (truncated / 10d) != (truncated / 10);
        return hasDecimal ? (truncated / 10d) + suffix : (truncated / 10) + suffix;
    }

    @NonNull
    public static String format(@NonNull String format, double number) {
        return get(format).format(number);
    }

    @NonNull
    public static String format(@NonNull String format, long number) {
        return get(format).format(number);
    }

    @NonNull
    public static Number parse(@NonNull String format, String source) {
        try {
            if (TextUtils.isEmpty(source))
                throw new NullPointerException();
            return get(format).parse(source);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static DecimalFormat get(@NonNull String key) {
        if (formats == null)
            formats = new WeakHashMap<>();
        DecimalFormat format = formats.get(key);
        if (format != null)
            return format;
        format = new DecimalFormat(key);
        formats.put(key, format);
        return format;
    }
}