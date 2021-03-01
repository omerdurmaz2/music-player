package com.musicplayer.android

import android.content.Context
import androidx.fragment.app.FragmentActivity
import com.musicplayer.android.navigator.AppNavigator
import com.musicplayer.android.navigator.AppNavigatorImpl

class ServiceLocator(applicationContext: Context) {


    fun provideNavigator(activity: FragmentActivity): AppNavigator {
        return AppNavigatorImpl(activity)
    }
}