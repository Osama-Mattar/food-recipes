package com.mattar.food_recipes.model.repository

import com.mattar.food_recipes.model.data.recipe.Recipe

interface RecipeRepository {
    suspend fun getRecipes(): List<Recipe>
    suspend fun getRecipe(id: String): Recipe
}