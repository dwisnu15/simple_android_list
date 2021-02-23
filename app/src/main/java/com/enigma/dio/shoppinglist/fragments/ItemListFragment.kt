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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.enigma.dio.shoppinglist.R
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.enigma.dio.shoppinglist.utils.*
import kotlinx.android.synthetic.main.fragment_item_list.*

/**
 * A simple [Fragment] subclass.
 * Use the [ItemListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ItemListFragment : Fragment(){


    private lateinit var itemListAdapter : ItemListAdapter

    protected lateinit var mRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_item_list, container, false)
        //dont forget to change r.id.list_item to a cardview
        mRecyclerView = rootView.findViewById(R.id.list_Item)
        itemListAdapter = context?.let { ItemListAdapter() }!!
        //E/RecyclerView: No layout manager attached; skipping layout
        mRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        mRecyclerView.adapter = itemListAdapter
        return rootView
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