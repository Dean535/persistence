package com.github.dean535.files.parser

interface RowProcessor {
    fun exec(model: Any, list: List<String>, rowIndex: Int)
}
