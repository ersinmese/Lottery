package com.src.lottery.infrastructure.configuration;

import com.src.lottery.LotteryApplication;
import com.src.lottery.domain.repository.LotteryRepository;
import com.src.lottery.domain.service.DomainLotteryService;
import com.src.lottery.domain.service.LotteryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = LotteryApplication.class)
public class BeanConfiguration {

    @Bean
    LotteryService lotteryService(final LotteryRepository lotteryRepository){
        return  new DomainLotteryService(lotteryRepository);
    }
}
