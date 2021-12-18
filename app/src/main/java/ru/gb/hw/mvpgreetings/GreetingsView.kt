package ru.gb.hw.mvpgreetings

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType
import ru.gb.hw.model.User

@StateStrategyType(AddToEndSingleStrategy::class)
interface GreetingsView: MvpView {
    fun showLoginName(login: String?)
}