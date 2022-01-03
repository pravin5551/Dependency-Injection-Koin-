package com.example.koindependancy

import android.app.Application
import android.util.Log.DEBUG
import com.example.koindependancy.BuildConfig.DEBUG
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.scope.BuildConfig.DEBUG
import org.koin.core.context.startKoin
import java.util.logging.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(org.koin.core.logger.Level.DEBUG)
            androidContext(this@App)
            modules(listOf(repositoryModule, viewModelModule, retrofitModule, apiModule))
        }
    }
}