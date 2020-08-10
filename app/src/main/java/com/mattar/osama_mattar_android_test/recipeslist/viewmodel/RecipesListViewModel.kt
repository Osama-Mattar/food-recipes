package com.mattar.osama_mattar_android_test.recipeslist.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mattar.osama_mattar_android_test.model.data.recipe.Recipe
import com.mattar.osama_mattar_android_test.model.repository.RecipeRepositoryImpl
import kotlinx.coroutines.launch

class RecipesListViewModel(
    private val recipeRepositoryImpl: RecipeRepositoryImpl,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    fun getRecipesListItems(): List<Recipe> {
        var recipesListItems: List<Recipe> = listOf()
        viewModelScope.launch {
            recipeRepositoryImpl.getRecipes()
                .also { recipes: List<Recipe> -> recipesListItems = recipes }
        }
        return recipesListItems
    }
}