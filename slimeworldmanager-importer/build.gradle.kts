plugins {
    application
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

application {
    mainClass.set("com.grinderwolf.swm.importer.SWMImporter")
}

dependencies {
    implementation(project(":slimeworldmanager-api"))
    implementation(project(":slimeworldmanager-nms-common"))
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("com.github.luben:zstd-jni:1.5.2-2")
    implementation("com.github.tomas-langer:chalk:1.0.2")
    implementation("com.flowpowered:flow-nbt:2.0.2")
}

tasks {
    assemble {
        dependsOn(shadowJar)
    }
}

description = "slimeworldmanager-importer"
