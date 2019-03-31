package com.lyq.conf.mq;

import com.lyq.constant.RabbitConstans;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * mq初始化配置
 */
@Configuration
public class RabbitMqConf{
    @Autowired
    TestProperty testProperty;

    /**
     * test  交换机，路由key，队列关系 配置
     */
    @Bean
    public Queue testQueue(){
        return new Queue(RabbitConstans.TEST_QUEUE);
    }
    @Bean
    TopicExchange testTopicExchange(){
        return new TopicExchange(testProperty.getMq().getExchange());
    }
    @Bean
    Binding  testBindingExchangeMessage(Queue testQueue,TopicExchange testTopicExchange){
        return BindingBuilder.bind(testQueue).to(testTopicExchange).with(testProperty.getMq().getRoutingKey());
    }



}
