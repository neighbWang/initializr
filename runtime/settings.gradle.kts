pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    includeBuild("../buildEnv")
}

includeBuild("../core")