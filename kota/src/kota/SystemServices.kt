@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kota

import android.accounts.AccountManager
import android.app.*
import android.app.admin.DevicePolicyManager
import android.app.job.JobScheduler
import android.app.usage.NetworkStatsManager
import android.app.usage.UsageStatsManager
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothManager
import android.content.ClipboardManager
import android.content.Context
import android.content.Context.*
import android.content.RestrictionsManager
import android.content.pm.LauncherApps
import android.hardware.ConsumerIrManager
import android.hardware.SensorManager
import android.hardware.display.DisplayManager
import android.hardware.fingerprint.FingerprintManager
import android.hardware.input.InputManager
import android.hardware.usb.UsbManager
import android.location.LocationManager
import android.media.AudioManager
import android.media.MediaRouter
import android.media.midi.MidiManager
import android.media.projection.MediaProjectionManager
import android.media.session.MediaSessionManager
import android.media.tv.TvInputManager
import android.net.ConnectivityManager
import android.net.nsd.NsdManager
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.nfc.NfcManager
import android.os.*
import android.os.storage.StorageManager
import android.print.PrintManager
import android.support.annotation.RequiresApi
import android.telecom.TelecomManager
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager

@PublishedApi
internal inline fun <reified T> Context.getSystemServiceNullable(name: String): T? = getSystemService(name) as? T

inline val Context.accessibilityManager: AccessibilityManager? get() = getSystemServiceNullable(ACCESSIBILITY_SERVICE)
inline val Fragment.accessibilityManager: AccessibilityManager? get() = activity.accessibilityManager
inline val Dialog.accessibilityManager: AccessibilityManager? get() = context.accessibilityManager

inline val Context.accountManager: AccountManager? get() = getSystemServiceNullable(ACCOUNT_SERVICE)
inline val Fragment.accountManager: AccountManager? get() = activity.accountManager
inline val Dialog.accountManager: AccountManager? get() = context.accountManager

inline val Context.activityManager: ActivityManager? get() = getSystemServiceNullable(ACTIVITY_SERVICE)
inline val Fragment.activityManager: ActivityManager? get() = activity.activityManager
inline val Dialog.activityManager: ActivityManager? get() = context.activityManager

inline val Context.alarmManager: AlarmManager? get() = getSystemServiceNullable(ALARM_SERVICE)
inline val Fragment.alarmManager: AlarmManager? get() = activity.alarmManager
inline val Dialog.alarmManager: AlarmManager? get() = context.alarmManager

inline val Context.appOpsManager: AppOpsManager? @RequiresApi(19) get() = getSystemServiceNullable(APP_OPS_SERVICE)
inline val Fragment.appOpsManager: AppOpsManager? @RequiresApi(19) get() = activity.appOpsManager
inline val Dialog.appOpsManager: AppOpsManager? @RequiresApi(19) get() = context.appOpsManager

inline val Context.appWidgetManager: AppWidgetManager? @RequiresApi(21) get() = getSystemServiceNullable(APPWIDGET_SERVICE)
inline val Fragment.appWidgetManager: AppWidgetManager? @RequiresApi(21) get() = activity.appWidgetManager
inline val Dialog.appWidgetManager: AppWidgetManager? @RequiresApi(21) get() = context.appWidgetManager

inline val Context.audioManager: AudioManager? get() = getSystemServiceNullable(AUDIO_SERVICE)
inline val Fragment.audioManager: AudioManager? get() = activity.audioManager
inline val Dialog.audioManager: AudioManager? get() = context.audioManager

inline val Context.batteryManager: BatteryManager? @RequiresApi(21) get() = getSystemServiceNullable(BATTERY_SERVICE)
inline val Fragment.batteryManager: BatteryManager? @RequiresApi(21) get() = activity.batteryManager
inline val Dialog.batteryManager: BatteryManager? @RequiresApi(21) get() = context.batteryManager

inline val Context.bluetoothManager: BluetoothManager? @RequiresApi(18) get() = getSystemServiceNullable(BLUETOOTH_SERVICE)
inline val Fragment.bluetoothManager: BluetoothManager? @RequiresApi(18) get() = activity.bluetoothManager
inline val Dialog.bluetoothManager: BluetoothManager? @RequiresApi(18) get() = context.bluetoothManager

inline val Context.clipboardManager: ClipboardManager? get() = getSystemServiceNullable(CLIPBOARD_SERVICE)
inline val Fragment.clipboardManager: ClipboardManager? get() = activity.clipboardManager
inline val Dialog.clipboardManager: ClipboardManager? get() = context.clipboardManager

