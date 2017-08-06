package com.hendraanggrian.kota.annotation;

import android.Manifest;
import android.annotation.SuppressLint;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * List of valid permission strings according to {@link Manifest.permission}.
 * Permission request will not accept any string outside strings from this list.
 *
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
@SuppressLint("InlinedApi")
@Retention(RetentionPolicy.SOURCE)
@StringDef({
        Manifest.permission.ACCESS_CHECKIN_PROPERTIES,
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS,
        Manifest.permission.ACCESS_NETWORK_STATE,
        Manifest.permission.ACCESS_NOTIFICATION_POLICY,
        Manifest.permission.ACCESS_WIFI_STATE,
        Manifest.permission.ACCOUNT_MANAGER,
        Manifest.permission.ADD_VOICEMAIL,

        Manifest.permission.BATTERY_STATS,
        Manifest.permission.BIND_ACCESSIBILITY_SERVICE,
        Manifest.permission.BIND_APPWIDGET,
        Manifest.permission.BIND_CARRIER_MESSAGING_SERVICE,
        Manifest.permission.BIND_CARRIER_SERVICES,
        Manifest.permission.BIND_CHOOSER_TARGET_SERVICE,
        Manifest.permission.BIND_CONDITION_PROVIDER_SERVICE,
        Manifest.permission.BIND_DEVICE_ADMIN,
        Manifest.permission.BIND_DREAM_SERVICE,
        Manifest.permission.BIND_INCALL_SERVICE,
        Manifest.permission.BIND_INPUT_METHOD,
        Manifest.permission.BIND_MIDI_DEVICE_SERVICE,
        Manifest.permission.BIND_NFC_SERVICE,
        Manifest.permission.BIND_NOTIFICATION_LISTENER_SERVICE,
        Manifest.permission.BIND_PRINT_SERVICE,
        Manifest.permission.BIND_QUICK_SETTINGS_TILE,
        Manifest.permission.BIND_REMOTEVIEWS,
        Manifest.permission.BIND_SCREENING_SERVICE,
        Manifest.permission.BIND_TELECOM_CONNECTION_SERVICE,
        Manifest.permission.BIND_TEXT_SERVICE,
        Manifest.permission.BIND_TV_INPUT,
        Manifest.permission.BIND_VOICE_INTERACTION,
        Manifest.permission.BIND_VPN_SERVICE,
        Manifest.permission.BIND_VR_LISTENER_SERVICE,
        Manifest.permission.BIND_WALLPAPER,
        Manifest.permission.BLUETOOTH,
        Manifest.permission.BLUETOOTH_ADMIN,
        Manifest.permission.BLUETOOTH_PRIVILEGED,
        Manifest.permission.BODY_SENSORS,
        Manifest.permission.BROADCAST_PACKAGE_REMOVED,
        Manifest.permission.BROADCAST_SMS,
        Manifest.permission.BROADCAST_STICKY,
        Manifest.permission.BROADCAST_WAP_PUSH,

        Manifest.permission.CALL_PHONE,
        Manifest.permission.CALL_PRIVILEGED,
        Manifest.permission.CAMERA,
        Manifest.permission.CAPTURE_AUDIO_OUTPUT,
        Manifest.permission.CAPTURE_SECURE_VIDEO_OUTPUT,
        Manifest.permission.CAPTURE_VIDEO_OUTPUT,
        Manifest.permission.CHANGE_COMPONENT_ENABLED_STATE,
        Manifest.permission.CHANGE_CONFIGURATION,
        Manifest.permission.CHANGE_NETWORK_STATE,
        Manifest.permission.CHANGE_WIFI_MULTICAST_STATE,
        Manifest.permission.CHANGE_WIFI_STATE,
        Manifest.permission.CLEAR_APP_CACHE,
        Manifest.permission.CONTROL_LOCATION_UPDATES,

        Manifest.permission.DELETE_CACHE_FILES,
        Manifest.permission.DELETE_PACKAGES,
        Manifest.permission.DIAGNOSTIC,
        Manifest.permission.DISABLE_KEYGUARD,
        Manifest.permission.DUMP,

        Manifest.permission.EXPAND_STATUS_BAR,

        Manifest.permission.FACTORY_TEST,

        Manifest.permission.GET_ACCOUNTS,
        Manifest.permission.GET_ACCOUNTS_PRIVILEGED,
        Manifest.permission.GET_PACKAGE_SIZE,
        Manifest.permission.GET_TASKS,
        Manifest.permission.GLOBAL_SEARCH,

        Manifest.permission.INSTALL_LOCATION_PROVIDER,
        Manifest.permission.INSTALL_PACKAGES,
        Manifest.permission.INSTALL_SHORTCUT,
        Manifest.permission.INTERNET,

        Manifest.permission.KILL_BACKGROUND_PROCESSES,

        Manifest.permission.LOCATION_HARDWARE,

        Manifest.permission.MANAGE_DOCUMENTS,
        Manifest.permission.MASTER_CLEAR,
        Manifest.permission.MEDIA_CONTENT_CONTROL,
        Manifest.permission.MODIFY_AUDIO_SETTINGS,
        Manifest.permission.MODIFY_PHONE_STATE,
        Manifest.permission.MOUNT_FORMAT_FILESYSTEMS,
        Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS,

        Manifest.permission.NFC,

        Manifest.permission.PACKAGE_USAGE_STATS,
        Manifest.permission.PERSISTENT_ACTIVITY,
        Manifest.permission.PROCESS_OUTGOING_CALLS,

        Manifest.permission.READ_CALENDAR,
        Manifest.permission.READ_CALL_LOG,
        Manifest.permission.READ_CONTACTS,
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.READ_FRAME_BUFFER,
        Manifest.permission.READ_INPUT_STATE,
        Manifest.permission.READ_LOGS,
        Manifest.permission.READ_PHONE_STATE,
        Manifest.permission.READ_SMS,
        Manifest.permission.READ_SYNC_SETTINGS,
        Manifest.permission.READ_SYNC_STATS,
        Manifest.permission.READ_VOICEMAIL,
        Manifest.permission.REBOOT,
        Manifest.permission.RECEIVE_BOOT_COMPLETED,
        Manifest.permission.RECEIVE_MMS,
        Manifest.permission.RECEIVE_SMS,
        Manifest.permission.RECEIVE_WAP_PUSH,
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.REORDER_TASKS,
        Manifest.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS,
        Manifest.permission.REQUEST_INSTALL_PACKAGES,
        Manifest.permission.RESTART_PACKAGES,

        Manifest.permission.SEND_RESPOND_VIA_MESSAGE,
        Manifest.permission.SEND_SMS,
        Manifest.permission.SET_ALARM,
        Manifest.permission.SET_ALWAYS_FINISH,
        Manifest.permission.SET_ANIMATION_SCALE,
        Manifest.permission.SET_DEBUG_APP,
        Manifest.permission.SET_PREFERRED_APPLICATIONS,
        Manifest.permission.SET_PROCESS_LIMIT,
        Manifest.permission.SET_TIME,
        Manifest.permission.SET_TIME_ZONE,
        Manifest.permission.SET_WALLPAPER,
        Manifest.permission.SET_WALLPAPER_HINTS,
        Manifest.permission.SIGNAL_PERSISTENT_PROCESSES,
        Manifest.permission.STATUS_BAR,
        Manifest.permission.SYSTEM_ALERT_WINDOW,

        Manifest.permission.TRANSMIT_IR,

        Manifest.permission.UNINSTALL_SHORTCUT,
        Manifest.permission.UPDATE_DEVICE_STATS,
        Manifest.permission.USE_FINGERPRINT,
        Manifest.permission.USE_SIP,

        Manifest.permission.VIBRATE,

        Manifest.permission.WAKE_LOCK,
        Manifest.permission.WRITE_APN_SETTINGS,
        Manifest.permission.WRITE_CALENDAR,
        Manifest.permission.WRITE_CALL_LOG,
        Manifest.permission.WRITE_CONTACTS,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_GSERVICES,
        Manifest.permission.WRITE_SECURE_SETTINGS,
        Manifest.permission.WRITE_SETTINGS,
        Manifest.permission.WRITE_SYNC_SETTINGS,
        Manifest.permission.WRITE_VOICEMAIL
})
public @interface PermissionString {
}