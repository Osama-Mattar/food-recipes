package com.mattar.food_recipes.utilities

import androidx.fragment.app.Fragment
import com.mattar.food_recipes.model.data.recipe.Recipe
import com.mattar.food_recipes.model.repository.RecipeRepositoryImpl
import com.mattar.food_recipes.recipedetails.viewmodel.RecipeDetailsViewModelFactory
import com.mattar.food_recipes.recipeslist.viewmodel.RecipesListViewModelFactory

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