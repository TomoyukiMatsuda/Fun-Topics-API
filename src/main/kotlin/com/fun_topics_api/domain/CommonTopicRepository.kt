package com.fun_topics_api.domain

import com.fun_topics_api.domain.model.CommonTopic

interface CommonTopicRepository {
    fun findAllCommonTopic(): List<CommonTopic>
}