package com.enigma.dio.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.enigma.dio.shoppinglist.fragments.AddItemFragment
import com.enigma.dio.shoppinglist.fragments.ItemListFragment
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.enigma.dio.shoppinglist.utils.itemNav
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), OnNavigationListener {

    private lateinit var addFragment : AddItemFragment
    private lateinit var listFragment : ItemListFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton : FloatingActionButton = findViewById(R.id.createItemButton)
        val listButton : FloatingActionButton= findViewById(R.id.listItemButton)

        addFragment = AddItemFragment.newInstance(this)
        listFragment = ItemListFragment.newInstance(this)

        addButton.setOnClickListener { switchFragment(addFragment) }
        listButton.setOnClickListener { switchFragment(listFragment) }
    }

    private fun switchFragment(fragment : Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.apply {
            when (fragment) {
                is AddItemFragment -> itemNav(
                    fragment,
                    ADD_ITEM_FRAGMENT_TAG,
                    ITEM_LIST_TAG
                ).commit()

                is ItemListFragment -> itemNav(
                    fragment,
                    ITEM_LIST_TAG,
                    null
                ).commit()
            }
        }

    }

    override fun onAddItem() {
        addFragment = AddItemFragment(this)
        switchFragment(addFragment)

    }

    override fun onListItem() {
        listFragment = ItemListFragment(this)
        //get data class of added item, how?

        switchFragment(listFragment)
    }

    override fun onExit() {
        supportFragmentManager.popBackStack()
    }

    companion object {
        const val ADD_ITEM_FRAGMENT_TAG = "ADD_ITEM_FRAGMENT"
        const val ITEM_LIST_TAG = "ITEM_LIST_FRAGMENT"
        //const val SPLASH_FRAGMENT_TAG = "SPLASH_FRAGMENT"
    }
}