package com.musicplayer.android.util.ext

import android.app.Activity
import android.content.Context
import android.view.*
import android.widget.ImageView
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.swiperefreshlayout.widget.CircularProgressDrawable

import com.google.android.material.tabs.TabLayout

fun ViewGroup.inflate(@LayoutRes resourceId: Int) =
    LayoutInflater.from(context).inflate(
        resourceId,
        this,
        false
    )

fun <T : ViewDataBinding?> ViewGroup.bindingInflate(@LayoutRes resourceId: Int) =
    DataBindingUtil.inflate<T>(
        LayoutInflater.from(context),
        resourceId,
        this,
        false
    )

fun androidx.viewpager.widget.ViewPager.addTabLayout(tabs: TabLayout) {
    this.addOnPageChangeListener(com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener(tabs))
    tabs.addOnTabSelectedListener(com.google.android.material.tabs.TabLayout.ViewPagerOnTabSelectedListener(this))
}

fun androidx.viewpager.widget.ViewPager.addOnPageSelectedListener(select: (position: Int) -> Unit) {
    this.addOnPageChangeListener(object : androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        }

        override fun onPageSelected(position: Int) {
            select(position)
        }
    })
}



fun placeholderProgressBar(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 8f
        centerRadius = 40f
        start()
    }
}

fun View.setVisible() {
    this.visibility = View.VISIBLE
}

fun View.setInvisible() {
    this.visibility = View.INVISIBLE
}

fun View.setGone() {
    this.visibility = View.GONE
}
