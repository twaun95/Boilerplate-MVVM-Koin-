package com.twaun95.boilerplatemvvmkoin.di.modules

import com.twaun95.boilerplatemvvmkoin.di.KoinModule
import com.twaun95.boilerplatemvvmkoin.presentation.ui.a.AFragmentViewModel
import com.twaun95.boilerplatemvvmkoin.presentation.ui.main.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object ViewModelModule : KoinModule{
    override val module: Module
        get() = module {
            viewModel { MainActivityViewModel(get()) }
            viewModel { AFragmentViewModel() }
        }
}