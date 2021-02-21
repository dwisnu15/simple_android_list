package com.enigma.dio.shoppinglist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.enigma.dio.shoppinglist.R
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.enigma.dio.shoppinglist.utils.Item

class AddItemFragment(private val onNavigationListener : OnNavigationListener) : Fragment() {

    private lateinit var submitButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        val view = inflater.inflate(R.layout.fragment_add_item, container, false)
////        submitButton = view.findViewById(R.id.createItemButton)
////        submitButton.setOnClickListener {
////            submitNewItem(
////                Item()
////            )
////        }
        return inflater.inflate(R.layout.fragment_add_item, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        var date = inputItemDate.text
//        var name = R.id.inputItemName.toString()
//        var quantity = R.id.inputItemQty.toLong()
//        var notes = R.id.inputItemNotes.toLong()
//    }
//
//    private fun submitNewItem() {
//        var newItem
//
//    }

    companion object {
        @JvmStatic
        fun newInstance(onNavigationListener: OnNavigationListener) =
            AddItemFragment(onNavigationListener)
    }
}