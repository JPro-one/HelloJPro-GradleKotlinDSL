buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()

        maven {
            url = uri("https://sandec.jfrog.io/artifactory/repo")
        }
    }

    dependencies {
        classpath("one.jpro:jpro-gradle-plugin:2023.1.0")
    }
}

rootProject.name = "HelloJPro-Gradle-KotlinDSL"
