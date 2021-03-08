package com.github.dean535.permission.excel

import com.github.dean535.permission.entity.Role
import com.github.dean535.excel.service.ExcelParsingRule
import com.github.dean535.files.parser.FileParser
import com.github.dean535.excel.convertor.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager


@Component
class RoleExcelParsingRule(
        @Autowired
        val entityManager: EntityManager

) : ExcelParsingRule<Role> {

    override val fileParser: FileParser
    get() {
        val fileParser = FileParser()
        fileParser.start = 1
    fileParser.addCell(1, "name")
    fileParser.addCell(2, "users")
    fileParser.addCell(3, "rolePermissions")
    fileParser.addCell(4, "id", LongConvertor())
    fileParser.addCell(5, "version", LongConvertor())
    fileParser.addCell(6, "createdAt")
    fileParser.addCell(7, "updatedAt")
    fileParser.addCell(8, "deletedAt")
        fileParser.addCell(2, "category", EntityConvertor().apply {
                name = "Creator"
                em = entityManager
        })
        fileParser.addCell(2, "category", EntityConvertor().apply {
                name = "Modifier"
                em = entityManager
        })
        return fileParser
    }

    override val entityClass: Class<*>
    get() = Role::class.java

    override val ruleName: String
    get() = "role"

    override fun process(data: List<Role>) {
        data.forEach{
            entityManager.persist(it)
        }
    }
}
