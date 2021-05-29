/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.fun_topics_api.infrastructure.database.mapper

import com.fun_topics_api.domain.enum.RoleType
import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.SqlTable

object UsersDynamicSqlSupport {
    object Users : SqlTable("users") {
        val id = column<Int>("id", JDBCType.INTEGER)

        val name = column<String>("name", JDBCType.VARCHAR)

        val password = column<String>("password", JDBCType.VARCHAR)

        val roleType = column<RoleType>("role_type", JDBCType.CHAR, "org.apache.ibatis.type.EnumTypeHandler")

        val createdAt = column<LocalDateTime>("created_at", JDBCType.TIMESTAMP)

        val updatedAt = column<LocalDateTime>("updated_at", JDBCType.TIMESTAMP)
    }
}