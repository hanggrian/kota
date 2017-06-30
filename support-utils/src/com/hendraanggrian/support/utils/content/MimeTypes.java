package com.hendraanggrian.support.utils.content;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class MimeTypes {

    public static final String TYPE_APPLICATION = "application";
    public static final String TYPE_AUDIO = "audio";
    public static final String TYPE_CHEMICAL = "chemical";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_MESSAGE = "message";
    public static final String TYPE_MODEL = "model";
    public static final String TYPE_TEXT = "text";
    public static final String TYPE_VIDEO = "video";
    public static final String TYPE_FONT = "font";
    public static final String TYPE_XCONFERENCE = "x-conference";
    public static final String TYPE_XWORLD = "x-world";

    @StringDef({
            TYPE_APPLICATION,
            TYPE_AUDIO,
            TYPE_CHEMICAL,
            TYPE_IMAGE,
            TYPE_MESSAGE,
            TYPE_MODEL,
            TYPE_TEXT,
            TYPE_VIDEO,
            TYPE_FONT,
            TYPE_XCONFERENCE,
            TYPE_XWORLD
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private MimeTypes() {
    }

    public static boolean isType(@Nullable String mimeType, @NonNull @Type String type) {
        if (TextUtils.isEmpty(mimeType)) {
            return false;
        }
        if (!Pattern.compile("[a-z]+\\/[a-z]+").matcher(mimeType).matches()) {
            throw new IllegalArgumentException(mimeType + " is not in correct mime type format.");
        }
        return mimeType.startsWith(type);
    }

    @Nullable
    public static String getMimeTypeFromUri(@NonNull Context context, @NonNull Uri uri) {
        return getMimeTypeFromUri(context.getContentResolver(), uri);
    }

    @Nullable
    public static String getMimeTypeFromUri(@NonNull ContentResolver resolver, @NonNull Uri uri) {
        return Uris.isContentUri(uri)
                ? resolver.getType(uri)
                : getMimeTypeFromFile(new File(uri.getPath()));
    }

    @Nullable
    public static String getMimeTypeFromFile(@NonNull File file) {
        return getMimeTypeFromURL(file.getAbsolutePath());
    }

    @Nullable
    public static String getMimeTypeFromURL(@Nullable String url) {
        return getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(url));
    }

    @Nullable
    public static String getMimeTypeFromExtension(@Nullable String extension) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
    }

    @Nullable
    public static String getExtensionFromMimeType(@Nullable String mimeType) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType);
    }
}