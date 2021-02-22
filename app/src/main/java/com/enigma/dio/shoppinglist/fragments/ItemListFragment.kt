package com.enigma.dio.shoppinglist.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

//    private lateinit var layoutManager : RecyclerView.LayoutManager
    private lateinit var itemArray: MutableList<Item>
    private lateinit var adapter : ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            itemArray = it.getString(ARG_PARAM1)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        layoutManager = LinearLayoutManager(activity)
        //get list of data
        itemArray = initItem()

        //setup the array adapter so listView can be populated
        adapter = context?.let { ListAdapter(it, itemArray) }!!

        //provide which layout is going to be shown
        val rootView = inflater.inflate(R.layout.fragment_item_list, container, false)

        //provide which listview is going to be populated
        val listView = rootView.findViewById(R.id.list_Item) as ListView

        //set listView adapter
        listView.adapter = adapter

        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance(onNavigationListener: OnNavigationListener) =
            ItemListFragment(onNavigationListener)
    }
}