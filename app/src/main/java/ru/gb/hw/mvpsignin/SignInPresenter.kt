package ru.gb.hw.mvpsignin

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import moxy.MvpPresenter
import ru.gb.hw.model.User
import ru.gb.hw.model.UserRepository
import ru.gb.hw.mvpgreetings.GreetingsFragment
import ru.gb.hw.mvpgreetings.GreetingsScreen
import ru.gb.hw.navigation.CustomRouter

class SignInPresenter(
    private val userRepository: UserRepository,
    private val router: CustomRouter
) : MvpPresenter<SignInView>() {


    fun onButtonClicked(login: String, password: String) {
        viewState.hideKeyboard()
        userRepository.getUserByLogin(login,password).subscribe(
            {
                displayUser(user = it)
            },
            {
                viewState.showSignInErrorMessage()
            }
        )

    }

    private fun displayUser(user: User) {
        val bundle = Bundle().apply {
            putParcelable(GreetingsFragment.USER, user)
        }
        router.navigateTo(GreetingsScreen(bundle))
    }

}
