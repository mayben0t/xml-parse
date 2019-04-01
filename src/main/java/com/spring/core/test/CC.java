package com.spring.core.test;

import jdk.internal.org.xml.sax.ContentHandler;
//import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-03-28 02:38
 **/
public class CC {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        /**解析步骤start**/
        //获取工厂实例
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //获取解析对象
        SAXParser parser = factory.newSAXParser();

        SAXParserHandler handler = new SAXParserHandler();
        /**解析步骤end**/
        parser.parse("bean.xml",handler);
        System.out.println("共有"+handler.getUserList().size()+"个人");
        for(User user:handler.getUserList()){
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getPassword());
            System.out.println("--finish--");
        }


    }



}
