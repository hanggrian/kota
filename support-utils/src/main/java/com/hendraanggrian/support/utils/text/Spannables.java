package com.hendraanggrian.support.utils.text;

import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.text.Spannable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static android.text.Spanned.SPAN_COMPOSING;
import static android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
import static android.text.Spanned.SPAN_EXCLUSIVE_INCLUSIVE;
import static android.text.Spanned.SPAN_INCLUSIVE_EXCLUSIVE;
import static android.text.Spanned.SPAN_INCLUSIVE_INCLUSIVE;
import static android.text.Spanned.SPAN_INTERMEDIATE;
import static android.text.Spanned.SPAN_PARAGRAPH;
import static android.text.Spanned.SPAN_PRIORITY;
import static android.text.Spanned.SPAN_USER;

/**
 * Utility class to easily add and remove spans of a Spannable.
 *
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Spannables {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({
            SPAN_PARAGRAPH,
            SPAN_INCLUSIVE_EXCLUSIVE, // or SPAN_MARK_MARK
            SPAN_INCLUSIVE_INCLUSIVE, // or SPAN_MARK_POINT
            SPAN_EXCLUSIVE_EXCLUSIVE, // or SPAN_POINT_MARK
            SPAN_EXCLUSIVE_INCLUSIVE, // or SPAN_POINT_POINT
            SPAN_COMPOSING,
            SPAN_INTERMEDIATE,
            SPAN_USER,
            SPAN_PRIORITY
    })
    public @interface Flags {
    }

    private Spannables() {
    }

    /**
     * Set spans from start to end with certain flag.
     */
    public static void setSpans(@NonNull Spannable spannable, int start, int end, @Flags int flags, @NonNull Object... spans) {
        for (Object span : spans) {
            spannable.setSpan(span, start, end, flags);
        }
    }

    /**
     * Set spans from start to end with default flag.
     */
    public static void setSpans(@NonNull Spannable spannable, int start, int end, @NonNull Object... spans) {
        setSpans(spannable, start, end, SPAN_EXCLUSIVE_EXCLUSIVE, spans);
    }

    /**
     * Set spans to the entire text with certain flag.
     */
    public static void setSpans(@NonNull Spannable spannable, @Flags int flags, @NonNull Object... spans) {
        setSpans(spannable, 0, spannable.length(), flags, spans);
    }

    /**
     * Set spans to the entire text with default flag.
     */
    public static void setSpans(@NonNull Spannable spannable, @NonNull Object... spans) {
        setSpans(spannable, 0, spannable.length(), SPAN_EXCLUSIVE_EXCLUSIVE, spans);
    }

    /**
     * Find substring in this Spannable and set multiple spans to it.
     */
    @NonNull
    public static Collection<Object> putSpans(@NonNull Spannable spannable, @NonNull CharSequence text, @Flags int flags, @NonNull SpanGetter... getters) {
        String string = spannable.toString();
        String substring = text.toString();
        Collection<Object> spans = new ArrayList<>();
        for (int start : listOccurrences(string, substring)) {
            int end = start + substring.length();
            for (SpanGetter getter : getters) {
                Object span = getter.getSpan();
                spannable.setSpan(span, start, end, flags);
                spans.add(span);
            }
        }
        return spans;
    }

    /**
     * Find substring in this Spannable and set multiple spans to it with default flag.
     */
    @NonNull
    public static Collection<Object> putSpans(@NonNull Spannable spannable, @NonNull CharSequence text, @NonNull SpanGetter... getters) {
        return putSpans(spannable, text, SPAN_EXCLUSIVE_EXCLUSIVE, getters);
    }

    /**
     * Find substring with regex pattern in this Spannable and set multiple spans to it.
     */
    @NonNull
    public static Collection<Object> putSpansAll(@NonNull Spannable spannable, @NonNull Pattern regex, @Flags int flags, @NonNull SpanGetter... getters) {
        Matcher matcher = regex.matcher(spannable);
        Collection<Object> spans = new ArrayList<>();
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            for (SpanGetter getter : getters) {
                Object span = getter.getSpan();
                spannable.setSpan(span, start, end, flags);
                spans.add(span);
            }
        }
        return spans;
    }

    /**
     * Find substring with regex string in this Spannable and set multiple spans to it.
     */
    @NonNull
    public static Collection<Object> putSpansAll(@NonNull Spannable spannable, @NonNull String regex, @Flags int flags, @NonNull SpanGetter... getters) {
        return putSpansAll(spannable, Pattern.compile(regex), flags, getters);
    }

    /**
     * Find substring with regex pattern in this Spannable and set multiple spans to it with default flag.
     */
    @NonNull
    public static Collection<Object> putSpansAll(@NonNull Spannable spannable, @NonNull Pattern regex, @NonNull SpanGetter... getters) {
        return putSpansAll(spannable, regex, SPAN_EXCLUSIVE_EXCLUSIVE, getters);
    }

    /**
     * Find substring with regex string in this Spannable and set multiple spans to it with default flag.
     */
    @NonNull
    public static Collection<Object> putSpansAll(@NonNull Spannable spannable, @NonNull String regex, @NonNull SpanGetter... getters) {
        return putSpansAll(spannable, regex, SPAN_EXCLUSIVE_EXCLUSIVE, getters);
    }

    /**
     * Remove multiple spans in this Spannable.
     */
    public static void removeSpans(@NonNull Spannable spannable, @NonNull Object... spans) {
        for (Object span : spans) {
            spannable.removeSpan(span);
        }
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

    public interface SpanGetter {
        @NonNull
        Object getSpan();
    }
}