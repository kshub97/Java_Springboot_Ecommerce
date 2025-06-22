package com.first.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean bean= (MyBean) applicationContext.getBean("beanFirst");
        System.out.println(bean);

    }
}
