package ru.gb.hw

import ru.gb.hw.model.ButtonType
import ru.gb.hw.model.ButtonUiModel

interface MainView {
    fun setButtonText(buttonUiModel: ButtonUiModel)
    fun setButtonTextFirst(buttonUiModel: ButtonUiModel)
    fun setButtonTextSecond(buttonUiModel: ButtonUiModel)
    fun setButtonTextThird(buttonUiModel: ButtonUiModel)

}