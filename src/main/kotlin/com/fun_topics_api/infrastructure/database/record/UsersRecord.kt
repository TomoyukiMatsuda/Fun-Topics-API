/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.fun_topics_api.infrastructure.database.record

import com.fun_topics_api.domain.enum.RoleType
import java.time.LocalDateTime

data class UsersRecord(
    var id: Int? = null,
    var name: String? = null,
    var password: String? = null,
    var roleType: RoleType? = null,
    var createdAt: LocalDateTime? = null,
    var updatedAt: LocalDateTime? = null
)