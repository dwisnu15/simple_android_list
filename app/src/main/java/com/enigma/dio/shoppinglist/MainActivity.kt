package com.enigma.dio.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), OnNavigationListener{

    lateinit var navHostFragment: NavHostFragment
    lateinit var navController: NavController
    lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        navController = navHostFragment.findNavController()
        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setupWithNavController(navController)

    }

    override fun onSplash() {
        navController.navigate(R.id.action_splashFragment_to_navHub)
    }

    override fun onAddItem() {
        TODO("Not yet implemented")
    }

    override fun onListItem() {
        TODO("Not yet implemented")
    }

    override fun onExit() {
        TODO("Not yet implemented")
    }
}