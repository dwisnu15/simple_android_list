package com.enigma.dio.shoppinglist.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.enigma.dio.shoppinglist.R

fun FragmentTransaction.itemNav(
    fragment : Fragment,
    tag : String,
    backStack : String?
) : FragmentTransaction {
    backStack.apply {
        this@itemNav.replace(R.id.fragmentContainer, fragment, tag)
            .addToBackStack(this) }
        ?: run {
            this@itemNav.replace(R.id.fragmentContainer, fragment, tag)
    }
    return this
}