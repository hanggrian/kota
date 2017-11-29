import org.gradle.api.artifacts.dsl.DependencyHandler

const val bintrayUser = "hendraanggrian"
const val bintrayGroup = "com.hendraanggrian"
const val bintrayArtifact = "kota"
const val bintrayPublish = "0.20"
const val bintrayDesc = "Lightweight library full of Kotlin extension functions for Android"
const val bintrayWeb = "https://github.com/hendraanggrian/kota"

const val minSdk = 14
const val targetSdk = 27
const val buildTools = "27.0.1"

const val kotlinVersion = "1.1.61"
const val supportVersion = "27.0.1"
const val runnerVersion = "1.0.1"
const val espressoVersion = "3.0.1"
const val junitVersion = "4.12"

fun DependencyHandler.support(module: String, version: String, vararg groupSuffixes: String) = "${StringBuilder("com.android.support").apply { groupSuffixes.forEach { append(".$it") } }}:$module:$version"
fun DependencyHandler.junit(version: String) = "junit:junit:$version"