package com.mattar.osama_mattar_android_test.recipeslist.viewmodel

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.mattar.osama_mattar_android_test.model.repository.RecipeRepositoryImpl

class RecipesListViewModelFactory(
    private val repositoryImpl: RecipeRepositoryImpl,
    owner: SavedStateRegistryOwner,
    defaultArgs: Bundle? = null
) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        return RecipesListViewModel(repositoryImpl, handle) as T
    }

}