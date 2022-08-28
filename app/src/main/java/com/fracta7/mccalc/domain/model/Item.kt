package com.fracta7.mccalc.domain.model

data class Item(
    val name: String,
    val id: String,
    val raw: Boolean,
    val icon: Int,
    val category: String,
    val stackable: Int
)