inline val Context.connectivityManager: ConnectivityManager? get() = getSystemServiceNullable(CONNECTIVITY_SERVICE)
inline val Fragment.connectivityManager: ConnectivityManager? get() = activity.connectivityManager
inline val Dialog.connectivityManager: ConnectivityManager? get() = context.connectivityManager

inline val Context.consumerIrManager: ConsumerIrManager? @RequiresApi(19) get() = getSystemServiceNullable(CONSUMER_IR_SERVICE)
inline val Fragment.consumerIrManager: ConsumerIrManager? @RequiresApi(19) get() = activity.consumerIrManager
inline val Dialog.consumerIrManager: ConsumerIrManager? @RequiresApi(19) get() = context.consumerIrManager

inline val Context.devicePolicyManager: DevicePolicyManager? get() = getSystemServiceNullable(DEVICE_POLICY_SERVICE)
inline val Fragment.devicePolicyManager: DevicePolicyManager? get() = activity.devicePolicyManager
inline val Dialog.devicePolicyManager: DevicePolicyManager? get() = context.devicePolicyManager

inline val Context.displayManager: DisplayManager? @RequiresApi(17) get() = getSystemServiceNullable(DISPLAY_SERVICE)
inline val Fragment.displayManager: DisplayManager? @RequiresApi(17) get() = activity.displayManager
inline val Dialog.displayManager: DisplayManager? @RequiresApi(17) get() = context.displayManager

inline val Context.downloadManager: DownloadManager? get() = getSystemServiceNullable(DOWNLOAD_SERVICE)
inline val Fragment.downloadManager: DownloadManager? get() = activity.downloadManager
inline val Dialog.downloadManager: DownloadManager? get() = context.downloadManager

inline val Context.dropBoxManager: DropBoxManager? get() = getSystemServiceNullable(DROPBOX_SERVICE)
inline val Fragment.dropBoxManager: DropBoxManager? get() = activity.dropBoxManager
inline val Dialog.dropBoxManager: DropBoxManager? get() = context.dropBoxManager

inline val Context.fingerprintManager: FingerprintManager? @RequiresApi(23) get() = getSystemServiceNullable(FINGERPRINT_SERVICE)
inline val Fragment.fingerprintManager: FingerprintManager? @RequiresApi(23) get() = activity.fingerprintManager
inline val Dialog.fingerprintManager: FingerprintManager? @RequiresApi(23) get() = context.fingerprintManager

inline val Context.inputMethodManager: InputMethodManager? get() = getSystemServiceNullable(INPUT_METHOD_SERVICE)
inline val Fragment.inputMethodManager: InputMethodManager? get() = activity.inputMethodManager
inline val Dialog.inputMethodManager: InputMethodManager? get() = context.inputMethodManager

inline val Context.inputManager: InputManager? @RequiresApi(16) get() = getSystemServiceNullable(INPUT_SERVICE)
inline val Fragment.inputManager: InputManager? @RequiresApi(16) get() = activity.inputManager
inline val Dialog.inputManager: InputManager? @RequiresApi(16) get() = context.inputManager

inline val Context.jobScheduler: JobScheduler? @RequiresApi(21) get() = getSystemServiceNullable(JOB_SCHEDULER_SERVICE)
inline val Fragment.jobScheduler: JobScheduler? @RequiresApi(21) get() = activity.jobScheduler
inline val Dialog.jobScheduler: JobScheduler? @RequiresApi(21) get() = context.jobScheduler

inline val Context.keyguardManager: KeyguardManager? get() = getSystemServiceNullable(KEYGUARD_SERVICE)
inline val Fragment.keyguardManager: KeyguardManager? get() = activity.keyguardManager
inline val Dialog.keyguardManager: KeyguardManager? get() = context.keyguardManager

inline val Context.launcherApps: LauncherApps? @RequiresApi(21) get() = getSystemServiceNullable(LAUNCHER_APPS_SERVICE)
inline val Fragment.launcherApps: LauncherApps? @RequiresApi(21) get() = activity.launcherApps
inline val Dialog.launcherApps: LauncherApps? @RequiresApi(21) get() = context.launcherApps

inline val Context.layoutInflater: LayoutInflater get() = LayoutInflater.from(this)

inline val Context.locationManager: LocationManager? get() = getSystemServiceNullable(LOCATION_SERVICE)
inline val Fragment.locationManager: LocationManager? get() = activity.locationManager
inline val Dialog.locationManager: LocationManager? get() = context.locationManager

