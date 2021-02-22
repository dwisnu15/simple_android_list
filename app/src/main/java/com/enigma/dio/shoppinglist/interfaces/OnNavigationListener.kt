package com.enigma.dio.shoppinglist.interfaces

import com.enigma.dio.shoppinglist.utils.Item

interface OnNavigationListener {

    //onSplash()
    fun onAddItem()//change to fragment AddItemFragment
    fun onListItem()//change to fragment ItemListFragment
    fun addItem(item : Item)
    fun onExit()
}