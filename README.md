kota
====
A lightweight library full of static functions for common practices in Android.
Inspired by [anko-commons], these static methods are based on [Kotlin extension functions].

Showcase
--------
Below are some usages of this library, head to wiki for full information (not yet available).

#### Collections
`SparseArray` are considered more memory-efficient `Map` for Android.
`kota.collections` provides familiar APIs to make `SparseArray` Kotlin-friendly.

```kotlin
// create new mutable sparse array
val array = sparseArrayOf(Pair(12, "Little"), Pair(34, "Piggy"))

// obtain non-null element with get operator
val element = array[12]

// iterate it
array.forEachIndexed { i, element ->
    // do some shit
}
```

#### Dialogs
`kota.dialogs` lets you create and show alerts and dialogs, often in one line.

```kotlin
// show a confirmation alert
alert("Are you sure?", "You have to be completely sure.", NoButton, YesButton {
    // do some shit
})

// choice alert with custom buttons
choiceAlert("Pick one", items, { dialog, index ->
    // index is selected
}, NeutralButton("Reset") {
    // neutral button is clicked
})

// progress dialog
indeterminateProgressDialog("Loading", "Please wait...")
```

#### Resources
`kota.resources` have consistent APIs in Activity, Fragment, and support Fragment.
Easily obtain any resources with the same syntax across your app.

```kotlin
// obtain array in Activity, Fragment, or support Fragment.
val array = getStringArray(R.array.some_array)

// checks device configurations
val myScreenSize = screenSize
val mAtLeastLarge = isScreenSizeAtLeast(SCREENLAYOUT_SIZE_LARGE)
val myKeyboard = hasKeyboard

// dp and sp conversion
val margin = 16.dp
val textSize = 18.sp
```

#### Text
`kota.text` is focused on text spanning and string utilities.

```kotlin
// create new spannable
val spannable = "I'm a little piggy".toSpannable()

// add some spans to it
spannable.span(Regex("I'm"), ForegroundColorSpan(Color.RED))
spannable.spanRange(5, 6, RelativeSizeSpan(18.sp))
spannable.spanAll(BackgroundColorSpan(Color.YELLOW))

// TextUtils.java
val isEmpty = spannable.isEmpty
```

#### Others
```kotlin
// display a toast
toast("I'm a little piggy")

// or snackbar
snackbar("Are you a little piggy", android.R.string.yes, { view ->
    // do some shit
})

// one-line fragment editor
fragmentManager.replace(R.id.container, myFragment)

// logging with component name as tag
debug("Little piggy just died")

// I hate Uri
val path = uri.getActualPath(context)
```

Download
--------
```gradle
repositories {
    google()
    jcenter()
}

dependencies {
    compile 'com.hendraanggrian:kota:0.19'
    
    compile 'com.android.support:support-v4:27.0.0'
    compile 'com.hendraanggrian:kota-support-v4:0.19'
    
    compile 'com.android.support:appcompat-v7:27.0.0'
    compile 'com.hendraanggrian:kota-appcompat-v7:0.19'
    
    compile 'com.android.support:recyclerview-v7:27.0.0'
    compile 'com.hendraanggrian:kota-recyclerview-v7:0.19'
    
    compile 'com.android.support:preference-v7:27.0.0'
    compile 'com.hendraanggrian:kota-preference-v7:0.19'
    
    compile 'com.android.support:design:27.0.0'
    compile 'com.hendraanggrian:kota-design:0.19'
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

[Kotlin extension functions]: https://kotlinlang.org/docs/reference/extensions.html
[anko-commons]: https://github.com/Kotlin/anko