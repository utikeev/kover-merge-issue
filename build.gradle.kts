plugins {
    id("org.jetbrains.kotlinx.kover")
}

repositories {
    mavenCentral()
}

kover {
    merge {
        subprojects()
    }
    reports.total {
        binary {
            onCheck = true
            file = rootProject.layout.projectDirectory.file(".qodana/code-coverage/kover.ic")
        }
    }
}
