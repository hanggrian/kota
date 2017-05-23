package com.hendraanggrian.support.utils.content;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.MimeTypeMap;

import java.io.File;
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

    private MimeTypes() {
    }

    public static boolean isApplication(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_APPLICATION);
    }

    public static boolean isAudio(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_AUDIO);
    }

    public static boolean isChemical(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_CHEMICAL);
    }

    public static boolean isImage(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_IMAGE);
    }

    public static boolean isMessage(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_MESSAGE);
    }

    public static boolean isModel(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_MODEL);
    }

    public static boolean isText(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_TEXT);
    }

    public static boolean isVideo(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_VIDEO);
    }

    public static boolean isFont(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_FONT);
    }

    public static boolean isXConference(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_XCONFERENCE);
    }

    public static boolean isXWorld(@NonNull String mimeType) {
        ensureMimeType(mimeType);
        return mimeType.startsWith(TYPE_XWORLD);
    }

    private static void ensureMimeType(@NonNull CharSequence mimeType) {
        if (!Pattern.compile("[a-z]+\\/[a-z]+").matcher(mimeType).matches())
            throw new IllegalArgumentException(mimeType + " is not in correct mime type format.");
    }

    @Nullable
    public static String getMimeTypeFromUri(@NonNull Context context, @NonNull Uri uri) {
        return uri.getScheme().equals(ContentResolver.SCHEME_CONTENT)
                ? context.getContentResolver().getType(uri)
                : getMimeTypeFromURL(Uri.fromFile(new File(uri.getPath())).toString());
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