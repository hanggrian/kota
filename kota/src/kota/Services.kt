@file:JvmName("ServicesKt")
@file:Suppress("NOTHING_TO_INLINE", "DEPRECATION", "UNUSED")

package kota

import android.accounts.AccountManager
import android.annotation.TargetApi
import android.app.*
import android.app.admin.DevicePolicyManager
import android.app.job.JobScheduler
import android.app.usage.NetworkStatsManager
import android.app.usage.UsageStatsManager
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothManager
import android.content.ClipboardManager
import android.content.Context
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

inline val Context.accessibilityManager: AccessibilityManager get() = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager

inline val Fragment.accessibilityManager: AccessibilityManager get() = activity.accessibilityManager

inline val Context.accountManager: AccountManager get() = getSystemService(Context.ACCOUNT_SERVICE) as AccountManager

inline val Fragment.accountManager: AccountManager get() = activity.accountManager

inline val Context.activityManager: ActivityManager get() = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

inline val Fragment.activityManager: ActivityManager get() = activity.activityManager

inline val Context.alarmManager: AlarmManager get() = getSystemService(Context.ALARM_SERVICE) as AlarmManager

inline val Fragment.alarmManager: AlarmManager get() = activity.alarmManager

inline val Context.appOpsManager: AppOpsManager @TargetApi(19) @RequiresApi(19) get() = getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager

inline val Fragment.appOpsManager: AppOpsManager @TargetApi(19) @RequiresApi(19) get() = activity.appOpsManager

inline val Context.appWidgetManager: AppWidgetManager @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.APPWIDGET_SERVICE) as AppWidgetManager

inline val Fragment.appWidgetManager: AppWidgetManager @TargetApi(21) @RequiresApi(21) get() = activity.appWidgetManager

inline val Context.audioManager: AudioManager get() = getSystemService(Context.AUDIO_SERVICE) as AudioManager

inline val Fragment.audioManager: AudioManager get() = activity.audioManager

inline val Context.batteryManager: BatteryManager @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.BATTERY_SERVICE) as BatteryManager

inline val Fragment.batteryManager: BatteryManager @TargetApi(21) @RequiresApi(21) get() = activity.batteryManager

inline val Context.bluetoothManager: BluetoothManager @TargetApi(18) @RequiresApi(18) get() = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager

inline val Fragment.bluetoothManager: BluetoothManager @TargetApi(18) @RequiresApi(18) get() = activity.bluetoothManager

inline val Context.clipboardManager: ClipboardManager get() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

inline val Fragment.clipboardManager: ClipboardManager get() = activity.clipboardManager

inline val Context.connectivityManager: ConnectivityManager get() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

inline val Fragment.connectivityManager: ConnectivityManager get() = activity.connectivityManager

inline val Context.consumerIrManager: ConsumerIrManager @TargetApi(19) @RequiresApi(19) get() = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager

inline val Fragment.consumerIrManager: ConsumerIrManager @TargetApi(19) @RequiresApi(19) get() = activity.consumerIrManager

inline val Context.devicePolicyManager: DevicePolicyManager get() = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager

inline val Fragment.devicePolicyManager: DevicePolicyManager get() = activity.devicePolicyManager

inline val Context.displayManager: DisplayManager @TargetApi(17) @RequiresApi(17) get() = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager

inline val Fragment.displayManager: DisplayManager @TargetApi(17) @RequiresApi(17) get() = activity.displayManager

inline val Context.downloadManager: DownloadManager get() = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

inline val Fragment.downloadManager: DownloadManager get() = activity.downloadManager

inline val Context.dropBoxManager: DropBoxManager get() = getSystemService(Context.DROPBOX_SERVICE) as DropBoxManager

inline val Fragment.dropBoxManager: DropBoxManager get() = activity.dropBoxManager

inline val Context.fingerprintManager: FingerprintManager @TargetApi(23) @RequiresApi(23) get() = getSystemService(Context.FINGERPRINT_SERVICE) as FingerprintManager

