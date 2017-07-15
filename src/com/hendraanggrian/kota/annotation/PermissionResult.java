package com.hendraanggrian.kota.annotation;

import android.content.pm.PackageManager;
import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@IntDef({
        PackageManager.PERMISSION_GRANTED,
        PackageManager.PERMISSION_DENIED})
@Retention(RetentionPolicy.SOURCE)
public @interface PermissionResult {
}