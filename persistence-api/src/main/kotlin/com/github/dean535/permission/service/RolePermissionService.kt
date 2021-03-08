package com.github.dean535.permission.service

import com.github.dean535.api.service.BaseService
import com.github.dean535.permission.dao.RolePermissionDao
import com.github.dean535.permission.entity.RolePermission
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class RolePermissionService(
    @Autowired
    val dao: RolePermissionDao
) : BaseService<RolePermission, Long>(dao = dao)



