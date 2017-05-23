package com.hendraanggrian.support.utils.text;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.text.Format;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
abstract class Formats {

    @Nullable static Map<String, Format> formats;

    @NonNull
    static Format get(@NonNull String key, @NonNull Format newInstance) {
        if (formats == null)
            formats = new WeakHashMap<>();
        Format cache = formats.get(key);
        if (cache != null)
            return cache;
        formats.put(key, newInstance);
        return newInstance;
    }
}