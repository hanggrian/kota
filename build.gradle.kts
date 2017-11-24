buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.novoda:bintray-release:0.7.0")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

/** QUICK LINT CHECK BEFORE UPLOAD

./gradlew :kota:clean :kota:build
./gradlew :kota:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-support-v4:clean :kota-support-v4:build
./gradlew :kota-support-v4:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-appcompat-v7:clean :kota-appcompat-v7:build
./gradlew :kota-appcompat-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-recyclerview-v7:clean :kota-recyclerview-v7:build
./gradlew :kota-recyclerview-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-preference-v7:clean :kota-preference-v7:build
./gradlew :kota-preference-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-design:clean :kota-design:build
./gradlew :kota-design:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

 */