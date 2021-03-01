package com.musicplayer.android.ui.library

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
import com.musicplayer.android.databinding.LibraryFragmentBinding
import com.musicplayer.android.ui.home.Home
import com.musicplayer.android.ui.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Library : BaseFragment<LibraryFragmentBinding>() {

    override val layoutRes: Int
        get() = R.layout.library_fragment


    private val viewModel: LibraryViewModel by viewModels()

    companion object {

        private val instance: Library = Library()
        fun getInstance(): Library {
            return instance
        }

    }


    override fun initView() {
        super.initView()
        mBinding.get()?.viewModel = viewModel
    }

}