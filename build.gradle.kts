tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}

plugins {
    kotlin("jvm") version "1.9.10" apply false
    id("com.squareup.wire") version "4.9.1" apply false
}
