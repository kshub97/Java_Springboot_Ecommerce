package com.first.bean;

public class MyBean {

    private String myMessage;

    public void setMyMessage(String myMessage) {
        this.myMessage = myMessage;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "myMessage='" + myMessage + '\'' +
                '}';
    }
}
