package com.employee.kurbplacers.ui.main.timesheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kurb.placers.R
import com.kurb.placers.databinding.FragmentHomeBinding
import com.kurb.placers.databinding.FragmentTimeSheetBinding

class TimeSheetFragment : Fragment() {
    private var _binding: FragmentTimeSheetBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTimeSheetBinding.bind(view)

        binding.apply {
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
        return inflater.inflate(R.layout.fragment_time_sheet, container, false)
    }
}