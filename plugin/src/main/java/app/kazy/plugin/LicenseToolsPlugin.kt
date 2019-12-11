package app.kazy.plugin

import app.kazy.plugin.task.CheckLicenses
import app.kazy.plugin.task.GenerateLicensePage
import org.gradle.api.Plugin
import org.gradle.api.Project

class LicenseToolsPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create(
            LicenseToolsPluginExtension.NAME,
            LicenseToolsPluginExtension::class.java
        )
        CheckLicenses.register(project)
        GenerateLicensePage.register(project)
    }
}
