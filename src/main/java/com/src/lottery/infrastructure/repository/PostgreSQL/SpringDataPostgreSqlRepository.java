package com.src.lottery.infrastructure.repository.PostgreSQL;


import com.src.lottery.domain.Lottery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SpringDataPostgreSqlRepository extends CrudRepository<Lottery, UUID> {

}
