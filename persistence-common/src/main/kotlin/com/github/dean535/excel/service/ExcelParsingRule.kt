package com.github.dean535.excel.service

import com.github.dean535.files.parser.FileParser


interface ExcelParsingRule<T> {

    val fileParser: FileParser

    val entityClass: Class<*>

    val ruleName: String

    fun process(data: List<T>)
}
