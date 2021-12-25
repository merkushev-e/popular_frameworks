package ru.gb.hw.navigation

import android.os.Bundle
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Forward
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.gb.hw.mvpgreetings.GreetingsFragment
import ru.gb.hw.mvpgreetings.GreetingsScreen

class OpenDeepLink(private val bundle: Bundle) : CustomRouter.Command, Command {

    override fun execute(navigator: CustomNavigator) {
        navigator.applyCommand(Forward(GreetingsScreen(bundle)))
    }
}