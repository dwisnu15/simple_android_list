package com.enigma.dio.shoppinglist.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import com.enigma.dio.shoppinglist.R

class ListAdapter(context: Context, private var items: MutableList<Item>) :
    ArrayAdapter<Item>(context, R.layout.fragment_item_list, items) {

    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


    override fun getCount(): Int {
        return super.getCount()
    }

    override fun getItem(position: Int): Item? {
        return super.getItem(position)
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView : View
        if (convertView == null) {
            itemView = inflater.inflate(R.layout.item_list, parent, false)
        }
        else {
            itemView = convertView
        }

        val dateText : TextView? = itemView.findViewById(R.id.itemPurchaseDate)
        val nameText : TextView? = itemView.findViewById(R.id.itemName)
        val qtyText : TextView? = itemView.findViewById(R.id.itemQty)
        val notesText : TextView? = itemView.findViewById(R.id.itemNotes)

        val item = this.items[position]
        dateText?.text = item.date
        nameText?.text = item.name
        qtyText?.text = item.quantity.toString()
        notesText?.text = item.notes

        return itemView
    }
}