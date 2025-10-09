plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.google.gms.google-services") // FlutterFire / Firebase
    id("dev.flutter.flutter-gradle-plugin") // Flutter plugin
}

android {
    namespace = "com.example.snapbilling"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.snapbilling"
       minSdk = flutter.minSdkVersion
        targetSdk = 35
        versionCode = 1
        versionName = "1.2.1"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildTypes {
    getByName("debug") {
        isMinifyEnabled = false
        isShrinkResources = false  // Must be false if minifyEnabled is false
    }
}

    // Optional: specify NDK version manually
    ndkVersion = "25.1.8937393" // replace with your installed NDK version
}

flutter {
    source = "../.."
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
    
    // ✅ Update to 2.1.5 or newer
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")
    
    implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation("com.google.android.material:material:1.11.0")
    
    // Your other dependencies...
}