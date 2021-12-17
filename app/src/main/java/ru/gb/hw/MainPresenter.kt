package ru.gb.hw

import moxy.MvpPresenter
import ru.gb.hw.model.ButtonType
import ru.gb.hw.model.ButtonUiModel

class MainPresenter: MvpPresenter<MainView>() {


    private val mapper = EnumToIndexMapper()
    private val model = CountersModel(mapper)

    override fun attachView(view: MainView?) {
        super.attachView(view)
        val countersCount = ButtonType.values().size - 1
        for (index in 0 .. countersCount){
            val enumValue = mapper.mapIndexToEnum(index)
            val uiModel = ButtonUiModel(enumValue, model.getCurrent(enumValue).toString())
            viewState.setButtonText(uiModel)
        }

    }

    fun counterClick(type: ButtonType) {
        val nextValue = model.next(type)
        val uiModel = ButtonUiModel(type, nextValue.toString())
        viewState.setButtonText(uiModel)
    }


}
