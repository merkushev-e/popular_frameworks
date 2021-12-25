package ru.gb.hw.mvpmultiply

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gb.hw.mvpgreetings.GreetingsFragment

class MultiplyScreen (): FragmentScreen {

    override fun createFragment(factory: FragmentFactory): Fragment =
        MultiplyFragment.newInstance()

}