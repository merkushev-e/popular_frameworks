package ru.gb.hw

class MainPresenter(private val view: MainView) {
    private val model = CountersModel()

    fun counterClick(type: String) {
        when (type){
           MainActivity.BTN1 ->{
               val nextValue = model.next(0)
               view.setButtonTextFirst(nextValue.toString())
           }

            MainActivity.BTN2 ->{
                val nextValue = model.next(1)
                view.setButtonTextSecond(nextValue.toString())
            }

            MainActivity.BTN3 ->{
                val nextValue = model.next(2)
                view.setButtonTextThird(nextValue.toString())
            }
        }
    }


}
