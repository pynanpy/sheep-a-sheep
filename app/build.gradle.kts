plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.pynanpy.sheepasheep"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.pynanpy.sheepasheep"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}