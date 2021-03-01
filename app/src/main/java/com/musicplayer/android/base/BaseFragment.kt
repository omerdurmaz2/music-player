package com.musicplayer.android.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.musicplayer.android.util.AutoClearedValue
import com.musicplayer.android.util.ext.bindingInflate
import javax.inject.Inject

abstract class BaseFragment<VB : ViewDataBinding> : Fragment() {

    abstract val layoutRes: Int

    protected lateinit var mBinding: AutoClearedValue<VB>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = container?.bindingInflate<VB>(layoutRes)
        binding?.lifecycleOwner = this
        this.mBinding = AutoClearedValue(this, binding)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initClickListeners()
        initCheckedListeners()
        initFocusListeners()
    }

    protected open fun initView() {}

    protected open fun initClickListeners() {}

    protected open fun initCheckedListeners() {}

    protected open fun initFocusListeners() {}
}
