# TelBot (Android)

- Kotlin + ViewBinding
- Simple dashboard (Start / Stop / Settings) + device list
- Build info banner & toast (Version, Git SHA, Build Time UTC)

## Build locally
- Install JDK 17
- If you have Gradle:
  ```bash
  gradle wrapper --gradle-version 8.7
  ./gradlew assembleDebug
  ```
- APK: `app/build/outputs/apk/debug/app-debug.apk`

## GitHub Actions
Workflow path: `.github/workflows/android-ci.yml`
