import org.gradle.kotlin.dsl.`kotlin-dsl`

repositories {
    mavenCentral()
    google()
}

plugins {
    `kotlin-dsl`
}


gradlePlugin {
    plugins {
        register("thanox-proj") {
            id = "thanox-proj"
            implementationClass = "tornaco.project.android.thanox.ThanoxProjectBuildPlugin"
        }
    }
}

dependencies {
    implementation("org.eclipse.jgit:org.eclipse.jgit:6.6.1.202309021850-r")
}