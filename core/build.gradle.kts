plugins {
    id("build-kotlin-library")
}

repositories {
    mavenCentral()
    google()
}

group = "io.johnsonlee.initializr"

dependencies {
    compileOnly("com.didiglobal.booster:booster-android-api:4.9.0")
}