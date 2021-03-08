package com.github.dean535.permission.dao

import com.github.dean535.api.dao.BaseDao
import com.github.dean535.permission.entity.Role
import org.springframework.stereotype.Repository

@Repository
interface RoleDao : BaseDao<Role, Long>
