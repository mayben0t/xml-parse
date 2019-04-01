package com.example.email.model;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-03-22 18:43
 **/
@Component
public class MqSender {

    @Autowired
    private AmqpTemplate template;

    public void send(){
        template.convertAndSend("queue","hello,rabbit~");
    }
}