inline val Context.mediaProjectionManager: MediaProjectionManager? @RequiresApi(21) get() = getSystemServiceNullable(MEDIA_PROJECTION_SERVICE)
inline val Fragment.mediaProjectionManager: MediaProjectionManager? @RequiresApi(21) get() = activity.mediaProjectionManager
inline val Dialog.mediaProjectionManager: MediaProjectionManager? @RequiresApi(21) get() = context.mediaProjectionManager

inline val Context.mediaRouter: MediaRouter? @RequiresApi(16) get() = getSystemServiceNullable(MEDIA_ROUTER_SERVICE)
inline val Fragment.mediaRouter: MediaRouter? @RequiresApi(16) get() = activity.mediaRouter
inline val Dialog.mediaRouter: MediaRouter? @RequiresApi(16) get() = context.mediaRouter

inline val Context.mediaSessionManager: MediaSessionManager? @RequiresApi(21) get() = getSystemServiceNullable(MEDIA_SESSION_SERVICE)
inline val Fragment.mediaSessionManager: MediaSessionManager? @RequiresApi(21) get() = activity.mediaSessionManager
inline val Dialog.mediaSessionManager: MediaSessionManager? @RequiresApi(21) get() = context.mediaSessionManager

inline val Context.midiManager: MidiManager? @RequiresApi(23) get() = getSystemServiceNullable(MIDI_SERVICE)
inline val Fragment.midiManager: MidiManager? @RequiresApi(23) get() = activity.midiManager
inline val Dialog.midiManager: MidiManager? @RequiresApi(23) get() = context.midiManager

inline val Context.networkStatsManager: NetworkStatsManager? @RequiresApi(23) get() = getSystemServiceNullable(NETWORK_STATS_SERVICE)
inline val Fragment.networkStatsManager: NetworkStatsManager? @RequiresApi(23) get() = activity.networkStatsManager
inline val Dialog.networkStatsManager: NetworkStatsManager? @RequiresApi(23) get() = context.networkStatsManager

inline val Context.nfcManager: NfcManager? get() = getSystemServiceNullable(NFC_SERVICE)
inline val Fragment.nfcManager: NfcManager? get() = activity.nfcManager
inline val Dialog.nfcManager: NfcManager? get() = context.nfcManager

inline val Context.notificationManager: NotificationManager? get() = getSystemServiceNullable(NOTIFICATION_SERVICE)
inline val Fragment.notificationManager: NotificationManager? get() = activity.notificationManager
inline val Dialog.notificationManager: NotificationManager? get() = context.notificationManager

inline val Context.nsdManager: NsdManager? @RequiresApi(16) get() = getSystemServiceNullable(NSD_SERVICE)
inline val Fragment.nsdManager: NsdManager? @RequiresApi(16) get() = activity.nsdManager
inline val Dialog.nsdManager: NsdManager? @RequiresApi(16) get() = context.nsdManager

inline val Context.powerManager: PowerManager? get() = getSystemServiceNullable(POWER_SERVICE)
inline val Fragment.powerManager: PowerManager? get() = activity.powerManager
inline val Dialog.powerManager: PowerManager? get() = context.powerManager

inline val Context.printManager: PrintManager? @RequiresApi(19) get() = getSystemServiceNullable(PRINT_SERVICE)
inline val Fragment.printManager: PrintManager? @RequiresApi(19) get() = activity.printManager
inline val Dialog.printManager: PrintManager? @RequiresApi(19) get() = context.printManager

inline val Context.restrictionsManager: RestrictionsManager? @RequiresApi(21) get() = getSystemServiceNullable(RESTRICTIONS_SERVICE)
inline val Fragment.restrictionsManager: RestrictionsManager? @RequiresApi(21) get() = activity.restrictionsManager
inline val Dialog.restrictionsManager: RestrictionsManager? @RequiresApi(21) get() = context.restrictionsManager

inline val Context.searchManager: SearchManager? get() = getSystemServiceNullable(SEARCH_SERVICE)
inline val Fragment.searchManager: SearchManager? get() = activity.searchManager
inline val Dialog.searchManager: SearchManager? get() = context.searchManager

inline val Context.sensorManager: SensorManager? get() = getSystemServiceNullable(SENSOR_SERVICE)
inline val Fragment.sensorManager: SensorManager? get() = activity.sensorManager
inline val Dialog.sensorManager: SensorManager? get() = context.sensorManager

inline val Context.storageManager: StorageManager? get() = getSystemServiceNullable(STORAGE_SERVICE)
inline val Fragment.storageManager: StorageManager? get() = activity.storageManager
inline val Dialog.storageManager: StorageManager? get() = context.storageManager

