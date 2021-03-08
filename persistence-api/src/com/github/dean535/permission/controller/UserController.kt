package com.github.dean535.persistence.controller

import com.github.dean535.persistence.controller.base.BaseUserController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/user")
class UserController : BaseUserController()