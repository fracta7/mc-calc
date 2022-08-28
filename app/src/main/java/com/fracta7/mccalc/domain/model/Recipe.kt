package com.fracta7.mccalc.domain.model

data class Recipe(
    val type: CraftingType,
    val requirements: Map<Item, Int>,
    val endResult: Map<Item, Int>,
    val leftOver: Map<Item, Int>? = null
)
