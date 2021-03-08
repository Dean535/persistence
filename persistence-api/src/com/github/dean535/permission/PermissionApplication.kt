package com.github.dean535.persistence

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration

@SpringBootApplication(
    scanBasePackages = [
        "com.github.dean535.*"
    ],
    exclude = [
        SecurityAutoConfiguration::class,
        ApplicationAvailabilityAutoConfiguration::class]
)
class PermissionApplication