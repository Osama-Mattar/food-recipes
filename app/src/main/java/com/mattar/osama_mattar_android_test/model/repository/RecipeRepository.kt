package com.mattar.osama_mattar_android_test.model.repository

import com.mattar.osama_mattar_android_test.model.data.recipe.Recipe

interface RecipeRepository {
    suspend fun getRecipes(): List<Recipe>
    suspend fun getRecipe(id: String): Recipe
}