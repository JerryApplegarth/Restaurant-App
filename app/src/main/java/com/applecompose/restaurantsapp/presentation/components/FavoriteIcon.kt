package com.applecompose.restaurantsapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FavoriteIcon(modifier: Modifier) {
	Image(
		imageVector = Icons.Filled.Favorite,
		contentDescription = "Favorite restaurant icon",
		modifier = modifier
			.padding(8.dp)
		)

}