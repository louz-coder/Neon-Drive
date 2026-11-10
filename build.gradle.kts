plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android {
    namespace = "com.openroad.dashboard"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.openroad.dashboard"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
    buildFeatures { viewBinding = false }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("com.google.android.gms:play-services-location:21.3.0")
    implementation("org.maplibre.gl:android-sdk:11.8.0")
    implementation("androidx.car.app:app:1.7.0")
}
