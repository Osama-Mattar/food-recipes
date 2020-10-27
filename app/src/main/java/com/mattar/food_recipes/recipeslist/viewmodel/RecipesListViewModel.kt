package com.mattar.food_recipes.recipeslist.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mattar.food_recipes.model.data.recipe.Recipe
import com.mattar.food_recipes.model.repository.RecipeRepositoryImpl
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