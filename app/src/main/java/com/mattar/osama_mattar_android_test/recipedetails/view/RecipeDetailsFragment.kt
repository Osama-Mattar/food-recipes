package com.mattar.osama_mattar_android_test.recipedetails.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.NestedScrollView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.mattar.osama_mattar_android_test.R
import com.mattar.osama_mattar_android_test.databinding.RecipeDetailsFragmentBinding
import com.mattar.osama_mattar_android_test.recipedetails.viewmodel.RecipeDetailsViewModel
import com.mattar.osama_mattar_android_test.utilities.InjectorUtils

class RecipeDetailsFragment : Fragment() {

    private val args: RecipeDetailsFragmentArgs by navArgs()

    private val recipeDetailsViewModel: RecipeDetailsViewModel by viewModels {
        InjectorUtils.provideRecipeDetailViewModelFactory(args.recipe)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<RecipeDetailsFragmentBinding>(
            inflater,
            R.layout.recipe_details_fragment,
            container,
            false
        ).apply {
            viewModel = recipeDetailsViewModel
            var isToolbarShown = false

            // scroll change listener begins at Y = 0 when image is fully collapsed
            recipeDetailScrollview.setOnScrollChangeListener(
                NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, _ ->

                    // User scrolled past image to height of toolbar and the title text is
                    // underneath the toolbar, so the toolbar should be shown.
                    val shouldShowToolbar = scrollY > toolbar.height

                    // The new state of the toolbar differs from the previous state; update
                    // appbar and toolbar attributes.
                    if (isToolbarShown != shouldShowToolbar) {
                        isToolbarShown = shouldShowToolbar

                        // Use shadow animator to add elevation if toolbar is shown
                        appbar.isActivated = shouldShowToolbar

                        // Show the plant name if toolbar is shown
                        toolbarLayout.isTitleEnabled = shouldShowToolbar
                    }
                }
            )
            toolbar.setNavigationOnClickListener { view ->
                view.findNavController().navigateUp()
            }
        }
        return binding.root
    }
}