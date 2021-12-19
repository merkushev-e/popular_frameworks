package ru.gb.hw.mvpgreetings

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gb.hw.model.User

class GreetingsScreen(private val bundle: Bundle): FragmentScreen{

    override fun createFragment(factory: FragmentFactory): Fragment =
        GreetingsFragment.newInstance(bundle)


}