inline val Fragment.fingerprintManager: FingerprintManager @TargetApi(23) @RequiresApi(23) get() = activity.fingerprintManager

inline val Context.inputMethodManager: InputMethodManager get() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

inline val Fragment.inputMethodManager: InputMethodManager get() = activity.inputMethodManager

inline val Context.inputManager: InputManager @TargetApi(16) @RequiresApi(16) get() = getSystemService(Context.INPUT_SERVICE) as InputManager

inline val Fragment.inputManager: InputManager @TargetApi(16) @RequiresApi(16) get() = activity.inputManager

inline val Context.jobScheduler: JobScheduler @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler

inline val Fragment.jobScheduler: JobScheduler @TargetApi(21) @RequiresApi(21) get() = activity.jobScheduler

inline val Context.keyguardManager: KeyguardManager get() = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager

inline val Fragment.keyguardManager: KeyguardManager get() = activity.keyguardManager

inline val Context.launcherApps: LauncherApps @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.LAUNCHER_APPS_SERVICE) as LauncherApps

inline val Fragment.launcherApps: LauncherApps @TargetApi(21) @RequiresApi(21) get() = activity.launcherApps

inline val Context.layoutInflater: LayoutInflater get() = LayoutInflater.from(this)

inline val Context.locationManager: LocationManager get() = getSystemService(Context.LOCATION_SERVICE) as LocationManager

inline val Fragment.locationManager: LocationManager get() = activity.locationManager

inline val Context.mediaProjectionManager: MediaProjectionManager @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager

inline val Fragment.mediaProjectionManager: MediaProjectionManager @TargetApi(21) @RequiresApi(21) get() = activity.mediaProjectionManager

inline val Context.mediaRouter: MediaRouter @TargetApi(16) @RequiresApi(16) get() = getSystemService(Context.MEDIA_ROUTER_SERVICE) as MediaRouter

inline val Fragment.mediaRouter: MediaRouter @TargetApi(16) @RequiresApi(16) get() = activity.mediaRouter

inline val Context.mediaSessionManager: MediaSessionManager @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.MEDIA_SESSION_SERVICE) as MediaSessionManager

inline val Fragment.mediaSessionManager: MediaSessionManager @TargetApi(21) @RequiresApi(21) get() = activity.mediaSessionManager

inline val Context.midiManager: MidiManager @TargetApi(23) @RequiresApi(23) get() = getSystemService(Context.MIDI_SERVICE) as MidiManager

inline val Fragment.midiManager: MidiManager @TargetApi(23) @RequiresApi(23) get() = activity.midiManager

inline val Context.networkStatsManager: NetworkStatsManager @TargetApi(23) @RequiresApi(23) get() = getSystemService(Context.NETWORK_STATS_SERVICE) as NetworkStatsManager

inline val Fragment.networkStatsManager: NetworkStatsManager @TargetApi(23) @RequiresApi(23) get() = activity.networkStatsManager

inline val Context.nfcManager: NfcManager get() = getSystemService(Context.NFC_SERVICE) as NfcManager

inline val Fragment.nfcManager: NfcManager get() = activity.nfcManager

inline val Context.notificationManager: NotificationManager get() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

inline val Fragment.notificationManager: NotificationManager get() = activity.notificationManager

inline val Context.nsdManager: NsdManager @TargetApi(16) @RequiresApi(16) get() = getSystemService(Context.NSD_SERVICE) as NsdManager

inline val Fragment.nsdManager: NsdManager @TargetApi(16) @RequiresApi(16) get() = activity.nsdManager

inline val Context.powerManager: PowerManager get() = getSystemService(Context.POWER_SERVICE) as PowerManager

inline val Fragment.powerManager: PowerManager get() = activity.powerManager

inline val Context.printManager: PrintManager @TargetApi(19) @RequiresApi(19) get() = getSystemService(Context.PRINT_SERVICE) as PrintManager

