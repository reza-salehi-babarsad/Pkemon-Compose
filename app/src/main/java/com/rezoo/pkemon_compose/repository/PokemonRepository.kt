package com.rezoo.pkemon_compose.repository

import com.rezoo.pkemon_compose.data.remote.PokeApi
import com.rezoo.pkemon_compose.data.remote.response.Pokemon
import com.rezoo.pkemon_compose.data.remote.response.PokemonList
import com.rezoo.pkemon_compose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.time.ZoneOffset
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    val api:PokeApi
) {

    suspend fun getPokemonList(limit:Int , offset:Int):Resource<PokemonList>{
        val response =
            try {
                api.getPokemonList(limit,offset)
            }catch (e:Exception){
                return Resource.Error("Error ")
            }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName:String):Resource<Pokemon>{
        val response=
            try {
                api.getPokemonInfo(pokemonName)
            }catch (e:Exception){
                return Resource.Error("Here is Uncaught Error")
            }
        return Resource.Success(response)
    }
}