package com.example.email.model;

/**
 * @program: email
 * @description:
 * @author: WangX
 * @create: 2019-03-18 21:34
 **/
public class SendMessage {
    private String toUser;
    private String content;

    public SendMessage() {
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
