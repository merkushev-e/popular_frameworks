package ru.gb.hw.mvpgreetings

import android.os.Bundle
import android.view.View
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gb.hw.App
import ru.gb.hw.R
import ru.gb.hw.databinding.FragmentGreetingsBinding
import ru.gb.hw.model.User
import ru.gb.hw.model.UserRepositoryImpl
import ru.gb.hw.mvpsignin.SignInPresenter





class GreetingsFragment : MvpAppCompatFragment(R.layout.fragment_greetings), GreetingsView {

    companion object {
        const val LOGIN = "login_name"
        @JvmStatic
        fun newInstance(bundle: Bundle) =
            GreetingsFragment().apply {
                arguments = bundle
            }
    }


//    private lateinit var user: User

    private val user by lazy {
        arguments?.getParcelable(LOGIN) ?: User("")
    }



    private var _binding: FragmentGreetingsBinding? = null
    private val binding get() = _binding!!

    private val presenter by moxyPresenter {
        GreetingsPresenter(user,
            userRepository = UserRepositoryImpl()
        ) }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGreetingsBinding.bind(view)

//        user = arguments?.getParcelable(LOGIN) ?: User("")

    }



    override fun showLoginName(login: String?) {
        binding.greetingsTextview.text = resources.getString(R.string.greetings_view) + " " +login
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}