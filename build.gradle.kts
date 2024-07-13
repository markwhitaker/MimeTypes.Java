plugins {
    `java-library`
}

val junitVersion = "4.13.2"

repositories {
    mavenCentral()
}

group = "uk.co.mainwave.mimetypes"
version = getGitVersion()

java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
    testImplementation("junit:junit:$junitVersion")
}

fun getGitVersion(): String {
    try {
        val process = ProcessBuilder("git", "describe", "--tags", "--always").start()
        val output = process.inputStream.bufferedReader().readLine()
        process.waitFor()
        return output
    } catch (e: Exception) {
        return "1.0.0"
    }
}
