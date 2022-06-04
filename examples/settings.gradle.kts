pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
    includeBuild("../buildEnv")
    includeBuild("../plugin")
}

includeBuild("../core")
includeBuild("../runtime")

include(":app")

