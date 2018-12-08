package com.jml.dagger.modules.conf

object Deps {

    object Tools {
        const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        const val gradle_plugin = "com.android.tools.build:gradle:${Versions.Config.GRADLE}"
        const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
    }


    object Dagger {

        const val dagger = "com.google.dagger:dagger:${Versions.DAGGER}"

    }

    object Android {
        const val appcompat = "androidx.appcompat:appcompat:1.0.2"
        const val constraing_layout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha2"
    }

    object Test {
        const val junit = "junit:junit:4.12"
        const val runner = "androidx.test:runner:1.1.1-alpha01"
        const val espresso_core = "androidx.test.espresso:espresso-core:3.1.1-alpha01"
    }
}

