package com.coupling.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextIOC.xml");

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithDataProvider");
        System.out.println("--> : " +userManagerWithDB.getUserInfo());

        UserManager webServiceProvider = (UserManager) context.getBean("userManagerWithWebDataProvider");
        System.out.println("--> : " +webServiceProvider.getUserInfo());

        UserManager newDatabaseProvider = (UserManager) context.getBean("userManagerWithNewDataProvider");
        System.out.println("--> : " +newDatabaseProvider.getUserInfo());

    }
}
