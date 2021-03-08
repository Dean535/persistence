package com.github.dean535.permission.dao


import com.github.dean535.permission.DatabaseCleanupService
import com.github.dean535.permission.config.CustomDateTimeProvider
import com.github.dean535.permission.config.TestJpaConfig
import org.junit.jupiter.api.AfterEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType
import org.springframework.data.auditing.config.AuditingConfiguration

@DataJpaTest(
        includeFilters = [ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = [AuditingConfiguration::class, TestJpaConfig::class,
                    CustomDateTimeProvider::class, DatabaseCleanupService::class,
                    JpaRepositoriesAutoConfiguration::class]
        )]
)

class AbstractJpaTest {
    @Autowired
    private lateinit var truncateDatabaseService: DatabaseCleanupService


    @AfterEach
    fun cleanupAfterEach() {
        truncateDatabaseService.truncate()
    }

}