package com.lyq.rabbitmq_receive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages= {"com.lyq.*"})
public class RabbitmqReceiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqReceiveApplication.class, args);
    }

}

