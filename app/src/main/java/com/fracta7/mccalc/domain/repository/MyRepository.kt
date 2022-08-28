package com.fracta7.mccalc.domain.repository

import com.fracta7.mccalc.domain.model.Item
import com.fracta7.mccalc.domain.model.Recipe

interface MyRepository {
    suspend fun doNetworkCall()
    fun getItems(): List<Item>
    fun getRecipes(): List<Recipe>
}