package com.github.dean535.persistence.service

import com.github.dean535.api.service.BaseService
import com.github.dean535.persistence.dao.RoleDao
import com.github.dean535.persistence.entity.Role
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class RoleService(
    @Autowired
    val dao: RoleDao
) : BaseService<Role, Long>(dao = dao)



