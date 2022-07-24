package com.UI.Views.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.task_furniture.R
import com.example.task_furniture.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController =supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        binding.bottomNavigationView.setupWithNavController(navController.navController)

    }
}