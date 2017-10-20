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
import android.support.v7.app.AppCompatDialog
import android.telecom.TelecomManager
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager

inline val AppCompatDialog.accessibilityManager: AccessibilityManager? get() = context.accessibilityManager

inline val AppCompatDialog.accountManager: AccountManager? get() = context.accountManager

inline val AppCompatDialog.activityManager: ActivityManager? get() = context.activityManager

inline val AppCompatDialog.alarmManager: AlarmManager? get() = context.alarmManager

inline val AppCompatDialog.appOpsManager: AppOpsManager? @RequiresApi(19) get() = context.appOpsManager

inline val AppCompatDialog.appWidgetManager: AppWidgetManager? @RequiresApi(21) get() = context.appWidgetManager

inline val AppCompatDialog.audioManager: AudioManager? get() = context.audioManager

inline val AppCompatDialog.batteryManager: BatteryManager? @RequiresApi(21) get() = context.batteryManager

inline val AppCompatDialog.bluetoothManager: BluetoothManager? @RequiresApi(18) get() = context.bluetoothManager

inline val AppCompatDialog.clipboardManager: ClipboardManager? get() = context.clipboardManager

inline val AppCompatDialog.connectivityManager: ConnectivityManager? get() = context.connectivityManager

inline val AppCompatDialog.consumerIrManager: ConsumerIrManager? @RequiresApi(19) get() = context.consumerIrManager

inline val AppCompatDialog.devicePolicyManager: DevicePolicyManager? get() = context.devicePolicyManager

inline val AppCompatDialog.displayManager: DisplayManager? @RequiresApi(17) get() = context.displayManager

inline val AppCompatDialog.downloadManager: DownloadManager? get() = context.downloadManager

inline val AppCompatDialog.dropBoxManager: DropBoxManager? get() = context.dropBoxManager

inline val AppCompatDialog.fingerprintManager: FingerprintManager? @RequiresApi(23) get() = context.fingerprintManager

inline val AppCompatDialog.inputMethodManager: InputMethodManager? get() = context.inputMethodManager

inline val AppCompatDialog.inputManager: InputManager? @RequiresApi(16) get() = context.inputManager

inline val AppCompatDialog.jobScheduler: JobScheduler? @RequiresApi(21) get() = context.jobScheduler

inline val AppCompatDialog.keyguardManager: KeyguardManager? get() = context.keyguardManager

inline val AppCompatDialog.launcherApps: LauncherApps? @RequiresApi(21) get() = context.launcherApps

inline val AppCompatDialog.locationManager: LocationManager? get() = context.locationManager

inline val AppCompatDialog.mediaProjectionManager: MediaProjectionManager? @RequiresApi(21) get() = context.mediaProjectionManager

inline val AppCompatDialog.mediaRouter: MediaRouter? @RequiresApi(16) get() = context.mediaRouter

inline val AppCompatDialog.mediaSessionManager: MediaSessionManager? @RequiresApi(21) get() = context.mediaSessionManager

inline val AppCompatDialog.midiManager: MidiManager? @RequiresApi(23) get() = context.midiManager

inline val AppCompatDialog.networkStatsManager: NetworkStatsManager? @RequiresApi(23) get() = context.networkStatsManager

inline val AppCompatDialog.nfcManager: NfcManager? get() = context.nfcManager

inline val AppCompatDialog.notificationManager: NotificationManager? get() = context.notificationManager

inline val AppCompatDialog.nsdManager: NsdManager? @RequiresApi(16) get() = context.nsdManager

inline val AppCompatDialog.powerManager: PowerManager? get() = context.powerManager

inline val AppCompatDialog.printManager: PrintManager? @RequiresApi(19) get() = context.printManager

inline val AppCompatDialog.restrictionsManager: RestrictionsManager? @RequiresApi(21) get() = context.restrictionsManager

inline val AppCompatDialog.searchManager: SearchManager? get() = context.searchManager

inline val AppCompatDialog.sensorManager: SensorManager? get() = context.sensorManager

inline val AppCompatDialog.storageManager: StorageManager? get() = context.storageManager

inline val AppCompatDialog.subscriptionManager: SubscriptionManager? @RequiresApi(22) get() = context.subscriptionManager

inline val AppCompatDialog.telecomManager: TelecomManager? @RequiresApi(21) get() = context.telecomManager

inline val AppCompatDialog.telephonyManager: TelephonyManager? get() = context.telephonyManager

inline val AppCompatDialog.textServicesManager: TextServicesManager? get() = context.textServicesManager

inline val AppCompatDialog.tvInputManager: TvInputManager? @RequiresApi(21) get() = context.tvInputManager

inline val AppCompatDialog.uiModeManager: UiModeManager? get() = context.uiModeManager

inline val AppCompatDialog.usageStatsManager: UsageStatsManager? @RequiresApi(22) get() = context.usageStatsManager

inline val AppCompatDialog.usbManager: UsbManager? get() = context.usbManager

inline val AppCompatDialog.userManager: UserManager? @RequiresApi(17) get() = context.userManager

inline val AppCompatDialog.vibrator: Vibrator? get() = context.vibrator

inline val AppCompatDialog.wallpaperManager: WallpaperManager? get() = context.wallpaperManager

inline val AppCompatDialog.wifiManager: WifiManager? get() = context.wifiManager

inline val AppCompatDialog.wifiP2pManager: WifiP2pManager? get() = context.wifiP2pManager

inline val AppCompatDialog.windowManager: WindowManager? get() = context.windowManager