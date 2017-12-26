import org.gradle.kotlin.dsl.kotlin

plugins {
    android("library")
    kotlin("android")
    dokka("android")
    bintrayRelease()
}

android {
    compileSdkVersion(targetSdk)
    buildToolsVersion(buildTools)
    defaultConfig {
        minSdkVersion(minSdk)
        targetSdkVersion(targetSdk)
        versionName = bintrayPublish
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    sourceSets {
        getByName("main") {
            manifest.srcFile("AndroidManifest.xml")
            java.srcDirs("src")
        }
    }
}

dependencies {
    compile(kotlin("stdlib", kotlinVersion))
    provided(support("recyclerview-v7", supportVersion))
    provided(support("support-fragment", supportVersion))
    compile(project(":kota"))
}

publish {
    userOrg = bintrayUser
    groupId = bintrayGroup
    artifactId = "$bintrayArtifact-recyclerview-v7"
    publishVersion = bintrayPublish
    desc = bintrayDesc
    website = bintrayWeb
}
