package com.applecompose.restaurantsapp.domain

import com.applecompose.restaurantsapp.data.model.Restaurant

data class RestaurantsScreenState(
	val restaurants: List<Restaurant>,
	val isLoading: Boolean,
	val error: String? = null
)