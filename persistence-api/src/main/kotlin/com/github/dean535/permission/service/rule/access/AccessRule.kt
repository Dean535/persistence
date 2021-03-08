package com.github.dean535.permission.service.rule.access

import com.github.dean535.permission.entity.Permission


interface AccessRule {

    val ruleName: String

    fun exec(permission: Permission): Map<String, String>
}
