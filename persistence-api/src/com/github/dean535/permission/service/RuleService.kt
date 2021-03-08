package com.github.dean535.persistence.service

import com.github.dean535.api.service.BaseService
import com.github.dean535.persistence.dao.RuleDao
import com.github.dean535.persistence.entity.Rule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class RuleService(
    @Autowired
    val dao: RuleDao
) : BaseService<Rule, Long>(dao = dao)



