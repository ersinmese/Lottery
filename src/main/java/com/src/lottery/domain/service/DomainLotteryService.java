package com.src.lottery.domain.service;


import com.src.lottery.domain.Lottery;
import com.src.lottery.domain.repository.LotteryRepository;

import java.util.UUID;

public class DomainLotteryService implements LotteryService {

    private final LotteryRepository lotteryRepository;

    public DomainLotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    @Override
    public UUID createLottery(){
        Lottery lottery = new Lottery(UUID.randomUUID());
        lottery.lotteryTimeFormatter();
        lottery.activateLottery();

        return lottery.getId();
    }

}
