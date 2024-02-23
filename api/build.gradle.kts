plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("com.google.devtools.ksp")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlin_version"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.retrofit2:converter-moshi:${rootProject.extra["retrofit_version"]}")
    implementation("com.squareup.moshi:moshi:${rootProject.extra["moshi_version"]}")

    ksp("com.squareup.moshi:moshi-kotlin-codegen:${rootProject.extra["moshi_version"]}")

    api("com.squareup.retrofit2:retrofit:${rootProject.extra["retrofit_version"]}")

    // test
    testImplementation("junit:junit:4.13.2")
}