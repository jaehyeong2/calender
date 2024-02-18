package jjfactory.calender.config

import jakarta.persistence.EntityListeners
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.domain.support.AuditingEntityListener

@EntityListeners(AuditingEntityListener::class)
@Configuration
class EntityConfig {
}