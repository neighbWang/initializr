plugins {
    id("build-android-app")
    id("initializr-gradle-plugin")
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("io.johnsonlee.initializr:core")
    implementation("io.johnsonlee.initializr:runtime")
    kapt("io.johnsonlee.initializr:compiler")
}