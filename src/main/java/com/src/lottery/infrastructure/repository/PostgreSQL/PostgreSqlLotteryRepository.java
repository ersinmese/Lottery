package com.src.lottery.infrastructure.PostgreSQL;

import com.src.lottery.domain.Lottery;
import com.src.lottery.domain.repository.LotteryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.UUID;


public class PostgreSqlLotteryRepository implements LotteryRepository {

    private final SpringDataPostgreSqlRepository lotteryRepository;

    @Autowired
    public PostgreSqlLotteryRepository(final SpringDataPostgreSqlRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    @Override
    public Optional<Lottery> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void save(Lottery lottery) {

    }
}
