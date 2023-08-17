package com.rezoo.pkemon_compose.data.response

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)