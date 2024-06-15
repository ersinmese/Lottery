package com.src.lottery.application.rest;

import com.src.lottery.application.response.CreateLotteryResponse;
import com.src.lottery.domain.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/lottery")
public class LotteryController {
    private final LotteryService lotteryService;

    @Autowired
    public LotteryController(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    CreateLotteryResponse createLottery() {
      final UUID id = lotteryService.createLottery();

       return new CreateLotteryResponse(id);
    }

}