inline val Fragment.printManager: PrintManager @TargetApi(19) @RequiresApi(19) get() = activity.printManager

inline val Context.restrictionsManager: RestrictionsManager @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.RESTRICTIONS_SERVICE) as RestrictionsManager

inline val Fragment.restrictionsManager: RestrictionsManager @TargetApi(21) @RequiresApi(21) get() = activity.restrictionsManager

inline val Context.searchManager: SearchManager get() = getSystemService(Context.SEARCH_SERVICE) as SearchManager

inline val Fragment.searchManager: SearchManager get() = activity.searchManager

inline val Context.sensorManager: SensorManager get() = getSystemService(Context.SENSOR_SERVICE) as SensorManager

inline val Fragment.sensorManager: SensorManager get() = activity.sensorManager

inline val Context.storageManager: StorageManager get() = getSystemService(Context.STORAGE_SERVICE) as StorageManager

inline val Fragment.storageManager: StorageManager get() = activity.storageManager

inline val Context.subscriptionManager: SubscriptionManager @TargetApi(22) @RequiresApi(22) get() = getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE) as SubscriptionManager

inline val Fragment.subscriptionManager: SubscriptionManager @TargetApi(22) @RequiresApi(22) get() = activity.subscriptionManager

inline val Context.telecomManager: TelecomManager @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.TELECOM_SERVICE) as TelecomManager

inline val Fragment.telecomManager: TelecomManager @TargetApi(21) @RequiresApi(21) get() = activity.telecomManager

inline val Context.telephonyManager: TelephonyManager get() = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

inline val Fragment.telephonyManager: TelephonyManager get() = activity.telephonyManager

inline val Context.textServicesManager: TextServicesManager get() = getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE) as TextServicesManager

inline val Fragment.textServicesManager: TextServicesManager get() = activity.textServicesManager

inline val Context.tvInputManager: TvInputManager @TargetApi(21) @RequiresApi(21) get() = getSystemService(Context.TV_INPUT_SERVICE) as TvInputManager

inline val Fragment.tvInputManager: TvInputManager @TargetApi(21) @RequiresApi(21) get() = activity.tvInputManager

inline val Context.uiModeManager: UiModeManager get() = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager

inline val Fragment.uiModeManager: UiModeManager get() = activity.uiModeManager

inline val Context.usageStatsManager: UsageStatsManager @TargetApi(22) @RequiresApi(22) get() = getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager

inline val Fragment.usageStatsManager: UsageStatsManager @TargetApi(22) @RequiresApi(22) get() = activity.usageStatsManager

inline val Context.usbManager: UsbManager get() = getSystemService(Context.USB_SERVICE) as UsbManager

inline val Fragment.usbManager: UsbManager get() = activity.usbManager

inline val Context.userManager: UserManager @TargetApi(17) @RequiresApi(17) get() = getSystemService(Context.USER_SERVICE) as UserManager

inline val Fragment.userManager: UserManager @TargetApi(17) @RequiresApi(17) get() = activity.userManager

inline val Context.vibrator: Vibrator get() = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

inline val Fragment.vibrator: Vibrator get() = activity.vibrator

inline val Context.wallpaperManager: WallpaperManager get() = getSystemService(Context.WALLPAPER_SERVICE) as WallpaperManager

inline val Fragment.wallpaperManager: WallpaperManager get() = activity.wallpaperManager

inline val Context.wifiManager: WifiManager get() = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager

inline val Fragment.wifiManager: WifiManager get() = activity.wifiManager

inline val Context.wifiP2pManager: WifiP2pManager get() = getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager

inline val Fragment.wifiP2pManager: WifiP2pManager get() = activity.wifiP2pManager

inline val Context.windowManager: WindowManager get() = getSystemService(Context.WINDOW_SERVICE) as WindowManager

inline val Fragment.windowManager: WindowManager get() = activity.windowManager