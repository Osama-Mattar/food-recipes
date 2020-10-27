package com.mattar.food_recipes.utilities

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.mattar.food_recipes.HelloFreshApplication
import com.mattar.food_recipes.model.data.recipe.Recipe
import java.io.IOException


fun getJsonDataFromAsset(): List<Recipe> {
    try {
        HelloFreshApplication.context.assets.open(RECIPES_DATA_FILENAME)
            .use { inputStream ->
                JsonReader(inputStream.reader()).use { jsonReader ->
                    val recipeType = object : TypeToken<List<Recipe>>() {}.type
                    val recipesList: List<Recipe> = Gson().fromJson(jsonReader, recipeType)
                    return recipesList
                }
            }
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return emptyList()
    }
}
