package com.applecompose.restaurantsapp.presentation.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.applecompose.data.model.Restaurant
import com.applecompose.restaurantsapp.RestaurantsViewModel
import com.applecompose.restaurantsapp.presentation.components.RestaurantItem
import com.applecompose.restaurantsapp.ui.theme.RestaurantsAppTheme


@Composable
fun RestaurantsScreen() {
	val viewModel: RestaurantsViewModel = viewModel()

	LazyColumn(
		contentPadding = PaddingValues(
			vertical = 8.dp,
			horizontal = 8.dp
		)
	) {
		items(viewModel.state.value) {restaurant ->
			RestaurantItem(restaurant) { id ->
				viewModel.toggleFavorite(id)
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	RestaurantsAppTheme {
		RestaurantsScreen()
	}
}