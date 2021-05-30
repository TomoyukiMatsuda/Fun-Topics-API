package com.fun_topics_api.application.service

import com.fun_topics_api.domain.CommonTopicRepository
import com.fun_topics_api.domain.model.CommonTopic
import org.springframework.stereotype.Service

@Service
class CommonTopicService(
    private val commonTopicRepository: CommonTopicRepository
) {

    fun getCommonTopics(): List<CommonTopic> {
        return commonTopicRepository.findAllCommonTopic()
    }
}