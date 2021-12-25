package ru.gb.hw.navigation

import android.os.Bundle
import com.github.terrakok.cicerone.Router
import ru.gb.hw.navigation.CustomNavigator

class CustomRouter: Router (){

    interface Command {
        fun execute(navigator: CustomNavigator)
    }

    fun openDeepLink(deepLinkUser: Bundle) {
        executeCommands(OpenDeepLink(deepLinkUser))
    }
}