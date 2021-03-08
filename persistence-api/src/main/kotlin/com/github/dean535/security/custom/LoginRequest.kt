package com.github.dean535.security.custom

data class LoginRequest(
    var username: String,
    var password: String,
    var clientId: String = "4"
)