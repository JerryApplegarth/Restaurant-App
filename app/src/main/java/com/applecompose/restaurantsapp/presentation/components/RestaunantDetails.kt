package com.applecompose.restaurantsapp.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RestaurantDetails(title: String,
                      description: String,
                      modifier: Modifier,
                      horizontalAlignment: Alignment.Horizontal = Alignment.Start) {
	Column(modifier = modifier, horizontalAlignment = horizontalAlignment) {
		Text(
			text = title,
			style = MaterialTheme.typography.h6
		)
		CompositionLocalProvider(
			LocalContentAlpha provides ContentAlpha.medium
		) {
			Text(
				text = description,
				style = MaterialTheme.typography.body2
			)
		}
	}
}