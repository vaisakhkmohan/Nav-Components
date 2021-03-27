# Nav-Components

build.gradle:app

    plugins {
    id 'kotlin-android-extensions'
    id 'androidx.navigation.safeargs.kotlin'
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.3'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.3'
    
build.gradle:project:
    
        def nav_version = "2.3.0-alpha04"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
