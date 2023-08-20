package com.rezoo.pkemon_compose.data.remote.response

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<com.rezoo.pkemon_compose.data.remote.response.Result>
)