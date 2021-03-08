package com.github.dean535.permission.dao

import com.github.dean535.api.dao.BaseDao
import com.github.dean535.permission.entity.Rule
import org.springframework.stereotype.Repository

@Repository
interface RuleDao : BaseDao<Rule, Long>
