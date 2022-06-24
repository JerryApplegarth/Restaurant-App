package com.applecompose.restaurantsapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.applecompose.data.model.Restaurant


@Composable
fun RestaurantItem(item: Restaurant) {
	Card(
		elevation = 4.dp,
		modifier = Modifier.padding(8.dp)
	) {
		Row(
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier.padding(8.dp)
		) {
			RestaurantIcon(Icons.Filled.Face, Modifier.weight(0.15f))
			RestaurantDetails(item.title, item.description, Modifier.weight(0.75f))
			FavoriteIcon(Modifier.weight(0.15f))
		}
	}
}


