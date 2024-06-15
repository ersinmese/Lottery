package com.src.lottery.domain;

import lombok.Getter;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public class Lottery {

    public UUID id;
    public List<Integer> numbers;
    public LotteryStatus status;
    public LocalDateTime creationDate;
    public LocalDateTime expirationDate;

    public Lottery(UUID id){
        this.id = id;
        this.status = LotteryStatus.CREATED;
        this.creationDate = LocalDateTime.now();
        this.expirationDate = creationDate.plusDays(3);
        this.numbers = generateLotteryNumbers();
    }

    public  void activateLottery(){
        status = LotteryStatus.ACTIVE;
    }

    public void lotteryTimeFormatter(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        creationDate.format(formatter);
        expirationDate.format(formatter);
    }

    public List<Integer> generateLotteryNumbers(){
        List<Integer> numbers = Arrays.asList(new Integer[6]);
        Random random = new Random();

        for(int i=0; i<6; i++){
            numbers.add(random.nextInt());
        }
        return numbers;
    }
}
