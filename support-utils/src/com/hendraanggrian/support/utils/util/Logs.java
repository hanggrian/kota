package com.hendraanggrian.support.utils.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public final class Logs {

    private Logs() {
    }

    public static boolean v(@NonNull String tag, @Nullable Object msg) {
        if (msg != null) {
            Log.v(tag, msg.toString());
            return true;
        }
        return false;
    }

    public static boolean v(@NonNull String tag, @Nullable String msg, @NonNull Object... args) {
        if (msg != null) {
            Log.v(tag, args.length == 0 ? msg : String.format(msg, args));
            return true;
        }
        return false;
    }

    public static boolean v(@NonNull String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (msg != null && tr != null) {
            Log.v(tag, msg, tr);
            return true;
        }
        return Logs.v(tag, msg, new Object[0]);
    }

    public static boolean d(@NonNull String tag, @Nullable Object msg) {
        if (msg != null) {
            Log.d(tag, msg.toString());
            return true;
        }
        return false;
    }

    public static boolean d(@NonNull String tag, @Nullable String msg, @NonNull Object... args) {
        if (msg != null) {
            Log.d(tag, args.length == 0 ? msg : String.format(msg, args));
            return true;
        }
        return false;
    }

    public static boolean d(@NonNull String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (msg != null && tr != null) {
            Log.d(tag, msg, tr);
            return true;
        }
        return Logs.d(tag, msg, new Object[0]);
    }

    public static boolean i(@NonNull String tag, @Nullable Object msg) {
        if (msg != null) {
            Log.i(tag, msg.toString());
            return true;
        }
        return false;
    }

    public static boolean i(@NonNull String tag, @Nullable String msg, @NonNull Object... args) {
        if (msg != null) {
            Log.i(tag, args.length == 0 ? msg : String.format(msg, args));
            return true;
        }
        return false;
    }

    public static boolean i(@NonNull String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (msg != null && tr != null) {
            Log.i(tag, msg, tr);
            return true;
        }
        return Logs.i(tag, msg, new Object[0]);
    }

    public static boolean w(@NonNull String tag, @Nullable Throwable tr) {
        if (tr != null) {
            Log.w(tag, tr);
            return true;
        }
        return false;
    }

    public static boolean w(@NonNull String tag, @Nullable Object msg) {
        if (msg != null) {
            Log.w(tag, msg.toString());
            return true;
        }
        return false;
    }

    public static boolean w(@NonNull String tag, @Nullable String msg, @NonNull Object... args) {
        if (msg != null) {
            Log.w(tag, args.length == 0 ? msg : String.format(msg, args));
            return true;
        }
        return false;
    }

    public static boolean w(@NonNull String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (msg != null && tr != null) {
            Log.w(tag, msg, tr);
            return true;
        }
        return Logs.w(tag, msg, new Object[0]);
    }

    public static boolean e(@NonNull String tag, @Nullable Object msg) {
        if (msg != null) {
            Log.e(tag, msg.toString());
            return true;
        }
        return false;
    }

    public static boolean e(@NonNull String tag, @Nullable String msg, @NonNull Object... args) {
        if (msg != null) {
            Log.e(tag, args.length == 0 ? msg : String.format(msg, args));
            return true;
        }
        return false;
    }

    public static boolean e(@NonNull String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (msg != null && tr != null) {
            Log.e(tag, msg, tr);
            return true;
        }
        return Logs.e(tag, msg, new Object[0]);
    }

    public static boolean wtf(@NonNull String tag, @Nullable Throwable tr) {
        if (tr != null) {
            Log.wtf(tag, tr);
            return true;
        }
        return false;
    }

    public static boolean wtf(@NonNull String tag, @Nullable Object msg) {
        if (msg != null) {
            Log.wtf(tag, msg.toString());
            return true;
        }
        return false;
    }

    public static boolean wtf(@NonNull String tag, @Nullable String msg, @NonNull Object... args) {
        if (msg != null) {
            Log.wtf(tag, args.length == 0 ? msg : String.format(msg, args));
            return true;
        }
        return false;
    }

    public static boolean wtf(@NonNull String tag, @Nullable String msg, @Nullable Throwable tr) {
        if (msg != null && tr != null) {
            Log.wtf(tag, msg, tr);
            return true;
        }
        return Logs.wtf(tag, msg, new Object[0]);
    }
}