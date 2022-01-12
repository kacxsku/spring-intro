package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        System.out.println(messageService.getMessage().hashCode());

        MessageService messageService1 = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService1.getMessage().hashCode());

    }
}