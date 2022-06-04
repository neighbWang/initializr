plugins {
    id("build-kotlin-library")
}

repositories {
    mavenCentral()
    google()
}

group = "io.johnsonlee.initializr"

dependencies {
    kapt("com.google.auto.service:auto-service:1.0")
    implementation("com.google.auto.service:auto-service:1.0")

    implementation("io.johnsonlee.initializr:core")
    implementation("com.didiglobal.booster:booster-api:${deps.booster.version}")
    implementation("com.didiglobal.booster:booster-graph:${deps.booster.version}")
    implementation("com.didiglobal.booster:booster-transform-asm:${deps.booster.version}")
    implementation("io.johnsonlee.codegen:compiler:${deps.codegen.version}")
    implementation("io.johnsonlee.codegen:mustache:${deps.codegen.version}")
    implementation("com.github.spullara.mustache.java:compiler:0.9.10")
    implementation("androidx.annotation:annotation:1.0.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.0")
}