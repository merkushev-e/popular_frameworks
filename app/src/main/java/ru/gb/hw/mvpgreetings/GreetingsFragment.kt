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


private const val LOGIN = "login_name"


class GreetingsFragment : MvpAppCompatFragment(R.layout.fragment_greetings), GreetingsView {

    private val loginParam: String? by lazy {
        arguments?.getString(LOGIN).orEmpty()
    }

    private var _binding: FragmentGreetingsBinding? = null
    private val binding get() = _binding!!

    private val presenter by moxyPresenter {
        GreetingsPresenter(userLogin = loginParam,
            userRepository = UserRepositoryImpl()

        ) }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGreetingsBinding.bind(view)

    }

    companion object {

        @JvmStatic
        fun newInstance(login_param: String) =
            GreetingsFragment().apply {
                arguments = Bundle().apply {
                    putString(LOGIN, login_param)
                }
            }
    }

    override fun showLoginName(login: String?) {
        binding.greetingsTextview.text = resources.getString(R.string.greetings_view) + login
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}