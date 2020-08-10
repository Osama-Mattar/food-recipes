package com.mattar.osama_mattar_android_test.model.repository

import com.mattar.osama_mattar_android_test.model.data.recipe.Recipe
import com.mattar.osama_mattar_android_test.utilities.getJsonDataFromAsset

class RecipeRepositoryImpl : RecipeRepository {
    override suspend fun getRecipes(): List<Recipe> {
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