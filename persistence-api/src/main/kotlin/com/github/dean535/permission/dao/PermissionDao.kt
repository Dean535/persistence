package com.github.dean535.permission.dao

import com.github.dean535.api.dao.BaseDao
import com.github.dean535.permission.entity.Permission
import org.springframework.stereotype.Repository

@Repository
interface PermissionDao : BaseDao<Permission, Long>
