package com.mattar.food_recipes.model.repository

import com.mattar.food_recipes.model.data.recipe.Recipe
import com.mattar.food_recipes.utilities.getJsonDataFromAsset

class RecipeRepositoryImpl(var recipes: MutableList<Recipe>? = mutableListOf()) : RecipeRepository {
    override suspend fun getRecipes(): List<Recipe> {
//        recipes?.let { return ArrayList(it) }
        return getJsonDataFromAsset()
    }

    override suspend fun getRecipe(id: String): Recipe {
        return getJsonDataFromAsset().asSequence().filter { (it.id).equals(id) }
            .single()
    }

    companion object {
        // For Singleton instantiation
        @Volatile
        private var instance: RecipeRepositoryImpl? = null
        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: RecipeRepositoryImpl().also { instance = it }
            }
    }
}