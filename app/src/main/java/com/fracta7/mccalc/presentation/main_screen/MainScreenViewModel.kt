package com.fracta7.mccalc.presentation.main_screen

import android.app.Application
import androidx.lifecycle.ViewModel
import com.fracta7.mccalc.R
import com.fracta7.mccalc.domain.model.Item
import com.fracta7.mccalc.domain.model.Recipe
import com.fracta7.mccalc.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val repository: MyRepository,
    private val appContext: Application
) : ViewModel() {
    val name = appContext.getString(R.string.app_name)
    val items = repository.getItems()
    val recipes = repository.getRecipes()
    val userList = mapOf<Item, Int>()

    //adds an item to the list of craftables
    fun addItemToList(item: Map<Item, Int>){
        userList + item
    }

    //converts userlist to raw materials
    fun convertToRawItems(userList: Map<Item, Int>): Map<Item, Int>{
        return mapOf()
    }

}