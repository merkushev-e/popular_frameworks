package ru.gb.hw

import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.SingleStateStrategy
import moxy.viewstate.strategy.StateStrategyType

import ru.gb.hw.model.ButtonUiModel

@StateStrategyType(SingleStateStrategy::class)
interface MainView: MvpView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun setButtonText(buttonUiModel: ButtonUiModel)


}