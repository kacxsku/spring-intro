package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component("messageService1")
public class RandomTextMessageService implements MessageService{

    ArrayList<String> listOfMessages = new ArrayList<>();

    private RandomTextMessageService() {
        this.listOfMessages.add("message 1");
        this.listOfMessages.add("message 2");
        this.listOfMessages.add("message 3");
        this.listOfMessages.add("message 4");
        this.listOfMessages.add("message 5");
        this.listOfMessages.add("message 6");
        this.listOfMessages.add("message 7");
        this.listOfMessages.add("message 8");
        this.listOfMessages.add("message 9");
        this.listOfMessages.add("message 10");
    }

    @Override
    public String getMessage() {
        Random random = new Random();
        return listOfMessages.get(random.nextInt(listOfMessages.size()));
    }
}