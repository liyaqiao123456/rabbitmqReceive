package com.lyq.mqreceive;


import com.lyq.constant.RabbitConstans;
import com.rabbitmq.client.Channel;
import com.rabbitmq.tools.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Date;

@Component
@Slf4j
@AllArgsConstructor
@RabbitListener(queues = {RabbitConstans.WORKORDER_EMP_QUEUE})
public class EmpReceiverListener {

    @RabbitHandler
    public void process(String userStr, Channel channel, Message message) throws IOException {
        log.info("EmpReceiverListener收到  : " + userStr + "收到时间" + new Date());
        log.info("message:" + message);
//        List<UserDto> userDtoList = JSONUtil.toList(JSONUtil.parseArray(userStr), UserDto.class);
//        if (!CollectionUtils.isEmpty(userDtoList)) {
//            userDtoList.stream().forEach(x -> {
//                Member member = new Member();
//                member.setUnionId(x.getId().toString());
//                member.setName(x.getName());
//                member.setEmail(x.getEmail());
//                member.setPhoneNumber(x.getPhone());
//                member.setEnable(x.getEnable());
//                memberService.saveOrUpDateByUnionId(member);
//            });
//        } else {
//            log.info("从mq获得了空数据");
//        }
        //丢弃消息
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        log.info("接收消息成功");
    }

}
