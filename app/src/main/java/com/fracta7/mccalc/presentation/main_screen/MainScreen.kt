package com.fracta7.mccalc.presentation.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.fracta7.mccalc.ui.theme.MCCalcTheme

@Composable
fun MainScreen() {
    MCCalcTheme() {
        val viewModel = hiltViewModel<MainScreenViewModel>()
        LazyColumn {
            items(viewModel.items.size) { it ->
                Row {
                    Image(
                        painter = painterResource(id = viewModel.items[it].icon),
                        contentDescription = ""
                    )
                    Text(text = viewModel.items[it].name)
                }
            }
        }

    }
}