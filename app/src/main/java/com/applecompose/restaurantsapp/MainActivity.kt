package com.applecompose.restaurantsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import com.applecompose.restaurantsapp.presentation.screens.RestaurantDetailsScreen
import com.applecompose.restaurantsapp.presentation.screens.RestaurantsScreen
import com.applecompose.restaurantsapp.ui.theme.RestaurantsAppTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			RestaurantsAppTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					color = MaterialTheme.colors.background
				) {
					//RestaurantsScreen()
					RestaurantDetailsScreen()
				}

			}
		}
	}
}



