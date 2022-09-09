package com.twaun95.boilerplatemvvmkoin.di.modules

import com.twaun95.boilerplatemvvmkoin.data.remote.MyRepository
import com.twaun95.boilerplatemvvmkoin.di.KoinModule
import org.koin.core.module.Module
import org.koin.dsl.module

object DataModule : KoinModule {
    override val module: Module
        get() = module {
            single { MyRepository() }
        }
}