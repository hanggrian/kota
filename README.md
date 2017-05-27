support-utils
=============
Sets of utility classes for Android, grouped in android packaging format.
#### [See wiki][wiki-content]

content
-------
* Configurations
  * `getScreenSize()`
  * `isScreenSizeAtLeast(Context/Resources/Configuration, int)`
  * `isScreenLong(Context/Resources/Configuration)`
  * `isScreenRound(Context/Resources/Configuration)`
  * `isRtl(Context/Resources/Configuration)`
  * `hasTouchscreen(Context/Resources/Configuration)`
  * `hasKeyboard(Context/Resources/Configuration)`
  * `isKeyboardHidden(Context/Resources/Configuration)`
  * `isHardKeyboardHidden(Context/Resources/Configuration)`
  * `hasNavigation(Context/Resources/Configuration)`
  * `isNavigationHidden(Context/Resources/Configuration)`
  * `isLandscape(Context/Resources/Configuration)`
  * `getTypeMode(Context/Resources/Configuration)`
  * `getNightMode(Context/Resources/Configuration)`
  * `isNightMode(Context/Resources/Configuration)`
* MimeTypes
  * `guessUri(Context, Uri)`
  * `guessUrl(String)`
  * `guessExtension(String)`
* Resources2
  * `toPx(int/long/double/float/Number)`
  * `toDp(int/long/double/float/Number)`
* Themes
  * `getText(Context/Theme, int)`
  * `getString(Context/Theme, int)`
  * `getBoolean(Context/Theme, int)`
  * `getInt(Context/Theme, int)`
  * `getFloat(Context/Theme, int)`
  * `getColor(Context/Theme, int)`
  * `getColorStateList(Context/Theme, int)`
  * `getDimension(Context/Theme, int)`
  * `getDimensionPixelOffset(Context/Theme, int)`
  * `getDimensionPixelSize(Context/Theme, int)`
  * `getDrawable(Context/Theme, int)`
  * `getTextArray(Context/Theme, int)`

graphics
-------
* Drawables
  * `fromBitmap(Resources, Bitmap)`
  * `fromColor(int)`
  * `fromColorRes(Context, int)`
  * `fromColorAttr(Context, int)`
  * `toBitmap(Drawable)`

util
----
* Logs
  * `setMaxLength(int)`
  * `v(String, String, Object...)`
  * `d(String, String, Object...)`
  * `i(String, String, Object...)`
  * `w(String, String, Object...)`
  * `wtf(String, String, Object...)`
  
View
----
* InputMethods
  * `showSoftInput(Activity)`
  * `showSoftInput(View)`
  * `hideSoftInput(Activity)`
  * `hideSoftInput(View)`
* ViewGroups
  * `containsView(ViewGroup, View)`
  * `containsViews(ViewGroup, View...)`
  * `addView(ViewGroup, Class<View>, int, int)`
  * `addViews(ViewGroup, View...)`
  * `removeViews(ViewGroup, View...)`
* Views
  * `newInstance(Class<View>, Context)`
  * `setVisibility(View, int/boolean)`

Download
--------
```gradle
repositories {
    jcenter()
}

dependencies {
    compile 'com.hendraanggrian:support-utils:0.7'
}
```

License
-------
    Copyright 2017 Hendra Anggrian

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
[wiki-content]: https://github.com/HendraAnggrian/support-utils/wiki/Content
[wiki-text]: https://github.com/HendraAnggrian/support-utils/wiki/Text
[wiki-util]: https://github.com/HendraAnggrian/support-utils/wiki/Util
[wiki-view]: https://github.com/HendraAnggrian/support-utils/wiki/View
