package com.enigma.dio.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.navigation.findNavController


class MainActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAddItemMenu = findViewById<ImageButton>(R.id.navAddBtn)
        val buttonListItemMenu = findViewById<ImageButton>(R.id.navListBtn)
        val buttonAccountMenu = findViewById<ImageButton>(R.id.navAccountBtn)
        val buttonListHistory = findViewById<ImageButton>(R.id.navHistoryBtn)

        buttonAddItemMenu.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_addItemFragment)
        }
        buttonListItemMenu.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_itemListFragment)
        }

        buttonAccountMenu.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_accountFragment)
        }
        buttonListHistory.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.action_global_historyFragment)
        }

    }

}