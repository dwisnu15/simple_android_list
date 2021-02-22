package com.enigma.dio.shoppinglist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.enigma.dio.shoppinglist.R
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.enigma.dio.shoppinglist.utils.Item
import kotlinx.android.synthetic.main.fragment_add_item.*

class AddItemFragment: Fragment(), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_add_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
//        btnList.setOnClickListener (this)

    }

    override fun onClick(v: View?) {
//        when(v) {
//            btnList -> navController.navigate(R.id.action_addItemFragment_to_itemListFragment)
//        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AddItemFragment()
    }
}