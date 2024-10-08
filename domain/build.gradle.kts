plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("io.insert-koin:koin-core:3.5.6")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
}