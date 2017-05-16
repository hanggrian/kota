package com.hendraanggrian.compat.text;

import android.support.annotation.NonNull;
import android.text.style.CharacterStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Spans {

    private Spans() {
    }

    public static void format(@NonNull String format, @NonNull Spec... args) {
        /*int count = countOccurences(format, "%") - (countOccurences(format, "%%") * 2);
        if (count != args.length)
            throw new IllegalArgumentException("Expected argument " + count + ", was" + args.length);
        String[] formatArgs = new String[args.length];
        for (int i = 0; i < args.length; i++)
            formatArgs[i] = args[i].text;
        String actual = String.format(format, (Object[]) formatArgs);
        for (int i = 0; i < args.length; i++) {

        }*/
    }

    @NonNull
    public static Spec of(@NonNull String text, @NonNull CharacterStyle... styles) {
        return new Spec(text, styles);
    }

    public static List<Integer> countOccurences(@NonNull String string, @NonNull String substring) {
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

    private static final class Spec {
        @NonNull private final String text;
        @NonNull private final CharacterStyle[] styles;

        private Spec(@NonNull String text, @NonNull CharacterStyle... styles) {
            this.text = text;
            this.styles = styles;
        }
    }
}