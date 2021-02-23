package com.enigma.dio.shoppinglist.interfaces

interface OnNavigationListener {

    fun onSplash()
    fun onAddItem()//change to fragment AddItemFragment
    fun onListItem()//change to fragment ItemListFragment
    fun onExit()
}