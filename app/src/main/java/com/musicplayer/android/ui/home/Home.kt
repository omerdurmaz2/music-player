package com.musicplayer.android.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.musicplayer.android.R
import com.musicplayer.android.base.BaseFragment
import com.musicplayer.android.databinding.HomeFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Home : BaseFragment<HomeFragmentBinding>() {


    override val layoutRes: Int
        get() = R.layout.home_fragment

    private val viewModel: HomeViewModel by viewModels()

    companion object {

        private val instance: Home = Home()
        fun getInstance(): Home {
            return instance
        }

    }


    override fun initView() {
        super.initView()
        mBinding.get()?.viewModel = viewModel
    }


}