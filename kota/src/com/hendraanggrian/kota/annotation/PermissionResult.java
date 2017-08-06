package com.hendraanggrian.kota.annotation;

import android.content.pm.PackageManager;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({
        PackageManager.PERMISSION_GRANTED,
        PackageManager.PERMISSION_DENIED
})
public @interface PermissionResult {
}