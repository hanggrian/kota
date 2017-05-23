package com.hendraanggrian.support.utils.io;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Files {

    private Files() {
    }

    @NonNull
    public static Collection<File> listAllFiles(@NonNull File dir) {
        if (!dir.exists() || !dir.isDirectory())
            return Collections.emptyList();
        List<File> files = new ArrayList<>();
        for (File file : dir.listFiles()) {
            if (file.isFile())
                files.add(file);
            else if (file.isDirectory())
                files.addAll(listAllFiles(file));
        }
        return files;
    }

    public static boolean exists(@Nullable String fileName) {
        return !TextUtils.isEmpty(fileName) && new File(fileName).exists();
    }

    @NonNull
    public static String getExtension(@NonNull File file) {
        return getExtension(file.getName());
    }

    @NonNull
    public static String getExtension(@NonNull String s) {
        return s.substring(s.lastIndexOf(".") + 1);
    }
}