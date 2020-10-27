package com.mattar.food_recipes.recipedetails.viewmodel

import androidx.lifecycle.ViewModel
import com.mattar.food_recipes.model.data.recipe.Recipe

class RecipeDetailsViewModel(private val _recipe: Recipe) : ViewModel() {
    val recipe = _recipe
}