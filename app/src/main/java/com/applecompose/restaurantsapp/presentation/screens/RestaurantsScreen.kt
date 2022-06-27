package com.applecompose.restaurantsapp.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.applecompose.restaurantsapp.RestaurantsViewModel
import com.applecompose.restaurantsapp.presentation.components.RestaurantItem

@Composable
fun RestaurantsScreen(onItemClick: (id: Int) -> Unit) {
	val viewModel: RestaurantsViewModel = viewModel()
	LazyColumn(
		contentPadding = PaddingValues(
			vertical = 8.dp,
			horizontal = 8.dp
		)
	) {
		items(viewModel.state.value) { restaurant ->
			RestaurantItem(restaurant,
				onFavoriteClick = { id, oldValue ->
					viewModel.toggleFavorite(id, oldValue) },
				onItemClick = { id -> onItemClick(id) })
		}
	}
}
