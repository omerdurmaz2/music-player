package com.musicplayer.android.navigator

enum class Screens {
    Player,
    Library,
    Search
}

/**
 * Interfaces that defines an app navigator.
 */
interface AppNavigator {
    // Navigate to a given screen.
    fun navigateTo(screen: Screens)
}
