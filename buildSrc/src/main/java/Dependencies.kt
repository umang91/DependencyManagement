/**
 * @author Umang Chamaria
 * Date: 2019-10-05
 */
object Versions {
    const val kotlin = "1.3.50"
    const val coroutine = "1.2.1"

    const val room = "2.1.0"
    const val appCompat = "1.1.0"
    const val material = "1.1.0-alpha10"
    const val cardView = "1.0.0"
    const val recyclerView = "1.0.0"

    const val timber = "4.7.1"

    const val junit = "4.12"
    const val junitExtension = "1.1.1"
    const val espressoCore = "3.2.0"
}

object Deps {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.appCompat}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"

    const val material = "com.google.android.material:material:${Versions.material}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object TestDeps{

    const val junit = "junit:junit:${Versions.junit}"
    const val junitExtension = "androidx.test.ext:junit:${Versions.junitExtension}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}