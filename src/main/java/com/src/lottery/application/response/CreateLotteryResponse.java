package com.src.lottery.application.response;


import lombok.Getter;

import java.util.UUID;

@Getter
public class CreateLotteryResponse {
    private final UUID id;

    public CreateLotteryResponse(final UUID id){
        this.id = id;

    }
}
