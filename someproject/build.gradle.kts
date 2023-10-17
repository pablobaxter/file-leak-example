import java.util.Properties

plugins {
    kotlin("jvm")
}

val customProps = Properties().apply {
    load(project.rootProject.file("mycustom.properties").inputStream())
}

afterEvaluate {
    println("SOME_VALUE=${customProps["SOME_VALUE"]}")
}
