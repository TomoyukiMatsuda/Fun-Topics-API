package com.fun_topics_api.domain

import com.fun_topics_api.domain.model.CommonTopic

interface CommonTopicRepository {
    fun findAll(): List<CommonTopic>

    fun find(id: Int): CommonTopic?

    fun create(commonTopic: CommonTopic)

    fun delete(id: Int)
}
