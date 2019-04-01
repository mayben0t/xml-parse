package com.spring.core.test;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-03-31 18:59
 **/
public class SAXParserHandler extends DefaultHandler {
    String value = null;
    User user = null;
    private ArrayList<User> userList = new ArrayList<User>();
    public ArrayList<User> getUserList(){
        return userList;
    }

    int userIndex = 0;

    /*
    用来标识解析开始
     */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("SAX解析 start");
    }

    /**
     * 用来标识解析结束
     * @throws SAXException
     */
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("SAX解析end");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //调用DefaultHandler类的startElement方法
        super.startElement(uri, localName, qName, attributes);
        if(qName.equals("user")){
            userIndex++;
            //创建一个user对象
            user=new User();
            //开始解析user元素的属性
            System.out.println("=========开始遍历一个人的内容==========");
            int num = attributes.getLength();
            for(int i=0;i<num;i++){
                System.out.print("user元素的第"+(i+1)+"个属性名是:"
                    +attributes.getQName(i));
                System.out.println("---属性值是："+attributes.getValue(i));
                if(attributes.getQName(i).equals("id")){
                    user.setId(Long.valueOf(attributes.getValue(i)));
                }
            }
        }
        else {

            System.out.print(qName+" :");
        }
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if(qName.equals("user")){
            userList.add(user);
            user = null;
            System.out.println("============结束遍历某一个人的内容==========");
        }else if(qName.equals("name")){
            user.setName(value);
        }else if(qName.equals("password")){
            user.setPassword(value);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        value = new String(ch,start,length);
        if(!value.trim().equals("")){
            System.out.println(value);
        }
    }
}
