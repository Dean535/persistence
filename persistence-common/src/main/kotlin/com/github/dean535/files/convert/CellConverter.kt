package com.github.dean535.files.convert

@FunctionalInterface
interface CellConverter {
    fun convert(value: String, obj: Any): Any
}
