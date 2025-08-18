android {
    // ... بقیه تنظیمات

    defaultConfig {
        // اگر اینها رو داری، مشکلی نیست
        // buildConfigField("String", "BUILD_TIME_UTC", "\"${System.getenv("BUILD_TIME_UTC") ?: "unknown"}\"")
        // buildConfigField("String", "GIT_SHA", "\"${System.getenv("GITHUB_SHA") ?: "local"}\"")
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true   // ← این خط مهمه
    }
}
