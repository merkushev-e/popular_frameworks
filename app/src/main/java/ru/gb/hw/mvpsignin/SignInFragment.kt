package ru.gb.hw.mvpsignin

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar
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
            UserRepositoryImpl(),
            router = router
        ) }

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignInBinding.bind(view)

        init()
    }


    override fun init() {
        binding.signInButton.setOnClickListener {
            val login = binding.loginEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            presenter.onButtonClicked(login,password)
        }
    }

     override fun showSignInErrorMessage(){
        Snackbar.make(binding.root,"Login or password not found", Snackbar.LENGTH_LONG).show()
    }

    override fun hideKeyboard() {
        val imm = requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var view = requireActivity().currentFocus
        if (view == null) view = View(requireActivity())
        imm.hideSoftInputFromWindow(view.windowToken, 0)

23
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = SignInFragment()
    }

}