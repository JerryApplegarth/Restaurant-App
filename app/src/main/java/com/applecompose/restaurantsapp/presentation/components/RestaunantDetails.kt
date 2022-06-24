package com.applecompose.restaurantsapp.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RestaurantDetails(title: String, description: String, modifier: Modifier) {
	Column(modifier = modifier) {
		Text(
			text = title,
			style = MaterialTheme.typography.h6
			)
		CompositionLocalProvider(LocalContentAlpha provides  ContentAlpha.medium) {

		}
		Spacer(modifier = Modifier.height(6.dp))
		Text(
			text = description,
			style = MaterialTheme.typography.body2
		)



	}
}
