package ru.gb.hw.mvpgreetings

import moxy.MvpPresenter
import ru.gb.hw.model.UserRepository

class GreetingsPresenter(
    private val userLogin: String?,
    private val userRepository: UserRepository
)
    : MvpPresenter<GreetingsView>() {

    override fun attachView(view: GreetingsView?) {
        super.attachView(view)
        viewState.showLoginName(userLogin)

    }
}