plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(30)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    dependencies {
        implementation(kotlin("bom"))
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))
        implementation("androidx.appcompat:appcompat:1.3.1")
        implementation("androidx.fragment:fragment-ktx:1.3.6")
        implementation("androidx.lifecycle:lifecycle-common:2.3.1")
        implementation("androidx.constraintlayout:constraintlayout:2.1.1")
        implementation("androidx.tracing:tracing-ktx:1.0.0")
        implementation("androidx.annotation:annotation:1.0.0")

        testImplementation(kotlin("test"))
        testImplementation("junit:junit:4.13.2")
    }

}