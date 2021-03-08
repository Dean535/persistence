package com.github.dean535.persistence.dao

import com.github.dean535.api.dao.BaseDao
import com.github.dean535.persistence.entity.Branch
import org.springframework.stereotype.Repository

@Repository
interface BranchDao : BaseDao<Branch, Long>
