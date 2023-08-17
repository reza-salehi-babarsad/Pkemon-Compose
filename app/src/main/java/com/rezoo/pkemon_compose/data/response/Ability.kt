package com.rezoo.pkemon_compose.data.response

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)