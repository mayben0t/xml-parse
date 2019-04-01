package com.example.email.test;

import com.example.email.EmailApplication;
import com.example.email.model.MqSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-03-23 00:03
 **/
@SpringBootTest(classes = EmailApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
    @Autowired
    private MqSender mqSender;

    @Test
    public void testRabbit(){
        mqSender.send();
    }
}
