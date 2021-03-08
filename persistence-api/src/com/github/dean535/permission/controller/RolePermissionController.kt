package com.github.dean535.persistence.controller

import com.github.dean535.persistence.controller.base.BaseRolePermissionController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/role-permission")
class RolePermissionController : BaseRolePermissionController()