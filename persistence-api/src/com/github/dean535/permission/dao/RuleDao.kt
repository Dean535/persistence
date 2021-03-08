package com.github.dean535.persistence.dao

import com.github.b1412.api.dao.BaseDao
import com.github.dean535.persistence.entity.Rule
import org.springframework.stereotype.Repository

@Repository
interface RuleDao : BaseDao<Rule, Long>
