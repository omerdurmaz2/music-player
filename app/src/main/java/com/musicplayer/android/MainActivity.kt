package com.musicplayer.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.musicplayer.android.navigator.AppNavigator
import com.musicplayer.android.navigator.Screens
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var navigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator = (applicationContext as MusicApplication).serviceLocator.provideNavigator(this)
        if (savedInstanceState == null) {
            navigator.navigateTo(Screens.Player)
        }
    }
}