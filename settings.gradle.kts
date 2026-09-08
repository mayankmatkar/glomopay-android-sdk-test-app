pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "glomopay-android-sdk-test-app"
include(":app")
include(":glomo-android-sdk")

// Use the sibling SDK source while developing and testing the wrapper locally.
project(":glomo-android-sdk").projectDir = file("../glomopay-android-sdk/glomo-android-sdk")
