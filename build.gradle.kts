import io.izzel.taboolib.gradle.*

plugins {
    `java-library`
    `maven-publish`
    kotlin("jvm") version "2.0.0"
    id("io.izzel.taboolib") version "2.0.13"
}

group = "me.axiumyu"
version = "1.0"

repositories {
    mavenLocal()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
    maven("https://maven.aliyun.com/repository/public")
    maven("https://repo.tabooproject.org/repository/releases/")
    mavenCentral()
}

dependencies {
    implementation("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")
}

taboolib {
    version { taboolib = "6.1.2-beta10" }
    env {
        install(BUKKIT,AI)
    }
}
publishing {
    repositories {
        maven {
            url = uri("https://repo.tabooproject.org/repository/releases")
            credentials {
                username = project.findProperty("taboolibUsername").toString()
                password = project.findProperty("taboolibPassword").toString()
            }
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
    publications {
        create<MavenPublication>("library") {
            from(components["java"])
            groupId = project.group.toString()
        }
    }
}