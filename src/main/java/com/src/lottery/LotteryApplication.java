package com.src.lottery;

import com.src.lottery.application.rest.LotteryController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties"})
public class LotteryApplication {

    private final LotteryController lotteryController;

    public LotteryApplication(LotteryController lotteryController) {
        this.lotteryController = lotteryController;
    }

    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class, args);
    }

}
