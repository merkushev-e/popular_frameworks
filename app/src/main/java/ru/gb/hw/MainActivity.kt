package ru.gb.hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.hw.App.Navigation.navigatorHolder
import ru.gb.hw.App.Navigation.router
import ru.gb.hw.mvpsignin.SignInScreen
import ru.gb.hw.navigation.CustomNavigator

class MainActivity : AppCompatActivity() {

    private val navigator = CustomNavigator(activity = this, android.R.id.content)

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            router.navigateTo(SignInScreen)
        }
    }
    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

}