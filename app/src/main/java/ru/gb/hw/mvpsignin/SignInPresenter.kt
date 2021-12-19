package ru.gb.hw.mvpsignin

import android.os.Bundle
import moxy.MvpPresenter
import ru.gb.hw.model.User
import ru.gb.hw.model.UserRepository
import ru.gb.hw.mvpgreetings.GreetingsFragment
import ru.gb.hw.mvpgreetings.GreetingsScreen
import ru.gb.hw.navigation.CustomRouter

class SignInPresenter(

    private val router: CustomRouter
): MvpPresenter<SignInView>() {

    fun onButtonClicked(login: String){
        val user = User(login)
        val bundle = Bundle().apply {
            putParcelable(GreetingsFragment.LOGIN, user)
        }

        router.navigateTo(GreetingsScreen(bundle))
    }
}