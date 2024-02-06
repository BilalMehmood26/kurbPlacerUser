package com.employee.kurbplacers.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.kurb.placers.R
import com.kurb.placers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            bottomNavigationView.itemIconTintList = null
            val navController = findNavController(R.id.main_fragment_Container)
            bottomNavigationView.setupWithNavController(navController)
            navController.addOnDestinationChangedListener { _, destination, _ ->
                when (destination.id) {
                    R.id.chatFragment -> {
                        bottomNavigationView.visibility = View.GONE
                    }

                    else -> {
                        bottomNavigationView.visibility = View.VISIBLE
                    }
                }
            }
        }

    }
}