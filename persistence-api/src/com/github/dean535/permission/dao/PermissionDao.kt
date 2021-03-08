package com.github.dean535.persistence.dao

import com.github.dean535.api.dao.BaseDao
import com.github.dean535.persistence.entity.Permission
import org.springframework.stereotype.Repository

@Repository
interface PermissionDao : BaseDao<Permission, Long>
