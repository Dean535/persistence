package com.github.dean535.files.convert

import org.apache.commons.lang3.math.NumberUtils

class IntCellConverter : CellConverter {
    override fun convert(value: String, obj: Any): Any {
        return NumberUtils.toInt(value)
    }


}