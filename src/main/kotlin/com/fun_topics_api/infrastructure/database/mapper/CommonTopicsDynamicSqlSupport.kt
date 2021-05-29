/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.fun_topics_api.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.SqlTable

object CommonTopicsDynamicSqlSupport {
    object CommonTopics : SqlTable("common_topics") {
        val id = column<Int>("id", JDBCType.INTEGER)

        val createdAt = column<LocalDateTime>("created_at", JDBCType.TIMESTAMP)

        val updatedAt = column<LocalDateTime>("updated_at", JDBCType.TIMESTAMP)

        val content = column<String>("content", JDBCType.LONGVARCHAR)
    }
}