/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.fun_topics_api.infrastructure.database.mapper

import com.fun_topics_api.infrastructure.database.mapper.UsersDynamicSqlSupport.Users
import com.fun_topics_api.infrastructure.database.mapper.UsersDynamicSqlSupport.Users.createdAt
import com.fun_topics_api.infrastructure.database.mapper.UsersDynamicSqlSupport.Users.id
import com.fun_topics_api.infrastructure.database.mapper.UsersDynamicSqlSupport.Users.name
import com.fun_topics_api.infrastructure.database.mapper.UsersDynamicSqlSupport.Users.password
import com.fun_topics_api.infrastructure.database.mapper.UsersDynamicSqlSupport.Users.roleType
import com.fun_topics_api.infrastructure.database.mapper.UsersDynamicSqlSupport.Users.updatedAt
import com.fun_topics_api.infrastructure.database.record.UsersRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UsersMapper.count(completer: CountCompleter) =
    countFrom(this::count, Users, completer)

fun UsersMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Users, completer)

fun UsersMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where(id, isEqualTo(id_))
    }

fun UsersMapper.insert(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(id).toProperty("id")
        map(name).toProperty("name")
        map(password).toProperty("password")
        map(roleType).toProperty("roleType")
        map(createdAt).toProperty("createdAt")
        map(updatedAt).toProperty("updatedAt")
    }

fun UsersMapper.insertMultiple(records: Collection<UsersRecord>) =
    insertMultiple(this::insertMultiple, records, Users) {
        map(id).toProperty("id")
        map(name).toProperty("name")
        map(password).toProperty("password")
        map(roleType).toProperty("roleType")
        map(createdAt).toProperty("createdAt")
        map(updatedAt).toProperty("updatedAt")
    }

fun UsersMapper.insertMultiple(vararg records: UsersRecord) =
    insertMultiple(records.toList())

fun UsersMapper.insertSelective(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(name).toPropertyWhenPresent("name", record::name)
        map(password).toPropertyWhenPresent("password", record::password)
        map(roleType).toPropertyWhenPresent("roleType", record::roleType)
        map(createdAt).toPropertyWhenPresent("createdAt", record::createdAt)
        map(updatedAt).toPropertyWhenPresent("updatedAt", record::updatedAt)
    }

private val columnList = listOf(id, name, password, roleType, createdAt, updatedAt)

fun UsersMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Users, completer)

fun UsersMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectByPrimaryKey(id_: Int) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun UsersMapper.update(completer: UpdateCompleter) =
    update(this::update, Users, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UsersRecord) =
    apply {
        set(id).equalTo(record::id)
        set(name).equalTo(record::name)
        set(password).equalTo(record::password)
        set(roleType).equalTo(record::roleType)
        set(createdAt).equalTo(record::createdAt)
        set(updatedAt).equalTo(record::updatedAt)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UsersRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(name).equalToWhenPresent(record::name)
        set(password).equalToWhenPresent(record::password)
        set(roleType).equalToWhenPresent(record::roleType)
        set(createdAt).equalToWhenPresent(record::createdAt)
        set(updatedAt).equalToWhenPresent(record::updatedAt)
    }

fun UsersMapper.updateByPrimaryKey(record: UsersRecord) =
    update {
        set(name).equalTo(record::name)
        set(password).equalTo(record::password)
        set(roleType).equalTo(record::roleType)
        set(createdAt).equalTo(record::createdAt)
        set(updatedAt).equalTo(record::updatedAt)
        where(id, isEqualTo(record::id))
    }

fun UsersMapper.updateByPrimaryKeySelective(record: UsersRecord) =
    update {
        set(name).equalToWhenPresent(record::name)
        set(password).equalToWhenPresent(record::password)
        set(roleType).equalToWhenPresent(record::roleType)
        set(createdAt).equalToWhenPresent(record::createdAt)
        set(updatedAt).equalToWhenPresent(record::updatedAt)
        where(id, isEqualTo(record::id))
    }