package com.twaun95.boilerplatemvvmkoin.presentation.ui.a

import com.twaun95.boilerplatemvvmkoin.R
import com.twaun95.boilerplatemvvmkoin.databinding.FragmentABinding
import com.twaun95.boilerplatemvvmkoin.presentation.ui.main.MainActivityViewModel
import com.twaun95.core.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AFragment : BaseFragment<FragmentABinding, AFragmentViewModel, MainActivityViewModel>(R.layout.fragment_a) {
    override val fragmentVM: AFragmentViewModel by viewModel()
    override val activityVM: MainActivityViewModel by sharedViewModel()

    override fun initView() {
        super.initView()

        binding.fragmentVM = fragmentVM
        binding.textViewName.text = activityVM.getName()
    }

    override fun setObserver() {
        super.setObserver()
    }

    override fun setEvent() {
        super.setEvent()
    }

    companion object {
        fun getInstance() : AFragment = AFragment()
    }
}