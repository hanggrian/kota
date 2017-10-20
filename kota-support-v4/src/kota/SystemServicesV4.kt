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
import android.support.v4.app.Fragment
import android.telecom.TelecomManager
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager

inline val Fragment.accessibilityManager: AccessibilityManager? get() = context.accessibilityManager

inline val Fragment.accountManager: AccountManager? get() = context.accountManager

inline val Fragment.activityManager: ActivityManager? get() = context.activityManager

inline val Fragment.alarmManager: AlarmManager? get() = context.alarmManager

inline val Fragment.appOpsManager: AppOpsManager? @RequiresApi(19) get() = context.appOpsManager

inline val Fragment.appWidgetManager: AppWidgetManager? @RequiresApi(21) get() = context.appWidgetManager

inline val Fragment.audioManager: AudioManager? get() = context.audioManager

inline val Fragment.batteryManager: BatteryManager? @RequiresApi(21) get() = context.batteryManager

inline val Fragment.bluetoothManager: BluetoothManager? @RequiresApi(18) get() = context.bluetoothManager

inline val Fragment.clipboardManager: ClipboardManager? get() = context.clipboardManager

inline val Fragment.connectivityManager: ConnectivityManager? get() = context.connectivityManager

inline val Fragment.consumerIrManager: ConsumerIrManager? @RequiresApi(19) get() = context.consumerIrManager

inline val Fragment.devicePolicyManager: DevicePolicyManager? get() = context.devicePolicyManager

inline val Fragment.displayManager: DisplayManager? @RequiresApi(17) get() = context.displayManager

inline val Fragment.downloadManager: DownloadManager? get() = context.downloadManager

inline val Fragment.dropBoxManager: DropBoxManager? get() = context.dropBoxManager

inline val Fragment.fingerprintManager: FingerprintManager? @RequiresApi(23) get() = context.fingerprintManager

inline val Fragment.inputMethodManager: InputMethodManager? get() = context.inputMethodManager

inline val Fragment.inputManager: InputManager? @RequiresApi(16) get() = context.inputManager

inline val Fragment.jobScheduler: JobScheduler? @RequiresApi(21) get() = context.jobScheduler

inline val Fragment.keyguardManager: KeyguardManager? get() = context.keyguardManager

inline val Fragment.launcherApps: LauncherApps? @RequiresApi(21) get() = context.launcherApps

inline val Fragment.locationManager: LocationManager? get() = context.locationManager

inline val Fragment.mediaProjectionManager: MediaProjectionManager? @RequiresApi(21) get() = context.mediaProjectionManager

inline val Fragment.mediaRouter: MediaRouter? @RequiresApi(16) get() = context.mediaRouter

inline val Fragment.mediaSessionManager: MediaSessionManager? @RequiresApi(21) get() = context.mediaSessionManager

inline val Fragment.midiManager: MidiManager? @RequiresApi(23) get() = context.midiManager

inline val Fragment.networkStatsManager: NetworkStatsManager? @RequiresApi(23) get() = context.networkStatsManager

inline val Fragment.nfcManager: NfcManager? get() = context.nfcManager

inline val Fragment.notificationManager: NotificationManager? get() = context.notificationManager

inline val Fragment.nsdManager: NsdManager? @RequiresApi(16) get() = context.nsdManager

inline val Fragment.powerManager: PowerManager? get() = context.powerManager

inline val Fragment.printManager: PrintManager? @RequiresApi(19) get() = context.printManager

inline val Fragment.restrictionsManager: RestrictionsManager? @RequiresApi(21) get() = context.restrictionsManager

inline val Fragment.searchManager: SearchManager? get() = context.searchManager

inline val Fragment.sensorManager: SensorManager? get() = context.sensorManager

inline val Fragment.storageManager: StorageManager? get() = context.storageManager

inline val Fragment.subscriptionManager: SubscriptionManager? @RequiresApi(22) get() = context.subscriptionManager

inline val Fragment.telecomManager: TelecomManager? @RequiresApi(21) get() = context.telecomManager

inline val Fragment.telephonyManager: TelephonyManager? get() = context.telephonyManager

inline val Fragment.textServicesManager: TextServicesManager? get() = context.textServicesManager

inline val Fragment.tvInputManager: TvInputManager? @RequiresApi(21) get() = context.tvInputManager

inline val Fragment.uiModeManager: UiModeManager? get() = context.uiModeManager

inline val Fragment.usageStatsManager: UsageStatsManager? @RequiresApi(22) get() = context.usageStatsManager

inline val Fragment.usbManager: UsbManager? get() = context.usbManager

inline val Fragment.userManager: UserManager? @RequiresApi(17) get() = context.userManager

inline val Fragment.vibrator: Vibrator? get() = context.vibrator

inline val Fragment.wallpaperManager: WallpaperManager? get() = context.wallpaperManager

inline val Fragment.wifiManager: WifiManager? get() = context.wifiManager

inline val Fragment.wifiP2pManager: WifiP2pManager? get() = context.wifiP2pManager

inline val Fragment.windowManager: WindowManager? get() = context.windowManager