inline val Context.subscriptionManager: SubscriptionManager? @RequiresApi(22) get() = getSystemServiceNullable(TELEPHONY_SUBSCRIPTION_SERVICE)
inline val Fragment.subscriptionManager: SubscriptionManager? @RequiresApi(22) get() = activity.subscriptionManager
inline val Dialog.subscriptionManager: SubscriptionManager? @RequiresApi(22) get() = context.subscriptionManager

inline val Context.telecomManager: TelecomManager? @RequiresApi(21) get() = getSystemServiceNullable(TELECOM_SERVICE)
inline val Fragment.telecomManager: TelecomManager? @RequiresApi(21) get() = activity.telecomManager
inline val Dialog.telecomManager: TelecomManager? @RequiresApi(21) get() = context.telecomManager

inline val Context.telephonyManager: TelephonyManager? get() = getSystemServiceNullable(TELEPHONY_SERVICE)
inline val Fragment.telephonyManager: TelephonyManager? get() = activity.telephonyManager
inline val Dialog.telephonyManager: TelephonyManager? get() = context.telephonyManager

inline val Context.textServicesManager: TextServicesManager? get() = getSystemServiceNullable(TEXT_SERVICES_MANAGER_SERVICE)
inline val Fragment.textServicesManager: TextServicesManager? get() = activity.textServicesManager
inline val Dialog.textServicesManager: TextServicesManager? get() = context.textServicesManager

inline val Context.tvInputManager: TvInputManager? @RequiresApi(21) get() = getSystemServiceNullable(TV_INPUT_SERVICE)
inline val Fragment.tvInputManager: TvInputManager? @RequiresApi(21) get() = activity.tvInputManager
inline val Dialog.tvInputManager: TvInputManager? @RequiresApi(21) get() = context.tvInputManager

inline val Context.uiModeManager: UiModeManager? get() = getSystemServiceNullable(UI_MODE_SERVICE)
inline val Fragment.uiModeManager: UiModeManager? get() = activity.uiModeManager
inline val Dialog.uiModeManager: UiModeManager? get() = context.uiModeManager

inline val Context.usageStatsManager: UsageStatsManager? @RequiresApi(22) get() = getSystemServiceNullable(USAGE_STATS_SERVICE)
inline val Fragment.usageStatsManager: UsageStatsManager? @RequiresApi(22) get() = activity.usageStatsManager
inline val Dialog.usageStatsManager: UsageStatsManager? @RequiresApi(22) get() = context.usageStatsManager

inline val Context.usbManager: UsbManager? get() = getSystemServiceNullable(USB_SERVICE)
inline val Fragment.usbManager: UsbManager? get() = activity.usbManager
inline val Dialog.usbManager: UsbManager? get() = context.usbManager

inline val Context.userManager: UserManager? @RequiresApi(17) get() = getSystemServiceNullable(USER_SERVICE)
inline val Fragment.userManager: UserManager? @RequiresApi(17) get() = activity.userManager
inline val Dialog.userManager: UserManager? @RequiresApi(17) get() = context.userManager

inline val Context.vibrator: Vibrator? get() = getSystemServiceNullable(VIBRATOR_SERVICE)
inline val Fragment.vibrator: Vibrator? get() = activity.vibrator
inline val Dialog.vibrator: Vibrator? get() = context.vibrator

inline val Context.wallpaperManager: WallpaperManager? get() = getSystemServiceNullable(WALLPAPER_SERVICE)
inline val Fragment.wallpaperManager: WallpaperManager? get() = activity.wallpaperManager
inline val Dialog.wallpaperManager: WallpaperManager? get() = context.wallpaperManager

inline val Context.wifiManager: WifiManager? get() = applicationContext.getSystemServiceNullable(WIFI_SERVICE)
inline val Fragment.wifiManager: WifiManager? get() = activity.wifiManager
inline val Dialog.wifiManager: WifiManager? get() = context.wifiManager

inline val Context.wifiP2pManager: WifiP2pManager? get() = getSystemServiceNullable(WIFI_P2P_SERVICE)
inline val Fragment.wifiP2pManager: WifiP2pManager? get() = activity.wifiP2pManager
inline val Dialog.wifiP2pManager: WifiP2pManager? get() = context.wifiP2pManager

inline val Context.windowManager: WindowManager? get() = getSystemServiceNullable(WINDOW_SERVICE)
inline val Fragment.windowManager: WindowManager? get() = activity.windowManager
inline val Dialog.windowManager: WindowManager? get() = context.windowManager