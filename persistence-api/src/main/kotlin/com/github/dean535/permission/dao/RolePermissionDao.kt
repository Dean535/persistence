package com.github.dean535.permission.dao

import com.github.dean535.api.dao.BaseDao
import com.github.dean535.permission.entity.RolePermission
import org.springframework.stereotype.Repository

@Repository
interface RolePermissionDao : BaseDao<RolePermission, Long>
