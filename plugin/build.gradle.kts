plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

group = "io.johnsonlee.initializr"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${embeddedKotlinVersion}")
    implementation("io.johnsonlee:sonatype-publish-plugin:1.6.2")
}
