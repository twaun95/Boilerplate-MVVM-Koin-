package com.twaun95.boilerplatemvvmkoin.presentation.ui.main


import com.twaun95.boilerplatemvvmkoin.R
import com.twaun95.boilerplatemvvmkoin.databinding.ActivityMainBinding
import com.twaun95.boilerplatemvvmkoin.presentation.ui.a.AFragment
import com.twaun95.core.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(R.layout.activity_main) {
    override val viewModel: MainActivityViewModel by viewModel()

    override fun initView() {
        super.initView()
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout_main, AFragment.getInstance()).commit()
    }

    override fun setObserver() {
        super.setObserver()
    }

    override fun setEvent() {
        super.setEvent()
    }
}