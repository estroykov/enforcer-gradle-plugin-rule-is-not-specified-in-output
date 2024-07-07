import org.kordamp.gradle.plugin.enforcer.api.ProjectEnforcerExtension

plugins {
    id("org.kordamp.gradle.project-enforcer") version "0.13.0"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

enforce {
    rule(enforcer.rules.AlwaysFail::class.java) {
        message = "Always fails"
        enabled = true
    }
}
