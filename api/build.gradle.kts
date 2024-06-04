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
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlinVersion"]}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.retrofit2:converter-moshi:${rootProject.extra["retrofitVersion"]}")
    implementation("com.squareup.moshi:moshi:${rootProject.extra["moshiVersion"]}")

    ksp("com.squareup.moshi:moshi-kotlin-codegen:${rootProject.extra["moshiVersion"]}")

    api("com.squareup.retrofit2:retrofit:${rootProject.extra["retrofitVersion"]}")

    // test
    testImplementation("junit:junit:4.13.2")
}