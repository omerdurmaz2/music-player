package com.musicplayer.android.navigator

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.musicplayer.android.R
import com.musicplayer.android.ui.home.Home
import com.musicplayer.android.ui.library.Library

class AppNavigatorImpl(private val activity: FragmentActivity) : AppNavigator {

    override fun navigateTo(screen: Screens) {
        val fragment = when (screen) {
            Screens.Player -> Home()
            Screens.Library -> Library()
            else -> Home()
        }

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.flContent, fragment as Fragment)
            .addToBackStack(fragment::class.java.canonicalName)
            .commit()
    }
}