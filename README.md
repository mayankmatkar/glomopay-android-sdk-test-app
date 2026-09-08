# GlomoPay Android SDK Test App

Standalone Kotlin UI wrapper for manually testing the native GlomoPay Android SDK. It follows the same integration flow as the Flutter test app:

- Public key and Order ID / Subscription ID fields
- Automatic Standard/LRS checkout detection from the order API
- Developer mode toggle
- Native SDK checkout flow
- Payment result, SDK error, connection error, termination, and event logs

## Local SDK setup

The app links the sibling SDK source through `settings.gradle.kts`:

```text
../glomopay-android-sdk/glomopay-sdk
```

Keep both folders next to each other under the Flutter workspace. The wrapper does not need to be added to the SDK repository.

## Run

```bash
./gradlew :app:testDebugUnitTest
./gradlew :app:assembleDebug
```

Open this project in Android Studio and run the `app` configuration on an emulator or Android device.

## Future Maven Central testing

After the SDK is published, the local project dependency can be replaced with:

```kotlin
implementation("com.glomopay:glomopay-sdk:0.0.1")
```
