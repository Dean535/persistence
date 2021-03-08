package com.github.dean535.permission.controller.base

import com.github.dean535.api.controller.BaseController
import com.github.dean535.permission.entity.Permission
import com.github.dean535.json.GraphRender
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.util.UriComponentsBuilder

@Transactional
abstract class BasePermissionController : BaseController<Permission, Long>() {

    @GraphRender("com/github/dean535/permission")
    @GetMapping
    override fun page(request: HttpServletRequest, @RequestParam filter: Map<String, String>, pageable: Pageable): ResponseEntity<*> {
        return super.page(request, filter,pageable)
    }

    @GraphRender("com/github/dean535/permission")
    @GetMapping("{id}")
    override fun findOne(@PathVariable id: Long, request: HttpServletRequest): ResponseEntity<*> {
        return super.findOne(id, request)
    }

    @PostMapping
    override fun saveOne(@Validated @RequestBody input: Permission, request: HttpServletRequest, uriComponent: UriComponentsBuilder): ResponseEntity<*> {
        return super.saveOne(input, request, uriComponent)
    }

    @PutMapping("{id}")
    override fun updateOne(@PathVariable id: Long, @Validated @RequestBody input: Permission, request: HttpServletRequest): ResponseEntity<*> {
        return super.updateOne(id, input, request)
    }

    @DeleteMapping("{id}")
    override fun deleteOne(@PathVariable id: Long, request: HttpServletRequest): ResponseEntity<*> {
       return super.deleteOne(id,request)
    }
}