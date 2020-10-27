package com.mattar.food_recipes.recipedetails.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mattar.food_recipes.model.data.recipe.Recipe

class RecipeDetailsViewModelFactory(private val recipe: Recipe) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RecipeDetailsViewModel(recipe) as T
    }
}