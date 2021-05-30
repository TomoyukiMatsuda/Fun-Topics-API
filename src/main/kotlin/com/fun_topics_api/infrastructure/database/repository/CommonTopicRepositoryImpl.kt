package com.fun_topics_api.infrastructure.database.repository

import com.fun_topics_api.domain.CommonTopicRepository
import com.fun_topics_api.domain.model.CommonTopic
import com.fun_topics_api.infrastructure.database.mapper.CommonTopicsMapper
import com.fun_topics_api.infrastructure.database.record.CommonTopicsRecord
import com.fun_topics_api.infrastructure.database.mapper.insert
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
class CommonTopicRepositoryImpl(
    private val commonTopicsMapper: CommonTopicsMapper
) : CommonTopicRepository {

    override fun findAll(): List<CommonTopic> {
        return commonTopicsMapper.findAll().map { toModel(it) }
    }

    override fun create(commonTopic: CommonTopic) {
        // recordをいれる
        commonTopicsMapper.insert(toRecord(commonTopic))
    }

    private fun toModel(record: CommonTopicsRecord): CommonTopic {
        // TODO: 「!!」避けたい
         return CommonTopic(
            record.id!!,
            record.content!!
        )
    }

    private fun toRecord(model: CommonTopic): CommonTopicsRecord {
        // TODO: id はインクリメントされるようにする
        return CommonTopicsRecord(
            model.id,
            model.content,
            LocalDateTime.now(),
            LocalDateTime.now()
        )
    }
}
