package com.twaun95.boilerplatemvvmkoin.presentation.ui.a

import androidx.lifecycle.MutableLiveData
import com.twaun95.core.base.BaseViewModel

class AFragmentViewModel : BaseViewModel() {

    val age = MutableLiveData<String>("28살")
}