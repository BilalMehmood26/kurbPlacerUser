package com.employee.kurbplacers.ui.auth.signin

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.employee.kurbplacers.ui.main.MainActivity
import com.kurb.placers.R
import com.kurb.placers.databinding.FragmentSignInBinding

class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    companion object {
        fun newInstance() = SignInFragment()
    }

    private lateinit var viewModel: SignInViewModel
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignInBinding.bind(view)

        binding.apply {
            signupBtn.setOnClickListener {
                findNavController().navigate(R.id.action_signInFragment_to_personalInfoFragment)
            }

            loginBtn.setOnClickListener {
                val intent = Intent(requireActivity(),MainActivity::class.java)
                startActivity(intent)
            }
        }
        setObserver()
    }

    private fun setObserver() {

    }
}