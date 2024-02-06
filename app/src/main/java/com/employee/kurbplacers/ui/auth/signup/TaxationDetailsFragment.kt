package com.employee.kurbplacers.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kurb.placers.R
import com.kurb.placers.databinding.FragmentPersonalInfoBinding
import com.kurb.placers.databinding.FragmentTaxationDetailsBinding

class TaxationDetailsFragment : Fragment() {

    private var _binding: FragmentTaxationDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTaxationDetailsBinding.bind(view)

        binding.apply {

            nextBtn.setOnClickListener {
                findNavController().navigate(R.id.action_taxationDetailsFragment_to_bnkingDetailsFragment)
            }
            signupBtn.setOnClickListener {
                findNavController().navigate(R.id.action_taxationDetailsFragment_to_signInFragment)
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
        return inflater.inflate(R.layout.fragment_taxation_details, container, false)
    }
}