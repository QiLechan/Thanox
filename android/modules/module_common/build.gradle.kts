import tornaco.project.android.thanox.Configs
import tornaco.project.android.thanox.Libs
import tornaco.project.android.thanox.Tests

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    defaultConfig {
        vectorDrawables.useSupportLibrary = true
        minSdk = Configs.minSdkVersion
        compileSdk = Configs.compileSdkVersion
        targetSdk = Configs.targetSdkVersion
        testInstrumentationRunner = Configs.testRunner
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
        buildConfig = true
        aidl = true
        renderScript = false
        resValues = false
        shaders = false
        viewBinding = true
        dataBinding = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = tornaco.project.android.thanox.Compose.composeVersion
    }
}

dependencies {
    implementation(Libs.AndroidX.androidXCore)
    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.material)
    implementation(Libs.AndroidX.recyclerview)
    implementation(Libs.AndroidX.preference)
    implementation(Libs.AndroidX.constraint)
    implementation(Libs.AndroidX.interpolator)
    implementation(Libs.AndroidX.swipeRefreshLayout)
    implementation(Libs.AndroidX.lifeCycleRuntimeKtx)
    implementation(Libs.AndroidX.lifeCycleCommon)

    implementation(Libs.AndroidX.browser) {
        exclude(group = "com.google.guava", module = "listenablefuture")
    }

    implementation(Libs.Others.tinypinyin)

    implementation(Libs.Others.glide)
    annotationProcessor(Libs.Others.glideCompiler)
    kapt(Libs.Others.glideCompiler)

    api(Libs.AndroidX.lifeCycleRuntime)
    api(Libs.AndroidX.lifeCycleExt)
    annotationProcessor(Libs.AndroidX.lifeCycleCompiler)
    kapt(Libs.AndroidX.lifeCycleCompiler)

    implementation(tornaco.project.android.thanox.Compose.runtimeSaveAble)
    implementation(tornaco.project.android.thanox.Compose.ui)
    implementation(tornaco.project.android.thanox.Compose.runtime)
    implementation(tornaco.project.android.thanox.Compose.material)
    implementation(tornaco.project.android.thanox.Compose.material3)
    implementation(tornaco.project.android.thanox.Compose.material3Adapter)
    implementation(tornaco.project.android.thanox.Compose.activityCompose)
    implementation(tornaco.project.android.thanox.Compose.viewmodel)
    implementation(tornaco.project.android.thanox.Compose.navigationCompose)
    implementation(tornaco.project.android.thanox.Compose.hiltNavigation)
    implementation(tornaco.project.android.thanox.Compose.tooling)
    implementation(tornaco.project.android.thanox.Compose.toolingPreview)
    implementation(tornaco.project.android.thanox.Compose.composeMaterialIconsExtended)
    implementation(tornaco.project.android.thanox.Compose.landscapistGlide)

    implementation(Libs.Accompanist.appcompatTheme)
    implementation(Libs.Accompanist.systemUiController)
    implementation(Libs.Accompanist.pager)
    implementation(Libs.Accompanist.insets)
    implementation(Libs.Accompanist.swipeRefresh)
    implementation(Libs.Accompanist.insetsUi)

    implementation(Libs.Lottie.composeLottie)
    implementation(Libs.Lottie.lottie)
    implementation(Libs.Accompanist.pager)
    implementation(Libs.Accompanist.insets)

    implementation(tornaco.project.android.thanox.Compose.coil)

    implementation(Libs.Kotlin.stdlib)
    implementation(Libs.Coroutines.android)

    compileOnly(Libs.Others.xposedApi)

    api(project(":rhino:rhino_annotations"))

    implementation(project(":android_framework:base"))
    implementation(project(":third_party:recyclerview-fastscroll"))
    implementation(project(":third_party:search"))
    implementation(project(":third_party:dateformatter"))

    testImplementation(Tests.junit)
    androidTestImplementation(Tests.androidXRunner)
}