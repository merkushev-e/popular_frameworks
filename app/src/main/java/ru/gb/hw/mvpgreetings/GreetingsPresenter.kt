package ru.gb.hw.mvpgreetings

import moxy.MvpPresenter
import ru.gb.hw.model.User
import ru.gb.hw.model.UserRepository

class GreetingsPresenter(
    private var user: User,
    private val userRepository: UserRepository,

)
    : MvpPresenter<GreetingsView>() {

    override fun attachView(view: GreetingsView?) {
        super.attachView(view)
        viewState.showLoginName(user.login)

    }


}