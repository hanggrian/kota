@file:JvmName("SupportServices")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.kota

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
import android.service.wallpaper.WallpaperService
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.telecom.TelecomManager
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.inputmethod.InputMethodManager
import android.view.textservice.TextServicesManager

inline val Fragment.accessibilityManager: AccessibilityManager get() = context.accessibilityManager

inline val Fragment.accountManager: AccountManager get() = context.accountManager

inline val Fragment.activityManager: ActivityManager get() = context.activityManager

inline val Fragment.alarmManager: AlarmManager get() = context.alarmManager

inline val Fragment.appOpsManager: AppOpsManager @TargetApi(19) @RequiresApi(19) get() = context.appOpsManager

inline val Fragment.appWidgetManager: AppWidgetManager @TargetApi(21) @RequiresApi(21) get() = context.appWidgetManager

inline val Fragment.audioManager: AudioManager get() = context.audioManager

inline val Fragment.batteryManager: BatteryManager @TargetApi(21) @RequiresApi(21) get() = context.batteryManager

inline val Fragment.bluetoothManager: BluetoothManager @TargetApi(18) @RequiresApi(18) get() = context.bluetoothManager

inline val Fragment.clipboardManager: ClipboardManager get() = context.clipboardManager

inline val Fragment.connectivityManager: ConnectivityManager get() = context.connectivityManager

inline val Fragment.consumerIrManager: ConsumerIrManager @TargetApi(19) @RequiresApi(19) get() = context.consumerIrManager

inline val Fragment.devicePolicyManager: DevicePolicyManager get() = context.devicePolicyManager

inline val Fragment.displayManager: DisplayManager @TargetApi(17) @RequiresApi(17) get() = context.displayManager

inline val Fragment.downloadManager: DownloadManager get() = context.downloadManager

inline val Fragment.dropBoxManager: DropBoxManager get() = context.dropBoxManager

inline val Fragment.fingerprintManager: FingerprintManager @TargetApi(23) @RequiresApi(23) get() = context.fingerprintManager

inline val Fragment.inputMethodManager: InputMethodManager get() = context.inputMethodManager

inline val Fragment.inputManager: InputManager @TargetApi(16) @RequiresApi(16) get() = context.inputManager

inline val Fragment.jobScheduler: JobScheduler @TargetApi(21) @RequiresApi(21) get() = context.jobScheduler

inline val Fragment.keyguardManager: KeyguardManager get() = context.keyguardManager

inline val Fragment.launcherApps: LauncherApps @TargetApi(21) @RequiresApi(21) get() = context.launcherApps

inline val Fragment.locationManager: LocationManager get() = context.locationManager

inline val Fragment.mediaProjectionManager: MediaProjectionManager @TargetApi(21) @RequiresApi(21) get() = context.mediaProjectionManager

inline val Fragment.mediaRouter: MediaRouter @TargetApi(16) @RequiresApi(16) get() = context.mediaRouter

inline val Fragment.mediaSessionManager: MediaSessionManager @TargetApi(21) @RequiresApi(21) get() = context.mediaSessionManager

inline val Fragment.midiManager: MidiManager @TargetApi(23) @RequiresApi(23) get() = context.midiManager

inline val Fragment.networkStatsManager: NetworkStatsManager @TargetApi(23) @RequiresApi(23) get() = context.networkStatsManager

inline val Fragment.nfcManager: NfcManager get() = context.nfcManager

inline val Fragment.notificationManager: NotificationManager get() = context.notificationManager

inline val Fragment.nsdManager: NsdManager @TargetApi(16) @RequiresApi(16) get() = context.nsdManager

inline val Fragment.powerManager: PowerManager get() = context.powerManager

inline val Fragment.printManager: PrintManager @TargetApi(19) @RequiresApi(19) get() = context.printManager

inline val Fragment.restrictionsManager: RestrictionsManager @TargetApi(21) @RequiresApi(21) get() = context.restrictionsManager

inline val Fragment.searchManager: SearchManager get() = context.searchManager

inline val Fragment.sensorManager: SensorManager get() = context.sensorManager

inline val Fragment.storageManager: StorageManager get() = context.storageManager

inline val Fragment.subscriptionManager: SubscriptionManager @TargetApi(22) @RequiresApi(22) get() = context.subscriptionManager

inline val Fragment.telecomManager: TelecomManager @TargetApi(21) @RequiresApi(21) get() = context.telecomManager

inline val Fragment.telephonyManager: TelephonyManager get() = context.telephonyManager

inline val Fragment.textServicesManager: TextServicesManager get() = context.textServicesManager

inline val Fragment.tvInputManager: TvInputManager @TargetApi(21) @RequiresApi(21) get() = context.tvInputManager

inline val Fragment.uiModeManager: UiModeManager get() = context.uiModeManager

inline val Fragment.usageStatsManager: UsageStatsManager @TargetApi(22) @RequiresApi(22) get() = context.usageStatsManager

inline val Fragment.usbManager: UsbManager get() = context.usbManager

inline val Fragment.userManager: UserManager @TargetApi(17) @RequiresApi(17) get() = context.userManager

inline val Fragment.vibrator: Vibrator get() = context.vibrator

inline val Fragment.wallpaperService: WallpaperService get() = context.wallpaperService

inline val Fragment.wifiManager: WifiManager get() = context.wifiManager

inline val Fragment.wifiP2pManager: WifiP2pManager get() = context.wifiP2pManager

inline val Fragment.windowManager: WindowManager get() = context.windowManager

inline fun Fragment.isServiceRunning(serviceClass: Class<*>): Boolean = context.isServiceRunning(serviceClass)

inline fun Fragment.isAllServicesRunning(vararg serviceClasses: Class<*>): Boolean = context.isAllServicesRunning(*serviceClasses)