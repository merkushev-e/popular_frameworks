package ru.gb.hw.mvpmultiply

import moxy.MvpView

import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MultiplyView: MvpView {
    fun showResults(int: Int)
}