plugins {
    id("application")
    kotlin("jvm")
    id("com.squareup.wire")
}

wire {
    sourcePath {
        srcJar("com.squareup.wire:wire-reflector:4.9.1")
    }
    // Generate service interfaces only; the client comes with wire-reflector.
    kotlin {
        includes = listOf("grpc.reflection.v1alpha.ServerReflection")
        rpcRole = "server"
        rpcCallStyle = "blocking"
        singleMethodServices = true
    }
}

dependencies {
    implementation("com.squareup.wire:wire-reflector:4.9.1")
}
