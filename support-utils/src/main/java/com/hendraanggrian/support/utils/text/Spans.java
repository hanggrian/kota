package com.hendraanggrian.support.utils.text;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
    public static Spannable format(@NonNull String format, @NonNull Spec... args) {
        List<Integer> list = listOccurrences(format, "%");
        for (int index : listOccurrences(format, "%%")) {
            list.remove(Integer.valueOf(index));
            list.remove(Integer.valueOf(index + 1));
        }
        if (list.size() != args.length)
            throw new IllegalArgumentException("Expected argument " + list.size() + ", was" + args.length);
        Builder builder = new Builder();
        String remaining = format;
        int lastIndex = 0;
        for (int i = 0; i < args.length; i++) {
            String subformat = format.substring(lastIndex, list.get(i) + 2);
            lastIndex = list.get(i) + 2;
            remaining = remaining.substring(subformat.length());
            builder.append(subformat.substring(0, subformat.length() - 2));
            builder.append(String.format(subformat.substring(subformat.length() - 2), args[i].arg), args[i].flags, args[i].whats);
        }
        builder.append(remaining);
        return builder.build();
    }

    @NonNull
    private static List<Integer> listOccurrences(@NonNull String string, @NonNull String substring) {
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
    public static Spec of(@NonNull Object arg, @NonNull CharacterStyle... styles) {
        return new Spec(arg, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE, styles);
    }

    @NonNull
    public static Spec of(@NonNull Object arg, int flags, @NonNull CharacterStyle... styles) {
        return new Spec(arg, flags, styles);
    }

    public static final class Spec {
        @NonNull private final Object arg;
        private final int flags;
        @NonNull private final CharacterStyle[] whats;

        private Spec(@NonNull Object arg, int flags, @NonNull CharacterStyle... whats) {
            this.arg = arg;
            this.flags = flags;
            this.whats = whats;
        }
    }

    public static final class Builder {
        @NonNull private final SpannableStringBuilder builder;

        public Builder() {
            this(null);
        }

        public Builder(@Nullable CharSequence text) {
            this.builder = text != null
                    ? new SpannableStringBuilder(text)
                    : new SpannableStringBuilder();
        }

        @NonNull
        public Builder append(@NonNull CharSequence text) {
            builder.append(text);
            return this;
        }

        @NonNull
        public Builder append(@NonNull CharSequence text, @NonNull CharacterStyle... styles) {
            return append(text, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE, styles);
        }

        @NonNull
        public Builder append(@NonNull CharSequence text, int flags, @NonNull CharacterStyle... styles) {
            int start = builder.length();
            builder.append(text);
            for (CharacterStyle style : styles)
                builder.setSpan(style, start, builder.length(), flags);
            return this;
        }

        @NonNull
        public Spannable build() {
            return builder;
        }
    }
}