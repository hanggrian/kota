package com.hendraanggrian.compat.text;

import android.support.annotation.NonNull;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Spans {

    private Spans() {
    }

    @NonNull
    public static String format(@NonNull String format, @NonNull Spec... args) {
        List<Integer> list = listClean(format);
        if (list.size() != args.length)
            throw new IllegalArgumentException("Expected argument " + list.size() + ", was" + args.length);
        Builder builder = new Builder();
        for (int i = 0; i < args.length; i++) {
            String subformat = format.substring(0, list.get(i) + 1);
            format = format.substring(subformat.length());
            builder.append(String.format(subformat, args[i].arg), args[i].flags, args[i].whats);
        }
        return builder.builder.toString();
    }

    @NonNull
    public static List<Integer> listClean(@NonNull String string) {
        List<Integer> a = listOccurrences(string, "%");
        List<Integer> b = listOccurrences(string, "%%");
        for (int index : b) {
            a.remove(Integer.valueOf(index));
            a.remove(Integer.valueOf(index + 1));
        }
        return a;
    }

    @NonNull
    public static List<Integer> listOccurrences(@NonNull String string, @NonNull String substring) {
        List<Integer> lastIndexes = new ArrayList<>();
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = string.indexOf(substring, lastIndex);
            if (lastIndex != -1) {
                lastIndexes.add(lastIndex);
                lastIndex += substring.length();
            }
        }
        return lastIndexes;
    }

    @NonNull
    public static Spec of(@NonNull Object arg, int flags, @NonNull CharacterStyle... styles) {
        return new Spec(arg, flags, styles);
    }

    static final class Spec {
        @NonNull private final Object arg;
        private final int flags;
        @NonNull private final Object[] whats;

        private Spec(@NonNull Object arg, int flags, @NonNull Object... whats) {
            this.arg = arg;
            this.flags = flags;
            this.whats = whats;
        }
    }

    public static final class Builder {
        @NonNull private final SpannableStringBuilder builder;

        public Builder() {
            this.builder = new SpannableStringBuilder();
        }

        public Builder(@NonNull CharSequence text) {
            this.builder = new SpannableStringBuilder(text);
        }

        @NonNull
        public Builder append(@NonNull CharSequence text, int flags, @NonNull Object... whats) {
            int start = builder.length();
            builder.append(text);
            for (Object what : whats)
                builder.setSpan(what, start, builder.length(), flags);
            return this;
        }

        @NonNull
        public Spannable build() {
            return builder;
        }
    }
}