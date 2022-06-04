rootProject.name = "initializr"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }

    includeBuild("buildEnv")
}

includeBuild("examples")
includeBuild("core")
includeBuild("compiler")
includeBuild("runtime")
includeBuild("plugin")
