package ru.gb.hw.mvpsignin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.gb.hw.App.Navigation.router
import ru.gb.hw.R
import ru.gb.hw.databinding.FragmentSignInBinding
import ru.gb.hw.model.User
import ru.gb.hw.model.UserRepository
import ru.gb.hw.model.UserRepositoryImpl
import ru.gb.hw.mvpgreetings.GreetingsFragment


class SignInFragment : MvpAppCompatFragment(R.layout.fragment_sign_in), SignInView {

    private val presenter by moxyPresenter {
        SignInPresenter(
            router = router
        ) }

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignInBinding.bind(view)

        init()
    }

    companion object {
        @JvmStatic
        fun newInstance() = SignInFragment()
    }

    override fun init() {
        binding.signInButton.setOnClickListener {
            val user = User(binding.loginEditText.text.toString())
            val bundle = Bundle().apply {
                putParcelable(GreetingsFragment.LOGIN, user)
            }
            presenter.onButtonClicked(bundle)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}