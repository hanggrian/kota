package com.hendraanggrian.commons.util;

import android.util.Log;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Logs {

    private static int MAX_LENGTH = 2048;

    private Logs() {
    }

    public static void setMaxLength(int maxLength) {
        MAX_LENGTH = maxLength;
    }

    public static void v(String tag, String msg, Object... args) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.v(tag, format(msg, args));
        } else {
            Log.v(tag, msg.substring(0, MAX_LENGTH));
            v(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void v(String tag, String msg, Object[] args, Throwable tr) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.v(tag, msg, tr);
        } else {
            Log.v(tag, msg.substring(0, MAX_LENGTH), tr);
            v(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void d(String tag, String msg, Object... args) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.d(tag, msg);
        } else {
            Log.d(tag, msg.substring(0, MAX_LENGTH));
            d(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void d(String tag, String msg, Object[] args, Throwable tr) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.d(tag, msg, tr);
        } else {
            Log.d(tag, msg.substring(0, MAX_LENGTH), tr);
            d(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void i(String tag, String msg, Object... args) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.i(tag, msg);
        } else {
            Log.i(tag, msg.substring(0, MAX_LENGTH));
            i(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void i(String tag, String msg, Object[] args, Throwable tr) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.i(tag, msg, tr);
        } else {
            Log.i(tag, msg.substring(0, MAX_LENGTH), tr);
            i(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void w(String tag, String msg, Object... args) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.w(tag, msg);
        } else {
            Log.w(tag, msg.substring(0, MAX_LENGTH));
            w(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void w(String tag, String msg, Object[] args, Throwable tr) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.w(tag, msg, tr);
        } else {
            Log.w(tag, msg.substring(0, MAX_LENGTH), tr);
            w(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void w(String tag, Throwable tr) {
        Log.w(tag, tr);
    }

    public static void e(String tag, String msg, Object... args) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.e(tag, msg);
        } else {
            Log.e(tag, msg.substring(0, MAX_LENGTH));
            e(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void e(String tag, String msg, Object[] args, Throwable tr) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.e(tag, msg, tr);
        } else {
            Log.e(tag, msg.substring(0, MAX_LENGTH), tr);
            e(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void wtf(String tag, String msg, Object... args) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.wtf(tag, msg);
        } else {
            Log.wtf(tag, msg.substring(0, MAX_LENGTH));
            wtf(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void wtf(String tag, String msg, Object[] args, Throwable tr) {
        msg = format(msg, args);
        if (msg.length() <= MAX_LENGTH) {
            Log.wtf(tag, msg, tr);
        } else {
            Log.wtf(tag, msg.substring(0, MAX_LENGTH), tr);
            wtf(tag, msg.substring(MAX_LENGTH));
        }
    }

    public static void wtf(String tag, Throwable tr) {
        Log.wtf(tag, tr);
    }

    private static String format(String msg, Object... args) {
        if (args != null && args.length > 0)
            return String.format(msg, args);
        return msg;
    }
}