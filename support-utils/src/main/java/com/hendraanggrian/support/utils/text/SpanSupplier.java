package com.hendraanggrian.support.utils.text;

/**
 * Supplier for every span instance created by {@link Spannables} put and putAll methods.
 *
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public interface SpanSupplier {

    Object getSpan();
}