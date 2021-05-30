package com.fun_topics_api.infrastructure.database.repository

import com.fun_topics_api.domain.CommonTopicRepository
import com.fun_topics_api.domain.model.CommonTopic
import com.fun_topics_api.infrastructure.database.mapper.CommonTopicsMapper
import com.fun_topics_api.infrastructure.database.record.CommonTopicsRecord
import org.springframework.stereotype.Repository

@Repository
class CommonTopicRepositoryImpl(
    private val commonTopicsMapper: CommonTopicsMapper
) : CommonTopicRepository {

    override fun findAllCommonTopic(): List<CommonTopic> {
        return commonTopicsMapper.findAll().map { toModel(it) }
    }

    private fun toModel(record: CommonTopicsRecord): CommonTopic {
         return CommonTopic(
            record.id!!,
            record.content!!
        )
    }
}