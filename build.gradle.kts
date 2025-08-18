// Top-level build file. Plugins are declared via settings.gradle.kts (pluginManagement).

tasks.register("clean", Delete::class) {
    delete(layout.buildDirectory.asFile.get())
}
