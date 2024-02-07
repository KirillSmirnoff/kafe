plugins {
    java
    id("org.springframework.boot") version "2.5.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

group = "ru.corp.kafe"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation ("org.xerial:sqlite-jdbc:3.42.0.0")
    implementation ("org.komamitsu:spring-data-sqlite:1.0.0")

}

tasks.withType<Test> {
    useJUnitPlatform()
}
