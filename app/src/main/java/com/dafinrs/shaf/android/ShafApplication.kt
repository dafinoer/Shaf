package com.dafinrs.shaf.android

import android.app.Application
import com.dafinrs.shaf.android.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ShafApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@ShafApplication)
            modules(appModules)
        }
    }
}