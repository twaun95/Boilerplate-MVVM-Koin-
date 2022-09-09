package com.twaun95.boilerplatemvvmkoin

import android.app.Application
import com.twaun95.boilerplatemvvmkoin.di.modules.DataModule
import com.twaun95.boilerplatemvvmkoin.di.modules.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                ViewModelModule.module,
                DataModule.module
            )
        }
    }
}