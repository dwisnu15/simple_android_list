package com.enigma.dio.shoppinglist.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.enigma.dio.shoppinglist.R
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.enigma.dio.shoppinglist.utils.Item
import com.enigma.dio.shoppinglist.utils.ListAdapter
import com.enigma.dio.shoppinglist.utils.initItem

/**
 * A simple [Fragment] subclass.
 * Use the [ItemListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ItemListFragment(val onNavigationListener: OnNavigationListener) : Fragment() {


    private lateinit var itemArray: ArrayList<Item>
    private lateinit var adapter : ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            itemArray = it.getString(ARG_PARAM1)
//        }
        //get list of data
        itemArray = initItem()

        //setup the array adapter so listView can be populated
        adapter = context?.let { ListAdapter(it, itemArray) }!!

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //provide which layout is going to be shown
        val rootView = inflater.inflate(R.layout.fragment_item_list, container, false)

        //provide which listview is going to be populated
        val listView = rootView.findViewById(R.id.list_item) as ListView

        //set listView adapter
        listView.adapter = adapter

        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance(onNavigationListener: OnNavigationListener) =
            ItemListFragment(onNavigationListener).apply {
                arguments = Bundle().apply {

                }
            }
    }

    private fun getAllItem() {

    }
}