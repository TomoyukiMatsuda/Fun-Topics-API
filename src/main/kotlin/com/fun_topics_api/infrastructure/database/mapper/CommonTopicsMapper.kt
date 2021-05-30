/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.fun_topics_api.infrastructure.database.mapper

import com.fun_topics_api.infrastructure.database.record.CommonTopicsRecord
import org.apache.ibatis.annotations.*
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface CommonTopicsMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<CommonTopicsRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<CommonTopicsRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("CommonTopicsRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): CommonTopicsRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="CommonTopicsRecordResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<CommonTopicsRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int

    // テーブルレコード全件取得
    @Select("SELECT * FROM COMMON_TOPICS")
    fun findAll(): List<CommonTopicsRecord>
}