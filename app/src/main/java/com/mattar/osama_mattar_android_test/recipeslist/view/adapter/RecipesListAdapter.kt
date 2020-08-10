package com.mattar.osama_mattar_android_test.recipeslist.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mattar.osama_mattar_android_test.databinding.ListItemRecipeBinding
import com.mattar.osama_mattar_android_test.model.data.Recipe
import com.mattar.osama_mattar_android_test.recipeslist.view.RecipesListFragment
import com.mattar.osama_mattar_android_test.recipeslist.view.RecipesListFragmentDirections

/**
 * Adapter for the [RecyclerView] in [RecipesListFragment].
 */
class RecipesListAdapter : ListAdapter<Recipe, RecyclerView.ViewHolder>(RecipeDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RecipeViewHolder(
            ListItemRecipeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val recipe = getItem(position)
        (holder as RecipeViewHolder).bind(recipe)
    }

    class RecipeViewHolder(private val binding: ListItemRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.recipe?.let { recipe ->
                    navigateToRecipe(recipe, it)
                }
            }
        }

        private fun navigateToRecipe(
            recipe: Recipe,
            view: View
        ) {
            val direction =
                RecipesListFragmentDirections.actionRecipesListFragmentToRecipeDetailsFragment(
                    recipe
                )
            view.findNavController().navigate(direction)
        }

        fun bind(item: Recipe) {
            binding.apply {
                recipe = item
                executePendingBindings()
            }
        }
    }
}

class RecipeDiffCallback : DiffUtil.ItemCallback<Recipe>() {
    override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
        return oldItem == newItem
    }

}
