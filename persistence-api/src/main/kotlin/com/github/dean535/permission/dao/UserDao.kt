package com.github.dean535.permission.dao

import com.github.dean535.api.dao.BaseDao
import com.github.dean535.permission.entity.User
import org.springframework.stereotype.Repository

@Repository
interface UserDao : BaseDao<User, Long> {
    fun findByUsernameAndClientId(username: String, domain: String): User?
}
