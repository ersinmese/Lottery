package com.src.lottery.infrastructure.configuration;

import com.src.lottery.infrastructure.repository.PostgreSQL.SpringDataPostgreSqlRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = SpringDataPostgreSqlRepository.class)
public class PostgreSqlConfiguration {
}
