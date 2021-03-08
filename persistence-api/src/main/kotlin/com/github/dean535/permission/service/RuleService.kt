package com.github.dean535.permission.service

import com.github.dean535.api.service.BaseService
import com.github.dean535.permission.dao.RuleDao
import com.github.dean535.permission.entity.Rule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class RuleService(
    @Autowired
    val dao: RuleDao
) : BaseService<Rule, Long>(dao = dao)



