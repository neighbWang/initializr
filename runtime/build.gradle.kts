plugins {
    id("build-android-lib")
}

repositories {
    mavenCentral()
    google()
}

group = "io.johnsonlee.initializr"

dependencies {
    implementation("io.johnsonlee:once:1.0.0")
    implementation("io.johnsonlee.initializr:core")
}