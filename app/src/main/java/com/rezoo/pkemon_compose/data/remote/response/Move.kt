package com.rezoo.pkemon_compose.data.remote.response

data class Move(
    val move: com.rezoo.pkemon_compose.data.remote.response.MoveX,
    val version_group_details: List<com.rezoo.pkemon_compose.data.remote.response.VersionGroupDetail>
)