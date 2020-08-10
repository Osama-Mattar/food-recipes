package com.mattar.osama_mattar_android_test.recipedetails.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mattar.osama_mattar_android_test.model.data.Recipe

class RecipeDetailsViewModelFactory(private val recipe: Recipe) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RecipeDetailsViewModel(recipe) as T
    }
}