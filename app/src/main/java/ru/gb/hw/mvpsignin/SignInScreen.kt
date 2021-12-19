package ru.gb.hw.mvpsignin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

object SignInScreen: FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
      return SignInFragment.newInstance()
    }

}