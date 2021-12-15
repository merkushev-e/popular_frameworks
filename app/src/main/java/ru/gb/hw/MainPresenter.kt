package ru.gb.hw

import ru.gb.hw.model.ButtonType
import ru.gb.hw.model.ButtonUiModel

class MainPresenter(private val view: MainView) {
    private val model = CountersModel()

    fun counterClick(type: ButtonType) {
        when (type){
           ButtonType.FIRST_BUTTON ->{
               val nextValue = model.next(type)
               val uiModel = ButtonUiModel(type, nextValue.toString())
               view.setButtonText(uiModel)
           }

            ButtonType.SECOND_BUTTON->{
                val nextValue = model.next(type)
                val uiModel = ButtonUiModel(type, nextValue.toString())
                view.setButtonText(uiModel)
            }

            ButtonType.THIRD_BUTTON ->{
                val nextValue = model.next(type)
                val uiModel = ButtonUiModel(type, nextValue.toString())
                view.setButtonText(uiModel)
            }
        }
    }


}
