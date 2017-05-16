package com.hendraanggrian.compat.content;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.MimeTypeMap;

import java.io.File;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class MimeTypes {

    private MimeTypes() {
    }

    @Nullable
    public static String guessUri(@NonNull Context context, @NonNull Uri uri) {
        return uri.getScheme().equals(ContentResolver.SCHEME_CONTENT)
                ? context.getContentResolver().getType(uri)
                : guessURL(Uri.fromFile(new File(uri.getPath())).toString());
    }

    @Nullable
    public static String guessURL(@Nullable String url) {
        return guessExtension(MimeTypeMap.getFileExtensionFromUrl(url));
    }

    @Nullable
    public static String guessExtension(@Nullable String extension) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
    }
}