import java.io.BufferedReader
import java.io.InputStreamReader

plugins {
    `java-library`
}

val junitVersion = "4.13.2"

repositories {
    mavenCentral()
}

group = "uk.co.mainwave.mimetypes"
version = getVersionFromGit()

java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
    testImplementation("junit:junit:$junitVersion")
}

fun getVersionFromGit(): String {
    val processBuilder = ProcessBuilder(listOf("git", "describe", "--tags", "--always"))
    try {
        val process = processBuilder.start()
        val reader = BufferedReader(InputStreamReader(process.inputStream))
        val output = StringBuilder()
        output.append(reader.readLine())
        process.waitFor()
        return output.toString()
    } catch (e: Exception) {
        return "1.0.0"
    }
}
