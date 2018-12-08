package com.jml.dagger.modules.conf

object Deps {

    object Tools {
        val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        val gradle_plugin = "com.android.tools.build:gradle:${Versions.Config.GRADLE}"
    }

    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"


    object Android {
        const val appcompat = "androidx.appcompat:appcompat:1.0.2"
    }

    object Test {
        const val junit = "junit:junit:4.12"
        const val runner = "androidx.test:runner:1.1.1-alpha01"
        const val espresso_core = "androidx.test.espresso:espresso-core:3.1.1-alpha01"
    }
}

