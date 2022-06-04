rootProject.name = "plugin"
include(":compiler")
include(":core")


pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}