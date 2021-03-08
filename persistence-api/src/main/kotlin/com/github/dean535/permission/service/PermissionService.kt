package com.github.dean535.permission.service

import com.github.dean535.api.service.BaseService
import com.github.dean535.permission.dao.PermissionDao
import com.github.dean535.permission.entity.Permission
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class PermissionService(
    @Autowired
    val dao: PermissionDao
) : BaseService<Permission, Long>(dao = dao)



