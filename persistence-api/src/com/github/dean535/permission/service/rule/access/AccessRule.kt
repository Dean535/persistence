package com.github.dean535.persistence.service.rule.access

import com.github.dean535.persistence.entity.Permission


interface AccessRule {

    val ruleName: String

    fun exec(permission: Permission): Map<String, String>
}
