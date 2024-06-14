package com.src.lottery.domain.repository;


import java.util.Optional;
import java.util.UUID;
import com.src.lottery.domain.Lottery;

public interface LotteryRepository {
    Optional<Lottery> findById(UUID id);
    void save(Lottery lottery);
}
