package com.github.dean535.permission.service

import com.github.dean535.api.service.BaseService
import com.github.dean535.permission.dao.BranchDao
import com.github.dean535.permission.entity.Branch
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BranchService(
    @Autowired
    val branchDao: BranchDao
) : BaseService<Branch, Long>(dao = branchDao)
