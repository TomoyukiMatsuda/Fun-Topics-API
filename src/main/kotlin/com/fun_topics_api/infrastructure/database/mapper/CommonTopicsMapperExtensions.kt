/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.fun_topics_api.infrastructure.database.mapper

import com.fun_topics_api.infrastructure.database.mapper.CommonTopicsDynamicSqlSupport.CommonTopics
import com.fun_topics_api.infrastructure.database.mapper.CommonTopicsDynamicSqlSupport.CommonTopics.content
import com.fun_topics_api.infrastructure.database.mapper.CommonTopicsDynamicSqlSupport.CommonTopics.createdAt
import com.fun_topics_api.infrastructure.database.mapper.CommonTopicsDynamicSqlSupport.CommonTopics.id
import com.fun_topics_api.infrastructure.database.mapper.CommonTopicsDynamicSqlSupport.CommonTopics.updatedAt
import com.fun_topics_api.infrastructure.database.record.CommonTopicsRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun CommonTopicsMapper.count(completer: CountCompleter) =
    countFrom(this::count, CommonTopics, completer)

fun CommonTopicsMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, CommonTopics, completer)

fun CommonTopicsMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where(id, isEqualTo(id_))
    }

fun CommonTopicsMapper.insert(record: CommonTopicsRecord) =
    insert(this::insert, record, CommonTopics) {
        map(id).toProperty("id")
        map(createdAt).toProperty("createdAt")
        map(updatedAt).toProperty("updatedAt")
        map(content).toProperty("content")
    }

fun CommonTopicsMapper.insertMultiple(records: Collection<CommonTopicsRecord>) =
    insertMultiple(this::insertMultiple, records, CommonTopics) {
        map(id).toProperty("id")
        map(createdAt).toProperty("createdAt")
        map(updatedAt).toProperty("updatedAt")
        map(content).toProperty("content")
    }

fun CommonTopicsMapper.insertMultiple(vararg records: CommonTopicsRecord) =
    insertMultiple(records.toList())

fun CommonTopicsMapper.insertSelective(record: CommonTopicsRecord) =
    insert(this::insert, record, CommonTopics) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(createdAt).toPropertyWhenPresent("createdAt", record::createdAt)
        map(updatedAt).toPropertyWhenPresent("updatedAt", record::updatedAt)
        map(content).toPropertyWhenPresent("content", record::content)
    }

private val columnList = listOf(id, createdAt, updatedAt, content)

fun CommonTopicsMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, CommonTopics, completer)

fun CommonTopicsMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, CommonTopics, completer)

fun CommonTopicsMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, CommonTopics, completer)

fun CommonTopicsMapper.selectByPrimaryKey(id_: Int) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun CommonTopicsMapper.update(completer: UpdateCompleter) =
    update(this::update, CommonTopics, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: CommonTopicsRecord) =
    apply {
        set(id).equalTo(record::id)
        set(createdAt).equalTo(record::createdAt)
        set(updatedAt).equalTo(record::updatedAt)
        set(content).equalTo(record::content)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: CommonTopicsRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(createdAt).equalToWhenPresent(record::createdAt)
        set(updatedAt).equalToWhenPresent(record::updatedAt)
        set(content).equalToWhenPresent(record::content)
    }

fun CommonTopicsMapper.updateByPrimaryKey(record: CommonTopicsRecord) =
    update {
        set(createdAt).equalTo(record::createdAt)
        set(updatedAt).equalTo(record::updatedAt)
        set(content).equalTo(record::content)
        where(id, isEqualTo(record::id))
    }

fun CommonTopicsMapper.updateByPrimaryKeySelective(record: CommonTopicsRecord) =
    update {
        set(createdAt).equalToWhenPresent(record::createdAt)
        set(updatedAt).equalToWhenPresent(record::updatedAt)
        set(content).equalToWhenPresent(record::content)
        where(id, isEqualTo(record::id))
    }