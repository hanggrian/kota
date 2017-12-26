import org.gradle.kotlin.dsl.kotlin

plugins {
    android("library")
    kotlin("android")
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
    provided(support("preference-v7", supportVersion))
    compile(project(":kota"))
}

publish {
    userOrg = bintrayUser
    groupId = bintrayGroup
    artifactId = "$bintrayArtifact-preference-v7"
    publishVersion = bintrayPublish
    desc = bintrayDesc
    website = bintrayWeb
}
