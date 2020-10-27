package com.mattar.food_recipes.model.repository

import com.google.common.truth.Truth.assertThat
import com.mattar.food_recipes.MainCoroutineRule
import com.mattar.food_recipes.model.data.recipe.Recipe
import com.mattar.food_recipes.model.data.recipe.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class RecipeRepositoryImplTest {
    private val recipe1 = Recipe(
        "0",
        "0",
        "https://en.wikipedia.org/wiki/Cucumber#:~:text=Cucumber%20(Cucumis%20sativus)%20is%20a,several%20cultivars%20have%20been%20created.",
        "Egypt",
        listOf("Cucumber"),
        "Cucumber is a widely-cultivated creeping vine plant in the Cucurbitaceae gourd family that bears cucumiform fruits, which are used as vegetables. There are three main varieties of cucumber—slicing, pickling, and burpless/seedless—within which several cultivars have been created. Wikipedia",
        0,
        "0",
        100,
        "",
        "widely-cultivated creeping vine plant in the Cucurbitaceae gourd family",
        true,
        "53314247ff604d44808b4569",
        "https://upload.wikimedia.org/wikipedia/commons/9/96/ARS_cucumber.jpg",
        "null",
        emptyList(),
        emptyList(),
        "Cucumber",
        emptyList(),
        "",
        5.0,
        1000,
        "https://upload.wikimedia.org/wikipedia/commons/9/96/ARS_cucumber.jpg",
        "PT30M",
        emptyList(),
        User("osama.mattar.sd@gmail.com", "Egypt", "Osama Mattar"),
        emptyList()
    )
    private val recipe2 = Recipe(
        "0",
        "0",
        "https://en.wikipedia.org/wiki/Cucumber#:~:text=Cucumber%20(Cucumis%20sativus)%20is%20a,several%20cultivars%20have%20been%20created.",
        "Egypt",
        listOf("Carrot"),
        "Cucumber is a widely-cultivated creeping vine plant in the Cucurbitaceae gourd family that bears cucumiform fruits, which are used as vegetables. There are three main varieties of cucumber—slicing, pickling, and burpless/seedless—within which several cultivars have been created. Wikipedia",
        0,
        "0",
        100,
        "",
        "widely-cultivated creeping vine plant in the Cucurbitaceae gourd family",
        true,
        "53314247ff604d44808b4569",
        "https://www.burpee.com/dw/image/v2/ABAQ_PRD/on/demandware.static/-/Sites-masterCatalog_Burpee/default/dwa74e0ebb/Images/Product%20Images/prod000632/prod000632.jpg?sw=322&sh=380&sm=fit",
        "null",
        emptyList(),
        emptyList(),
        "Carrot",
        emptyList(),
        "",
        5.0,
        1000,
        "https://www.burpee.com/dw/image/v2/ABAQ_PRD/on/demandware.static/-/Sites-masterCatalog_Burpee/default/dwa74e0ebb/Images/Product%20Images/prod000632/prod000632.jpg?sw=322&sh=380&sm=fit",
        "PT30M",
        emptyList(),
        User("osama.mattar.sd@gmail.com", "Egypt", "Osama Mattar"),
        emptyList()
    )
    private val recipe3 = Recipe(
        "0",
        "0",
        "https://en.wikipedia.org/wiki/Cucumber#:~:text=Cucumber%20(Cucumis%20sativus)%20is%20a,several%20cultivars%20have%20been%20created.",
        "Egypt",
        listOf("Eggplant"),
        "Cucumber is a widely-cultivated creeping vine plant in the Cucurbitaceae gourd family that bears cucumiform fruits, which are used as vegetables. There are three main varieties of cucumber—slicing, pickling, and burpless/seedless—within which several cultivars have been created. Wikipedia",
        0,
        "0",
        100,
        "",
        "widely-cultivated creeping vine plant in the Cucurbitaceae gourd family",
        true,
        "53314247ff604d44808b4569",
        "https://upload.wikimedia.org/wikipedia/commons/9/96/ARS_cucumber.jpg",
        "null",
        emptyList(),
        emptyList(),
        "Eggplant",
        emptyList(),
        "",
        5.0,
        1000,
        "https://upload.wikimedia.org/wikipedia/commons/9/96/ARS_cucumber.jpg",
        "PT30M",
        emptyList(),
        User("osama.mattar.sd@gmail.com", "Egypt", "Osama Mattar"),
        emptyList()
    )

    private lateinit var recipeRepositoryImpl: RecipeRepositoryImpl

    // Set the main coroutines dispatcher for unit testing.
    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @ExperimentalCoroutinesApi
    @Before
    fun createRepository() {
        // Get a reference to the class under test
        recipeRepositoryImpl = RecipeRepositoryImpl(mutableListOf(recipe1, recipe2, recipe3))
    }

    @ExperimentalCoroutinesApi
    @Test
    fun getRecipes() = mainCoroutineRule.runBlockingTest {
        val recipesList = recipeRepositoryImpl.getRecipes()
        assertThat(recipesList[0].name).isEqualTo("Cucumber")
    }
}