package com.enigma.dio.shoppinglist.fragments

import android.app.DatePickerDialog
import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.enigma.dio.shoppinglist.R
import com.enigma.dio.shoppinglist.utils.Item
import com.enigma.dio.shoppinglist.utils.addItemToList
import kotlinx.android.synthetic.main.fragment_add_item.*
import java.util.*

class AddItemFragment: Fragment(), View.OnClickListener {

    private lateinit var navController: NavController

    private lateinit var itemDate : String
    private lateinit var itemName : String
    private var itemQty : Long = 0
    private lateinit var itemNote : String

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
        addItemButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v) {
            addItemButton -> {
                if (addItem()) {
                    Toast.makeText(activity, "New item has been added", Toast.LENGTH_SHORT).show()
                    clearInputForm()
                }
            }

        }
    }

    private fun addItem() : Boolean {
        itemDate = inputItemDate.text.toString()
        itemName = inputItemName.text.toString()
        itemQty = inputItemQty.text.toString().toLong()
        itemNote = inputItemNotes.text.toString()

        if (itemDate.isEmpty() || itemName.isEmpty() || itemQty <= 0) {
            Toast.makeText(activity,
                "Required field must be filled!", Toast.LENGTH_SHORT)
                .show()
            return false
        }
        if (itemNote.isEmpty()) {
            itemNote = "No additional note"
        }

        addItemToList(
            Item(
                date = itemDate,
                name = itemName,
                quantity = itemQty,
                notes = itemNote
            ))
        return true
    }

    private fun pickDate() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        inputItemDate.inputType = InputType.TYPE_NULL
        inputItemDate.setOnClickListener(View.OnClickListener {
            val datePickerDialog = activity?.let { it1 ->
                DatePickerDialog(
                    it1, DatePickerDialog.OnDateSetListener
                    { view, year, monthOfYear, dayOfMonth ->
                        inputItemDate.setText(
                            "$year/$monthOfYear/$dayOfMonth",
                            TextView.BufferType.EDITABLE
                        );
                    }, year, month, day
                )
            }
            datePickerDialog?.show()
        })
    }

    private fun clearInputForm() {
        inputItemDate.text.clear()
        inputItemName.text.clear()
        inputItemQty.text.clear()
        inputItemNotes.text.clear()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AddItemFragment()
    }
}