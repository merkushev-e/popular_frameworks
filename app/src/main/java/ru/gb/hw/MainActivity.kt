package ru.gb.hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.hw.databinding.ActivityMainBinding
import ru.gb.hw.model.ButtonType
import ru.gb.hw.model.ButtonUiModel

class MainActivity : AppCompatActivity(), MainView {



    private val presenter = MainPresenter(this)
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnCounter1.setOnClickListener { presenter.counterClick(ButtonType.FIRST_BUTTON)}
        binding.btnCounter2.setOnClickListener { presenter.counterClick(ButtonType.SECOND_BUTTON)}
        binding.btnCounter3.setOnClickListener { presenter.counterClick(ButtonType.THIRD_BUTTON)}
    }


    override fun setButtonText(buttonUiModel: ButtonUiModel) {
        when(buttonUiModel.index){
            ButtonType.FIRST_BUTTON -> binding.btnCounter1.text = buttonUiModel.value
            ButtonType.SECOND_BUTTON -> binding.btnCounter2.text = buttonUiModel.value
            ButtonType.THIRD_BUTTON -> binding.btnCounter3.text = buttonUiModel.value
        }
    }
    override fun setButtonTextFirst(buttonUiModel: ButtonUiModel) {
        binding.btnCounter1.text = buttonUiModel.value
    }

    override fun setButtonTextSecond(buttonUiModel: ButtonUiModel) {
        binding.btnCounter2.text = buttonUiModel.value
    }

    override fun setButtonTextThird(buttonUiModel: ButtonUiModel) {
        binding.btnCounter3.text = buttonUiModel.value
    }


}
