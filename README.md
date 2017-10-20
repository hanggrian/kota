kota
====
Kota aims to be an extension of [support-compat], a lightweight library full of static functions for common practices in Android.
Inspired by [anko-commons], these static methods are based on [Kotlin extension functions].

Consists of several packages:
* **app**: Activity and Service related operations. [see wiki][app]
* **content**: Resources, Uri, and others. [see wiki][content]
* **text**: perform complex text spanning, often done in single line. [see wiki][text]
* **view**: View, ViewGroup, and InputMethodManager. [see wiki][view]

Download
--------
```gradle
repositories {
    google()
    jcenter()
}

dependencies {
    compile 'com.hendraanggrian:kota:0.13'
    
    compile 'com.android.support:support-v4:26.1.0'
    compile 'com.hendraanggrian:kota-support-v4:0.13'
    
    compile 'com.android.support:appcompat-v7:26.1.0'
    compile 'com.hendraanggrian:kota-appcompat-v7:0.13'
    
    compile 'com.android.support:recyclerview-v7:26.1.0'
    compile 'com.hendraanggrian:kota-recyclerview-v7:0.13'
    
    compile 'com.android.support:preference-v7:26.1.0'
    compile 'com.hendraanggrian:kota-preference-v7:0.13'
    
    compile 'com.android.support:design:26.1.0'
    compile 'com.hendraanggrian:kota-design:0.13'
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
[app]: https://github.com/HendraAnggrian/kota/wiki/PackageApp
[content]: https://github.com/HendraAnggrian/kota/wiki/PackageContent
[text]: https://github.com/HendraAnggrian/kota/wiki/PackageText
[view]: https://github.com/HendraAnggrian/kota/wiki/PackageView