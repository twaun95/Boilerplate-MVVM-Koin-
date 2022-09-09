package com.twaun95.boilerplatemvvmkoin.presentation.ui.main

import androidx.lifecycle.MutableLiveData
import com.twaun95.boilerplatemvvmkoin.data.remote.MyRepository
import com.twaun95.core.base.BaseViewModel

class MainActivityViewModel(
    private val myRepository: MyRepository
) : BaseViewModel() {

    fun getName() : String {
        return myRepository.name
    }

}