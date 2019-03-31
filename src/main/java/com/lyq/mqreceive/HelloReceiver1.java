package com.lyq.mqreceive;


import com.lyq.constant.RabbitConstans;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiver1 {

    @RabbitListener(queues = RabbitConstans.TEST_QUEUE)
    public void process(String hello) {
        System.out.println("Receiver1  : " + hello);
    }

}
