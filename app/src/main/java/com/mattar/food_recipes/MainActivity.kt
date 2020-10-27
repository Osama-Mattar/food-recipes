package com.mattar.food_recipes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.findNavController
import com.mattar.food_recipes.databinding.ActivityMainBinding
import com.mattar.food_recipes.navigation.NavManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val navController get() = nav_host_fragment.findNavController()

    private val navManager: NavManager = NavManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        initNavManager()
    }

    private fun initNavManager() {
        navManager.setOnNavEvent {
            navController.navigate(it)
        }
    }
}