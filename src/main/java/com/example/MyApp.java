package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService1", MessageService.class);
        MessageService messageService1 = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage().hashCode());
        System.out.println(messageService1.getMessage().hashCode());

        applicationContext.close();
    }
}
