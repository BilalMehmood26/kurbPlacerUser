package com.employee.kurbplacers.ui.auth.signup

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.employee.kurbplacers.ui.main.MainActivity
import com.kurb.placers.R
import com.kurb.placers.databinding.FragmentBnkingDetailsBinding

class BnkingDetailsFragment : Fragment(R.layout.fragment_bnking_details) {

    private var _binding: FragmentBnkingDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBnkingDetailsBinding.bind(view)

        binding.apply {

            continueBtn.setOnClickListener {
                val intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            }
            signupBtn.setOnClickListener {
                findNavController().navigate(R.id.action_bnkingDetailsFragment_to_signInFragment)
            }
            backBtn.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bnking_details, container, false)
    }
}