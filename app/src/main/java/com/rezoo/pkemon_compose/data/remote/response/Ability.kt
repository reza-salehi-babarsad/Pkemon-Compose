package com.rezoo.pkemon_compose.data.remote.response

data class Ability(
    val ability: com.rezoo.pkemon_compose.data.remote.response.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)