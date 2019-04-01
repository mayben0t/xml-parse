package com.example.email.controller;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-03-18 21:01
 **/
@Controller
@RequestMapping(value = "/email")
public class EmailController {

    private volatile int count=0;

    @GetMapping("/test")
    @ResponseBody
    public void test(){
//        synchronized (EmailController.class) {
//            System.out.println(count++);
//        }
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.qq.com");//指定用来发送Email的邮件服务器主机名
        mailSender.setPort(587);//默认端口，标准的SMTP端口
        mailSender.setUsername("594180536@qq.com");//用户名
        mailSender.setPassword("imeamsgbwhzubech");//密码

        System.out.print("cxcx");
        SimpleMailMessage message = new SimpleMailMessage();//消息构造器
        message.setFrom("594180536@qq.com");//发件人
        message.setTo("594180536@qq.com");//收件人
        message.setSubject("这是第"+count+"次");//主题
        message.setText("hello world!!");//正文
        mailSender.send(message);
        System.out.println("邮件发送完毕");
    }
}
