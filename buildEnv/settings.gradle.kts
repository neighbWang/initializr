pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}

include(":dependencies")
include(":android-app")
include(":android-lib")
include(":kotlin-library")
includeBuild("../compiler")