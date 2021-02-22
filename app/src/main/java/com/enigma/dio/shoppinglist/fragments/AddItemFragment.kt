package com.enigma.dio.shoppinglist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.enigma.dio.shoppinglist.R
import com.enigma.dio.shoppinglist.interfaces.OnNavigationListener
import com.enigma.dio.shoppinglist.utils.Item
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_add_item.*

class AddItemFragment(private val onNavigationListener: OnNavigationListener) : Fragment() {

    private lateinit var submitButton: Button

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
        submitButton = view.findViewById(R.id.addItemButton)
        submitButton.setOnClickListener {
            submitNewItem()
        }

    }

    private fun submitNewItem() : Boolean {
        val date = inputItemDate.text.toString()
        val name = inputItemName.text.toString()
        val quantity = inputItemQty.text.toString().toLong()
        val notes = inputItemNotes.text.toString()

        if (name.isEmpty() || name.isBlank()) {
            Toast.makeText(
                activity,
                "Item's name must not be empty!",
                Toast.LENGTH_SHORT
            ).show()
            return false
        }
        val newItem = Item(
            date = date,
            name = name,
            quantity = quantity,
            notes = notes
        )
        onNavigationListener.addItem(newItem)
        Toast.makeText(
            activity,
            "Item ${newItem.name} has been added",
            Toast.LENGTH_SHORT
        ).show()
        resetAddForm()
        return true
    }

    private fun resetAddForm() {
        inputItemDate.setText("")
        inputItemName.setText("")
        inputItemQty.setText("")
        inputItemNotes.setText("")
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