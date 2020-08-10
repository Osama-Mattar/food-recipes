package com.mattar.osama_mattar_android_test.recipeslist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mattar.osama_mattar_android_test.databinding.RecipesListFragmentBinding
import com.mattar.osama_mattar_android_test.recipeslist.view.adapter.RecipesListAdapter
import com.mattar.osama_mattar_android_test.recipeslist.viewmodel.RecipesListViewModel
import com.mattar.osama_mattar_android_test.utilities.InjectorUtils.provideRecipesListViewModelFactory

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