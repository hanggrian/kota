import org.gradle.api.tasks.Delete
import org.gradle.kotlin.dsl.kotlin

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(android(androidVersion))
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath(dokka("android", dokkaVersion))
        classpath(bintrayRelease(bintrayReleaseVersion))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
    tasks.withType(Javadoc::class.java).all {
        isEnabled = false
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

/** QUICK UPLOAD
./gradlew :kota:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-support-v4:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-appcompat-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-cardview-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-gridlayout-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-preference-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
./gradlew :kota-recyclerview-v7:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=

./gradlew :kota-design:bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
 */