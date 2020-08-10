package com.mattar.osama_mattar_android_test.recipedetails.viewmodel

import androidx.lifecycle.ViewModel
import com.mattar.osama_mattar_android_test.model.data.recipe.Recipe

class RecipeDetailsViewModel(private val _recipe: Recipe) : ViewModel() {
    val recipe = _recipe
}