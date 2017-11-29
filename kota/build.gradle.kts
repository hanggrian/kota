import org.gradle.kotlin.dsl.kotlin

plugins {
    id("com.android.library")
    kotlin("android")
    id("com.novoda.bintray-release")
}

android {
    compileSdkVersion(targetSdk)
    buildToolsVersion(buildTools)
    defaultConfig {
        minSdkVersion(minSdk)
        targetSdkVersion(targetSdk)
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    sourceSets {
        getByName("main") {
            manifest.srcFile("AndroidManifest.xml")
            java.srcDirs("src")
        }
        getByName("androidTest") {
            setRoot("tests")
            manifest.srcFile("tests/AndroidManifest.xml")
            java.srcDir("tests/src")
            res.srcDir("tests/res")
            resources.srcDir("tests/src")
        }
    }
    buildTypes {
        getByName("debug") {
            buildConfigField("int", "TRANSIT_TYPE_CUSTOM", 0.toString())
            buildConfigField("int", "TRANSIT_TYPE_CONSTANT", 1.toString())
            buildConfigField("int", "TRANSIT_TYPE_STYLE", 2.toString())
        }
        getByName("release") {
            buildConfigField("int", "TRANSIT_TYPE_CUSTOM", 0.toString())
            buildConfigField("int", "TRANSIT_TYPE_CONSTANT", 1.toString())
            buildConfigField("int", "TRANSIT_TYPE_STYLE", 2.toString())
        }
    }
}

dependencies {
    compile(kotlin("stdlib", kotlinVersion))
    compile(support("support-annotations", supportVersion))
    androidTestImplementation(support("design", supportVersion))
    androidTestImplementation(support("runner", runnerVersion, "test"))
    androidTestImplementation(support("espresso-core", espressoVersion, "test", "espresso"))
    testImplementation(junit(junitVersion))
}

publish {
    userOrg = bintrayUser
    groupId = bintrayGroup
    artifactId = bintrayArtifact
    publishVersion = bintrayPublish
    desc = bintrayDesc
    website = bintrayWeb
}
