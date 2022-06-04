pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    includeBuild("../buildEnv")
}

includeBuild("../compiler")