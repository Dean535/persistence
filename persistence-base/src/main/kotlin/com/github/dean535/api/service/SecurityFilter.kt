package com.github.dean535.api.service

interface SecurityFilter {
    fun query(method: String, requestURI: String): Map<String, String>
}
