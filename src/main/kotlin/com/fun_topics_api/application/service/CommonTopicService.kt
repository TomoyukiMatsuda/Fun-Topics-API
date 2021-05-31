package com.fun_topics_api.application.service

import com.fun_topics_api.domain.CommonTopicRepository
import com.fun_topics_api.domain.model.CommonTopic
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CommonTopicService(
    private val commonTopicRepository: CommonTopicRepository
) {

    fun getCommonTopics(): List<CommonTopic> {
        return commonTopicRepository.findAll()
    }

    @Transactional
    fun createCommonTopic(commonTopic: CommonTopic) {
        // TODO: 現在は同じID情報があれば例外を投げるようにしている。
        //   本当は id 自動的に生成されるようにしたい
        commonTopicRepository.findAll().forEach {
            if (it.id == commonTopic.id) {
                throw IllegalArgumentException("すでに存在するIDです ${it.id}")
            }
        }
        commonTopicRepository.create(commonTopic)
    }

    @Transactional
    fun deleteCommonTopic(id: Int) {
        commonTopicRepository.find(id) ?: throw IllegalAccessException("存在しない共通トピックID: $id")
        commonTopicRepository.delete(id)
    }
}
