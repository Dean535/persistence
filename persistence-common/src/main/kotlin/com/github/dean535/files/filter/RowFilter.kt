package com.github.dean535.files.filter

@FunctionalInterface
interface RowFilter {
    fun doFilter(rowNum: Int, list: List<String>): Boolean
}
