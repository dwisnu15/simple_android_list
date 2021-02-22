package com.enigma.dio.shoppinglist.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.enigma.dio.shoppinglist.R
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.enigma.dio.shoppinglist.utils.Item
import com.enigma.dio.shoppinglist.utils.ListAdapter
import com.enigma.dio.shoppinglist.utils.initItem
import kotlinx.android.synthetic.main.fragment_item_list.*

/**
 * A simple [Fragment] subclass.
 * Use the [ItemListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ItemListFragment() : Fragment(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_item_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    companion object {
        @JvmStatic
        fun newInstance() =
            ItemListFragment()
    }

}