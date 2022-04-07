package com.lopezalex.foody.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.lopezalex.foody.models.FoodRecipe
import com.lopezalex.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}