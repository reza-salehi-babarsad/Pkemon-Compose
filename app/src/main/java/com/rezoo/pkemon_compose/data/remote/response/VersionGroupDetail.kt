package com.rezoo.pkemon_compose.data.remote.response

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.rezoo.pkemon_compose.data.remote.response.MoveLearnMethod,
    val version_group: com.rezoo.pkemon_compose.data.remote.response.VersionGroup
)