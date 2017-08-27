package com.hendraanggrian.kota.annotation;

import android.support.annotation.IntDef;
import android.text.Spanned;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({
        Spanned.SPAN_PARAGRAPH,
        Spanned.SPAN_INCLUSIVE_EXCLUSIVE,
        Spanned.SPAN_INCLUSIVE_INCLUSIVE,
        Spanned.SPAN_EXCLUSIVE_EXCLUSIVE,
        Spanned.SPAN_EXCLUSIVE_INCLUSIVE,
        Spanned.SPAN_COMPOSING,
        Spanned.SPAN_INTERMEDIATE,
        Spanned.SPAN_USER,
        Spanned.SPAN_PRIORITY
})
public @interface SpanFlags {
}