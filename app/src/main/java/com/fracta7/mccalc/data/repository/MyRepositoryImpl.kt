package com.fracta7.mccalc.data.repository

import com.fracta7.mccalc.R
import com.fracta7.mccalc.domain.model.CraftingType
import com.fracta7.mccalc.domain.model.Item
import com.fracta7.mccalc.domain.model.Recipe
import com.fracta7.mccalc.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
) : MyRepository {
    override suspend fun doNetworkCall() {
    }

    override fun getItems(): List<Item> {
        return listOf(
            Item("Stone", "minecraft_stone", true, R.drawable.item_stone, "Block", 64),
            Item("Granite", "minecraft_granite", true, R.drawable.item_granite, "Block", 64),
            Item("Polished Granite", "minecraft_polished_granite", false, R.drawable.item_polished_granite, "Block", 64),
            Item("Diorite", "minecraft_diorite", true, R.drawable.item_diorite, "Block", 64),
            Item("Polished Diorite", "minecraft_polished_diorite", false, R.drawable.item_polished_diorite, "Block", 64),
            Item("Andesite", "minecraft_andesite", true, R.drawable.item_andesite, "Block", 64),
            Item("Andesite", "minecraft_andesite", true, R.drawable.item_andesite, "Block", 64),
        )
    }

    override fun getRecipes(): List<Recipe> {
        val items = getItems()
        return listOf(
            Recipe(CraftingType("Stone cutting"), mapOf(items[1] to 1), mapOf(items[2] to 1)) //granite to polished granite
        )
    }

}