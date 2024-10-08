plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.tdahaprendo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tdahaprendo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {


    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    // BasedeDatos de Firebase
    implementation(platform("com.google.firebase:firebase-bom:32.5.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-database-ktx:20.3.0")

    implementation("com.google.firebase:firebase-auth:22.2.0")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.google.android.gms:play-services-auth:20.6.0")
    implementation("com.squareup.picasso:picasso:2.71828")

    // Guia Paterna

    implementation("androidx.appcompat:appcompat:1.0.0")
    implementation("com.google.android.material:material:1.0.0")


    // modulos para los cursos
    implementation ("com.intuit.sdp:sdp-android:1.1.0")
    implementation ("com.codesgood:justifiedtextview:1.1.0")

    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
    implementation("com.firebaseui:firebase-ui-database:8.0.2")


}