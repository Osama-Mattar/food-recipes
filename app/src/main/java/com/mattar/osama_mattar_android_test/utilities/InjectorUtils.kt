package com.mattar.osama_mattar_android_test.utilities

import androidx.fragment.app.Fragment
import com.mattar.osama_mattar_android_test.model.data.recipe.Recipe
import com.mattar.osama_mattar_android_test.model.repository.RecipeRepositoryImpl
import com.mattar.osama_mattar_android_test.recipedetails.viewmodel.RecipeDetailsViewModelFactory
import com.mattar.osama_mattar_android_test.recipeslist.viewmodel.RecipesListViewModelFactory

object InjectorUtils {
    fun provideRecipesListViewModelFactory(fragment: Fragment): RecipesListViewModelFactory {
        return RecipesListViewModelFactory(getRecipeRepository(), fragment)
    }

    private fun getRecipeRepository(): RecipeRepositoryImpl {
        return RecipeRepositoryImpl.getInstance()
    }

    fun provideRecipeDetailViewModelFactory(
        recipe: Recipe
    ): RecipeDetailsViewModelFactory {
        return RecipeDetailsViewModelFactory(recipe)
    }
}