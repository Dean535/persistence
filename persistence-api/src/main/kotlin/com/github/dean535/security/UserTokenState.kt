package com.github.dean535.security

data class UserTokenState(
    var userId: String? = null,
    var accessToken: String? = null,
    var expiresIn: Long? = null,
)