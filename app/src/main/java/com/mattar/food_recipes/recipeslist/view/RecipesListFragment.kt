package com.mattar.food_recipes.recipeslist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mattar.food_recipes.databinding.RecipesListFragmentBinding
import com.mattar.food_recipes.recipeslist.view.adapter.RecipesListAdapter
import com.mattar.food_recipes.recipeslist.viewmodel.RecipesListViewModel
import com.mattar.food_recipes.utilities.InjectorUtils.provideRecipesListViewModelFactory

class RecipesListFragment : Fragment() {

    private val viewModel: RecipesListViewModel by viewModels {
        provideRecipesListViewModelFactory(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = RecipesListFragmentBinding.inflate(inflater, container, false)
        context ?: return binding.root
        val adapter = RecipesListAdapter()
        binding.recipeList.adapter = adapter
        adapter.submitList(viewModel.getRecipesListItems())
        return binding.root
    }
}