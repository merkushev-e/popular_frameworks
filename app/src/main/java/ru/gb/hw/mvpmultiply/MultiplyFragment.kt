package ru.gb.hw.mvpmultiply

import android.os.Bundle

import android.view.View

import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gb.hw.R
import ru.gb.hw.databinding.FragmentMultiplyBinding


class MultiplyFragment : MvpAppCompatFragment (R.layout.fragment_multiply), MultiplyView {

    private val presenter by moxyPresenter { MultiplyPresenter() }

    private var _binding: FragmentMultiplyBinding? = null
    private val binding get() = _binding!!



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentMultiplyBinding.bind(view)
        initView()
    }

    private fun initView() {
        binding.button.setOnClickListener {
            val number = binding.numberInput.text.toString()
            presenter.onButtonClicked(number)
        }
    }

    companion object {


        @JvmStatic
        fun newInstance() =
            MultiplyFragment()
    }

    override fun showResults(number: Int) {
        binding.textView.text = number.toString()
    }
}