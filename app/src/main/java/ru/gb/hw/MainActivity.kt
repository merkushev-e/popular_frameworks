package ru.gb.hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    companion object{
        const val BTN1 = "Button1"
        const val BTN2 = "Button2"
        const val BTN3 = "Button3"

    }

    private val presenter = MainPresenter(this)
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnCounter1.setOnClickListener { presenter.counterClick(BTN1)}
        binding.btnCounter2.setOnClickListener { presenter.counterClick(BTN2)}
        binding.btnCounter3.setOnClickListener { presenter.counterClick(BTN3)}
    }


    override fun setButtonTextFirst(text: String) {
        binding.btnCounter1.text = text
    }

    override fun setButtonTextSecond(text: String) {
        binding.btnCounter2.text = text
    }

    override fun setButtonTextThird(text: String) {
        binding.btnCounter3.text = text
    }


}
