package com.hendraanggrian.support.utils.content;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@RunWith(AndroidJUnit4.class)
public class UrisTest {

    @Test
    public void networkUri() throws Exception {
        Uri uri = Uri.parse("https://www.somewebsite.com/mytext.txt");
        assertEquals(Uris.isNetworkUri(uri), true);
    }

    @Test
    @SuppressLint("SdCardPath")
    public void localUri() throws Exception {
        Uri uri = Uri.fromFile(new File("/sdcard/android"));
        assertEquals(Uris.isFileUri(uri), true);
    }
}