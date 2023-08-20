package com.rezoo.pkemon_compose.data.remote.response

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.rezoo.pkemon_compose.data.remote.response.StatX
)