package com.github.dean535.persistence.service

import com.github.b1412.api.service.BaseService
import com.github.dean535.persistence.dao.BranchDao
import com.github.dean535.persistence.entity.Branch
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BranchService(
    @Autowired
    val branchDao: BranchDao
) : BaseService<Branch, Long>(dao = branchDao)
