package com.lopezalex.foody.data

import com.lopezalex.foody.data.network.FoodRecipesApi
import com.lopezalex.foody.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val foodRecipesApi: FoodRecipesApi) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }
}

