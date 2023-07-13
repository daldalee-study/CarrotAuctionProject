package com.carrot_auction.carrot_auction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 자동 입력 설정
public class CarrotAuctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrotAuctionApplication.class, args);
    }

}
