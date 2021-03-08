package com.github.dean535.json


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class GraphRender(
        val entity: String
)