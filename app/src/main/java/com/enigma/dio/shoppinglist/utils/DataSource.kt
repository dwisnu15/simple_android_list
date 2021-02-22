package com.enigma.dio.shoppinglist.utils



//object ItemList : ArrayList<Item>()
var ItemList = mutableListOf<Item>()
//val ItemList : mutableListOf

const val ADD_ITEM = "ADD_ITEM"

fun addItemToList (item : Item) {
    ItemList.add(item)
}

//for initializing item list (also for testing)
fun initItem() : MutableList<Item> {
    ItemList.addAll(
        listOf(
            Item(name = "Coffee", quantity = 3, date = "2021-02-24", notes = "High quality"),
            Item(name = "Noodles", quantity = 5, date = "2021-02-24", notes = "" ),
            Item(name = "Liquid Soap", quantity = 0, date = "2021-02-27", notes = "Lux"),
            Item(name = "Honey", quantity = 11, date = "2021", notes = "Unknown purchase date"))
    )
    return ItemList;
}


