package com.github.dean535.persistence.config

import com.github.dean535.api.dao.BaseDaoImpl
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableJpaAuditing(
    dateTimeProviderRef = "customDateTimeProvider",
    auditorAwareRef = "securityAuditor"
)
@EnableJpaRepositories(
    basePackages = [
        "com.github.dean535.*.dao"
    ], repositoryBaseClass = BaseDaoImpl::class
)
@EnableTransactionManagement
class JpaConfig
