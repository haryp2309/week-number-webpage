plugins {
    kotlin("js") version "1.6.10"
}

group = "me.harypirajan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.240-kotlin-1.5.30")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.240-kotlin-1.5.30")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.3-pre.264-kotlin-1.5.31")
    implementation(npm("styled-components", "5.3.3"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}