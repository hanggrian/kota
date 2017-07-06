package com.hendraanggrian.support.utils.content;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;

import java.io.File;
import java.util.regex.Pattern;

import static com.hendraanggrian.support.utils.Preconditions.checkArgument;
import static com.hendraanggrian.support.utils.Preconditions.checkNotNull;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class MimeTypes {

    private MimeTypes() {
    }

    public static boolean isType(@Nullable String mimeType, @NonNull String type) {
        checkNotNull(type);
        if (TextUtils.isEmpty(mimeType)) {
            return false;
        }
        checkArgument(!Pattern.compile("[a-z]+\\/[a-z]+")
                        .matcher(mimeType)
                        .matches(),
                mimeType + " is not in correct mime type format.");
        return mimeType.startsWith(type);
    }

    @Nullable
    public static String fromUri(@NonNull Context context, @NonNull Uri uri) {
        checkNotNull(context);
        return fromUri(context.getContentResolver(), uri);
    }

    @NonNull
    public static String fromUri(@NonNull ContentResolver resolver, @NonNull Uri uri) {
        return checkNotNull(fromUriOrNull(resolver, uri));
    }

    @Nullable
    public static String fromUriOrNull(@NonNull Context context, @NonNull Uri uri) {
        checkNotNull(context);
        return fromUriOrNull(context.getContentResolver(), uri);
    }

    @Nullable
    public static String fromUriOrNull(@NonNull ContentResolver resolver, @NonNull Uri uri) {
        checkNotNull(resolver);
        checkNotNull(uri);
        return Uris.isContent(uri)
                ? resolver.getType(uri)
                : fromFileOrNull(new File(uri.getPath()));
    }

    @NonNull
    public static String fromFile(@NonNull File file) {
        checkNotNull(file);
        return checkNotNull(fromUrlOrNull(file.getAbsolutePath()));
    }

    @Nullable
    public static String fromFileOrNull(@NonNull File file) {
        return fromUrlOrNull(file.getAbsolutePath());
    }

    @NonNull
    public static String fromUrl(@NonNull String url) {
        checkNotNull(url);
        return checkNotNull(fromExtensionOrNull(MimeTypeMap.getFileExtensionFromUrl(url)));
    }

    @Nullable
    public static String fromUrlOrNull(@Nullable String url) {
        return fromExtensionOrNull(MimeTypeMap.getFileExtensionFromUrl(url));
    }

    @NonNull
    public static String fromExtension(@NonNull String extension) {
        checkNotNull(extension);
        return checkNotNull(fromExtensionOrNull(extension));
    }

    @Nullable
    public static String fromExtensionOrNull(@Nullable String extension) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
    }

    @NonNull
    public static String toExtension(@NonNull String mimeType) {
        checkNotNull(mimeType);
        return checkNotNull(toExtensionOrNull(mimeType));
    }

    @Nullable
    public static String toExtensionOrNull(@Nullable String mimeType) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType);
    }
}