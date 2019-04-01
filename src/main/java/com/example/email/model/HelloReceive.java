package com.example.email.model;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-03-23 00:08
 **/
@Component
public class HelloReceive {

//    @RabbitListener(queues="queue")
//    public void processC(String str){
//        System.out.println("Received:"+str);
//    }
}
