package com.enigma.dio.shoppinglist.utils

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.enigma.dio.shoppinglist.R

class ItemListAdapter () : RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemDate: TextView = itemView.findViewById(R.id.ItemPurchaseDate)
        var itemName: TextView = itemView.findViewById(R.id.ItemName)
        var itemQuantity: TextView = itemView.findViewById(R.id.ItemQty)
        var itemNote: TextView = itemView.findViewById(R.id.ItemNotes)

        //init {

//            itemView.setOnClickListener {
//                val position: Int = adapterPosition
//                val context = itemView.context
//                val intent = Intent(context, ItemListFragment::class.java).apply {
//                    putExtra("NUMBER", position)
//                    putExtra("DATE", itemDate.text)
//                    putExtra("CODE", itemName.text)
//                    putExtra("CATEGORY", itemQuantity.text)
//                    putExtra("CONTENT", itemNote.text)
//                }
//                context.startActivity(intent)
//            }
 //       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            //use item_list.xml to define how data will be presented
            //changed to layout item_cardview.xml
            .inflate(R.layout.item_cardview, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int = ItemList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //fill the text value of each row
        val item = ItemList[position]
        holder.itemDate.text = item.date
        holder.itemName.text = item.name
        holder.itemQuantity.text = item.quantity.toString()
        holder.itemNote.text = item.notes

    }
}