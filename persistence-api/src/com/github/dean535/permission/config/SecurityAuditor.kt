package com.github.dean535.persistence.config

import com.github.dean535.persistence.entity.User
import org.springframework.data.domain.AuditorAware
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import java.util.*

@Component
class SecurityAuditor : AuditorAware<User> {

    override fun getCurrentAuditor(): Optional<User> {
        return Optional.of(SecurityContextHolder.getContext().authentication)
            .map { it.principal }
            .map { it as User }

    }
}
