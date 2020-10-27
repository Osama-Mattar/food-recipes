package com.mattar.food_recipes.model.data.recipe

import java.io.Serializable

data class Recipe(
    val calories: String,
    val carbos: String,
    val card: String,
    val country: String,
    val deliverable_ingredients: List<String>,
    val description: String,
    val difficulty: Int,
    val fats: String,
    val favorites: Int,
    val fibers: String,
    val headline: String,
    val highlighted: Boolean,
    val id: String,
    val image: String,
    val incompatibilities: String,
    val ingredients: List<String>,
    val keywordswords: List<String>,
    val name: String,
    val products: List<String>,
    val proteins: String,
    val rating: Double,
    val ratings: Int,
    val thumb: String,
    val time: String,
    val undeliverable_ingredients: List<String>,
    val user: User,
    val weeks: List<String>
) : Serializable