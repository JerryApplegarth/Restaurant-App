package com.applecompose.restaurantsapp

import androidx.lifecycle.ViewModel
import com.applecompose.data.model.dummyRestaurants

class RestaurantsViewModel(): ViewModel() {

	fun getRestaurants() = dummyRestaurants
}