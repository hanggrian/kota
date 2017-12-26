import org.gradle.kotlin.dsl.kotlin

plugins {
    android("application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(targetSdk)
    buildToolsVersion(buildTools)
    defaultConfig {
        applicationId = "com.example.kota"
        versionCode = 1
        versionName = "1.0"
        minSdkVersion(minSdk)
        targetSdkVersion(targetSdk)
    }
    sourceSets {
        getByName("main") {
            manifest.srcFile("AndroidManifest.xml")
            java.srcDirs("src")
            assets.srcDir("assets")
            res.srcDir("res")
            resources.srcDir("src")
        }
    }
    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(support("design", supportVersion))
    implementation(support("preference-v14", supportVersion))

    implementation(kotlin("stdlib", kotlinVersion))

    implementation(project(":kota-support-v4"))
    implementation(project(":kota-appcompat-v7"))
    implementation(project(":kota-recyclerview-v7"))
    implementation(project(":kota-preference-v7"))
    implementation(project(":kota-design"))
}
