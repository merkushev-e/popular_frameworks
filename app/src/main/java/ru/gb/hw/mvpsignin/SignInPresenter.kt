package ru.gb.hw.mvpsignin

import moxy.MvpPresenter
import ru.gb.hw.model.User
import ru.gb.hw.model.UserRepository
import ru.gb.hw.mvpgreetings.GreetingsScreen
import ru.gb.hw.navigation.CustomRouter

class SignInPresenter(

    private val router: CustomRouter
): MvpPresenter<SignInView>() {

    fun onButtonClicked(user: User){
        router.navigateTo(GreetingsScreen(user.login))
    }
}