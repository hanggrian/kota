import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.plugin.use.PluginDependenciesSpec

const val bintrayUser = "hendraanggrian"
const val bintrayGroup = "com.hendraanggrian"
const val bintrayArtifact = "kota"
const val bintrayPublish = "0.22"
const val bintrayDesc = "Minimalist Android development"
const val bintrayWeb = "https://github.com/hendraanggrian/kota"

const val minSdk = 14
const val targetSdk = 27
const val buildTools = "27.0.2"

const val androidVersion = "3.0.1"
const val kotlinVersion = "1.2.10"
const val dokkaVersion = "0.9.15"
const val bintrayReleaseVersion = "0.8.0"

const val supportVersion = "27.0.2"
const val runnerVersion = "1.0.1"
const val espressoVersion = "3.0.1"
const val junitVersion = "4.12"

fun DependencyHandler.android(version: String) = "com.android.tools.build:gradle:$version"
fun PluginDependenciesSpec.android(module: String) = id("com.android.$module")

fun DependencyHandler.dokka(module: String? = null, version: String) = "org.jetbrains.dokka:${if (module != null) "dokka-$module" else "dokka"}-gradle-plugin:$version"
fun PluginDependenciesSpec.dokka(module: String? = null) = id("org.jetbrains.${if (module != null) "dokka-$module" else "dokka"}")

fun DependencyHandler.bintrayRelease(version: String) = "com.novoda:bintray-release:$version"
fun PluginDependenciesSpec.bintrayRelease() = id("com.novoda.bintray-release")

fun DependencyHandler.support(module: String, version: String, vararg suffixes: String) = "${StringBuilder("com.android.support").apply { suffixes.forEach { append(".$it") } }}:$module:$version"
fun DependencyHandler.junit(version: String) = "junit:junit:$version"